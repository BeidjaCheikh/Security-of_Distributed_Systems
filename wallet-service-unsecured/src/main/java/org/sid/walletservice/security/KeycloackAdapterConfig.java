package org.sid.walletservice.security;

import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
class KeycloackAdapterConfig {
    @Bean
    KeycloakSpringBootConfigResolver keycloakSpringBootConfigResolver(){
        return new KeycloakSpringBootConfigResolver();
    }
}

