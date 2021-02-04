package com.nwp.gateway.config;

import com.nwp.gateway.filter.TokenFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public TokenFilter tokenFilter(){
        return new TokenFilter();
    }
}
