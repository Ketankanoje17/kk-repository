package auth.oauth2;

import com.mahindrafinance.entitymaster.config.CorsConfig;
import com.mahindrafinance.entitymaster.config.NoAuthUrlConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.oauth2.client.*;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.server.resource.web.BearerTokenResolver;
import org.springframework.security.oauth2.server.resource.web.DefaultBearerTokenResolver;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.ReferrerPolicyHeaderWriter;
import org.springframework.web.cors.CorsConfiguration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@ConditionalOnProperty(value = "auth.oauth2.enabled")
public class OAuth2LoginSecurityConfig {
    private final CustomOpaqueTokenAuthenticationConverter customOpaqueTokenAuthenticationConverter;
    private final NoAuthUrlConfiguration noAuthUrlConfiguration;
    private final CorsConfig corsConfig;

    private static final String[] WHITELISTED_WEB_URLS = { "/actuator/**", "/v3/api-docs/**", "/swagger-ui/**", "/v2/api-docs/**",
            "/swagger-resources/**", "/swagger-ui.html", "/v1/batch-process/**" };

    public OAuth2LoginSecurityConfig(CustomOpaqueTokenAuthenticationConverter customOpaqueTokenAuthenticationConverter,
                                     NoAuthUrlConfiguration noAuthUrlConfiguration,
                                     CorsConfig corsConfig) {
        this.customOpaqueTokenAuthenticationConverter = customOpaqueTokenAuthenticationConverter;
        this.noAuthUrlConfiguration = noAuthUrlConfiguration;
        this.corsConfig = corsConfig;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        List<String> noAuthUrl = new ArrayList<>();
        noAuthUrl.addAll(noAuthUrlConfiguration.getUrls());


        http.headers(header -> header	.contentSecurityPolicy(
                        contentSecurityPolicyConfig -> contentSecurityPolicyConfig.policyDirectives(
                                "default-src 'self'"))
                .httpStrictTransportSecurity( hstsConfig -> hstsConfig.includeSubDomains(true).maxAgeInSeconds(63072000))
                .referrerPolicy(referrerPolicyConfig -> referrerPolicyConfig.policy(
                        ReferrerPolicyHeaderWriter.ReferrerPolicy.STRICT_ORIGIN_WHEN_CROSS_ORIGIN)));

        http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(
                        authorize -> authorize.requestMatchers(noAuthUrl.toArray(String[]::new)).permitAll().anyRequest().authenticated())
                .oauth2ResourceServer(oauth2 -> oauth2.bearerTokenResolver(bearerTokenResolver()).opaqueToken(
                        token -> token.authenticationConverter(customOpaqueTokenAuthenticationConverter)))
                .exceptionHandling(Customizer.withDefaults());

        http.sessionManagement(sessionManagement -> sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        http.cors(cors -> cors.configurationSource(request -> {
            CorsConfiguration configuration = new CorsConfiguration();
            configuration.setAllowedOriginPatterns(corsConfig.getAllowedOrigins());
            configuration.setAllowedMethods(corsConfig.getAllowedMethods());
            configuration.setAllowedHeaders(corsConfig.getAllowedHeaders());
            configuration.setExposedHeaders(corsConfig.getExposedHeaders());
            return configuration;
        })).csrf(AbstractHttpConfigurer::disable);
        return http.build();
    }

    @Bean
    OAuth2AuthorizedClientManager authorizedClientManager(ClientRegistrationRepository clients) {
        OAuth2AuthorizedClientService service = new InMemoryOAuth2AuthorizedClientService(clients);
        AuthorizedClientServiceOAuth2AuthorizedClientManager manager = new AuthorizedClientServiceOAuth2AuthorizedClientManager(clients,
                service);
        OAuth2AuthorizedClientProvider authorizedClientProvider = OAuth2AuthorizedClientProviderBuilder	.builder().clientCredentials()
                .build();
        manager.setAuthorizedClientProvider(authorizedClientProvider);
        return manager;
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return web -> web	.ignoring().requestMatchers(WHITELISTED_WEB_URLS)
                .requestMatchers(HttpMethod.POST, noAuthUrlConfiguration.getUrls().toArray(String[]::new));
    }

    @Bean
    BearerTokenResolver bearerTokenResolver() {
        return new DefaultBearerTokenResolver();
    }
}
