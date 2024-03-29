package com.example.demo.global.filters;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;


@Component
public class AuthenticationFilter implements GlobalFilter {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

		
		boolean result = exchange.getRequest().getURI().getRawPath().contains("drivers");
		
		if(result) {
			
			exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);//cab-driver-service cannot give any 
			//response because it is unauthorized
			
			return exchange.getResponse().setComplete();
		}
		
		//return chain.filter(exchange);
		
		return chain.filter(exchange).then(Mono.fromRunnable(()->{
			 
			System.out.println("Post Filter Called");
			
			
			exchange.getResponse().getHeaders().add("itsMe", "Set by filter");
			System.out.println(exchange.getResponse().getHeaders().getContentType());
		}
				
				));
	
	}

}
