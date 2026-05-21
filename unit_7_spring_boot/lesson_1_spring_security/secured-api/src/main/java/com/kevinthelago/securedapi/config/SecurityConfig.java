package com.kevinthelago.securedapi.config;

import com.kevinthelago.securedapi.filter.ApiKeyAuthenticationFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@Order(1)
public class SecurityConfig {

    @Value("${env.http.security.apiKey.header}")
    private String apiKeyHeader;

    @Value("${env.http.security.apiKey.value}")
    private String apiKeyValue;

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        ApiKeyAuthenticationFilter apiKeyAuthenticationFilter = new ApiKeyAuthenticationFilter(apiKeyHeader);

        apiKeyAuthenticationFilter.setAuthenticationManager(new AuthenticationManager() {
            @Override
            public Authentication authenticate(Authentication authentication) throws AuthenticationException {
                // ToDo: If not user
                String principle = (String) authentication.getPrincipal();

                if (!apiKeyValue.equals(principle)) {
                    throw new BadCredentialsException("nope");
                }

                authentication.setAuthenticated(true);
                return authentication;
            }
        });

        httpSecurity.csrf().disable().sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().addFilter(apiKeyAuthenticationFilter).authorizeHttpRequests().anyRequest().authenticated();
        return httpSecurity.build();
    }

}
