package auth.fakeauth;

import com.mahindrafinance.entitymaster.auth.MyUserDetailsService;
import com.mahindrafinance.entitymaster.config.CorsConfig;
import com.mahindrafinance.entitymaster.config.NoAuthUrlConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.ReferrerPolicyHeaderWriter;
import org.springframework.security.web.header.writers.XXssProtectionHeaderWriter;
import org.springframework.web.cors.CorsConfiguration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
@ConditionalOnProperty(value = "auth.basic")
public class CustomWebSecurityConfigurerAdapter {
    private static final String[] WHITELISTED_WEB_URLS = {"/actuator/**", "/v3/api-docs/**", "/swagger-ui/**", "/v2/api-docs/**", "/swagger-resources/**", "/swagger-ui.html", "/v1/batch-process/**"};
    private static final String ENTITY_MASTER_SERVICE_URLS = "/universal-bknd/v1/entity-master-service/**";

    private final MyBasicAuthenticationEntryPoint authenticationEntryPoint;
    private final CustomAccessDeniedHandler accessDeniedHandler;
    private final MyUserDetailsService myUserDetailsService;
    private final NoAuthUrlConfiguration noAuthUrlConfiguration;
    private final CorsConfig corsConfig;

    public CustomWebSecurityConfigurerAdapter(MyBasicAuthenticationEntryPoint authenticationEntryPoint,
                                              CustomAccessDeniedHandler accessDeniedHandler,
                                              MyUserDetailsService myUserDetailsService,
                                              NoAuthUrlConfiguration noAuthUrlConfiguration, CorsConfig corsConfig) {
        this.authenticationEntryPoint = authenticationEntryPoint;
        this.accessDeniedHandler = accessDeniedHandler;
        this.myUserDetailsService = myUserDetailsService;
        this.noAuthUrlConfiguration = noAuthUrlConfiguration;
        this.corsConfig = corsConfig;
    }

    @Bean
    @Deprecated
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        List<String> noAuthUrl = new ArrayList<>(noAuthUrlConfiguration.getUrls());

        // Security Headers Configuration
        http.headers(headers -> {
            headers.contentSecurityPolicy(csp -> csp.policyDirectives("default-src 'self'"));
            headers.referrerPolicy(referrer -> referrer.policy(ReferrerPolicyHeaderWriter.ReferrerPolicy.STRICT_ORIGIN_WHEN_CROSS_ORIGIN));
            headers.xssProtection(xss -> xss.headerValue(XXssProtectionHeaderWriter.HeaderValue.ENABLED_MODE_BLOCK));
            headers.httpStrictTransportSecurity(hstsConfig -> hstsConfig.includeSubDomains(true).maxAgeInSeconds(31536000));
        });

        // CSRF Disabled and Authorization Configuration
        http.csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(authz ->
                        authz.requestMatchers(request -> "OPTIONS".equalsIgnoreCase(request.getMethod())).denyAll()
                                .requestMatchers(noAuthUrl.toArray(String[]::new)).permitAll() // Permit URLs in noAuthUrl list
                                .requestMatchers(ENTITY_MASTER_SERVICE_URLS).authenticated() // Authenticate all APIs under /entity-master-service
                                .anyRequest().authenticated())
                .httpBasic(httpBasic -> httpBasic.authenticationEntryPoint(authenticationEntryPoint))
                .exceptionHandling(ex -> ex.accessDeniedHandler(accessDeniedHandler));

        // User Details Service Configuration
        http.userDetailsService(myUserDetailsService);

        // Stateless Session Management
        http.sessionManagement(sessionManagement -> sessionManagement.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        // CORS Configuration
        http.cors(cors -> cors.configurationSource(request -> {
            CorsConfiguration configuration = new CorsConfiguration();
            configuration.setAllowedOriginPatterns(corsConfig.getAllowedOrigins());
            configuration.setAllowedMethods(corsConfig.getAllowedMethods());
            configuration.setAllowedHeaders(corsConfig.getAllowedHeaders());
            configuration.setExposedHeaders(corsConfig.getExposedHeaders());
            return configuration;
        }));

        return http.build();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return web -> web.ignoring()
                .requestMatchers(WHITELISTED_WEB_URLS) // Whitelisted URLs like Swagger and Actuator
                .requestMatchers(HttpMethod.POST, noAuthUrlConfiguration.getUrls().toArray(String[]::new));
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance(); // Use NoOpPasswordEncoder for plain-text passwords (not recommended for production)
    }
}
