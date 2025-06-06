package com.app;

import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Component
@Order(1)  // Optional: to control filter order
public class MyPreFilter implements GlobalFilter {

    private static final Logger logger = LoggerFactory.getLogger(MyPreFilter.class);

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        logger.info("MyPreFilter: filter() method executed...");

        ServerHttpRequest request = exchange.getRequest();
        HttpHeaders headers = request.getHeaders();

        headers.forEach((key, value) -> {
            logger.info("{} : {}", key, value);
        });

        return chain.filter(exchange);
    }
}
