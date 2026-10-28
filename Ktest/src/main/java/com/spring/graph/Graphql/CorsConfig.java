package com.spring.graph.Graphql;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig {

	 @Bean
	    public WebMvcConfigurer corsConfigurer() {
	        return new WebMvcConfigurer() {
	            @Override
	            public void addCorsMappings(CorsRegistry registry) {
	                registry.addMapping("/graphql/**")   // Allow GraphQL API
	                        .allowedOrigins("http://localhost:4000", "https://chief-snake-exciting.ngrok-free.app") // change as needed
	                        .allowedMethods("GET", "POST", "OPTIONS", "PUT", "DELETE")
	                        .allowedHeaders("*")
	                        .allowCredentials(true);
	                
	                // If you also need graphiql UI:
	                registry.addMapping("/graphiql/**")
	                        .allowedOrigins("http://localhost:4000")
	                        .allowedMethods("GET", "POST", "OPTIONS")
	                        .allowedHeaders("*");
	            }
	        };
	    }
}