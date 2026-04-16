package com.AML_3B.DEMO_JWT.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            // ❌ Disable CSRF (IMPORTANT for Postman)
            .csrf(csrf -> csrf.disable())

            // ❌ Disable default login form
            .formLogin(form -> form.disable())

            // ❌ Disable HTTP Basic auth
            .httpBasic(basic -> basic.disable())

            // ✅ Allow login endpoint
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/login").permitAll()
                .anyRequest().authenticated()
            );

        return http.build();
    }
}