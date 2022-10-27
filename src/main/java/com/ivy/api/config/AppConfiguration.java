package com.ivy.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfiguration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:3000",
                        // Legacy
                        "https://ivyoracle.xyz",
                        "https://develop.ivyoracle.xyz",
                        // Flare
                        "https://flare.ivyoracle.xyz",
                        "https://flare-dev.ivyoracle.xyz",
                        // Songbird
                        "https://songbird.ivyoracle.xyz",
                        "https://songbird-dev.ivyoracle.xyz")
                .allowedMethods("*");
    }
}