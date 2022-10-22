package com.gateway.filters;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class EmployeeFilter extends AbstractGatewayFilterFactory<EmployeeFilter.Config> {

  public static class Config {
  }

  public EmployeeFilter() {
    super(Config.class);
  }

  @Override
  public GatewayFilter apply(Config config) {
    // Pre filter
    return (exchange, chain) -> {
      log.info("*".repeat(100) + " \nPre filter. Path: " + exchange.getRequest().getPath() + "\n" + "*".repeat(100));

      // post filter
      return chain.filter(exchange)
        .then(Mono.fromRunnable(() -> {
          log.info("*".repeat(100) + "\nPost filter.\n" + "*".repeat(100));
        }));
    };
  }
}
