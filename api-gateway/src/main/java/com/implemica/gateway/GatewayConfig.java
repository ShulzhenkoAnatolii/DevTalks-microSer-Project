package com.implemica.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("eureka-first", r -> r.path("/api/first/**")
                        .uri("lb://eureka-first"))
                .route("eureka-second", r -> r.path("/api/first/**")
                        .uri("lb://eureka-second"))
                .build();
    }
}
