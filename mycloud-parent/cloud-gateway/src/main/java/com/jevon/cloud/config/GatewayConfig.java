package com.jevon.cloud.config;

import com.jevon.cloud.filter.MyGlobalFilter;
import com.jevon.cloud.filter.RequestTimeFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(p -> p
                        .path("/test")
                        .filters(f -> f.filter(new RequestTimeFilter()).addResponseHeader("X-Response-Default-Foo", "Default-Bar"))
                        .uri("http://httpbin.org:80/get")
                        .order(0)
                        .id("customer_filter_router")
                 )
                .build();
    }


    @Bean
    public MyGlobalFilter myGlobalFilter(){
        return new MyGlobalFilter();
    }
}
