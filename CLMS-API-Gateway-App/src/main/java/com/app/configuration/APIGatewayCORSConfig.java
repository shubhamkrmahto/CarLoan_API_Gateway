package com.app.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class APIGatewayCORSConfig {

		@Bean
	    public CorsWebFilter corsWebFilter() {
	        CorsConfiguration config = new CorsConfiguration();
	        config.setAllowCredentials(true); // if using cookies/auth headers
	        config.addAllowedOrigin("http://localhost:5173"); // ONLY this origin
	        config.addAllowedHeader("*");
	        config.addAllowedMethod("*");

	        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
	        source.registerCorsConfiguration("/**", config);

	        return new CorsWebFilter(source);
	    }
	
}
