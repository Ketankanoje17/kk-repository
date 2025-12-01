package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.header.writers.ReferrerPolicyHeaderWriter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.headers(header -> header	.contentSecurityPolicy(
                        contentSecurityPolicyConfig -> contentSecurityPolicyConfig.policyDirectives(
                                "default-src 'self'"))
                .httpStrictTransportSecurity( hstsConfig -> hstsConfig.includeSubDomains(true).maxAgeInSeconds(63072000))
                .referrerPolicy(referrerPolicyConfig -> referrerPolicyConfig.policy(
                        ReferrerPolicyHeaderWriter.ReferrerPolicy.STRICT_ORIGIN_WHEN_CROSS_ORIGIN)));

        return http.build();
    }
}