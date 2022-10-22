// /*
//  * @author: Cesar Lopez
//  * @copyright 2022 Wayfair LLC - All rights reserved
//  */
// package com.gateway.filters;

// import org.springframework.cloud.gateway.filter.GatewayFilterChain;
// import org.springframework.cloud.gateway.filter.GlobalFilter;
// import org.springframework.stereotype.Component;
// import org.springframework.web.server.ServerWebExchange;

// import lombok.extern.slf4j.Slf4j;
// import reactor.core.publisher.Mono;

// @Slf4j
// @Component
// public class LoggingGlobalPreFilter implements GlobalFilter {

//   @Override
//   public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
//     log.info("~~~~~~~~~~~~~ Global Pre filter executed ~~~~~~~~~~~~`");
//     return chain.filter(exchange);
//   }

// }
