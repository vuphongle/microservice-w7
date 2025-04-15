package vn.edu.iuh.fit.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class named {@link GatewayConfig} for setting up API Gateway routes.
 */
@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("payment-service", r -> r.path("/payments/**")
                        .uri("lb://payment-service"))
                .route("inventory-service", r -> r.path("/inventory/**")
                        .uri("lb://inventory-service"))
                .build();
    }

}