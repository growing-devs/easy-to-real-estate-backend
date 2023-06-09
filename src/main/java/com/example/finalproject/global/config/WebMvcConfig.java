package com.example.finalproject.global.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    private final long MAX_AGE_SECS = 3600;

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOriginPatterns("http://localhost:3000", "https://zesty-faun-019504.netlify.app/")
                .allowedHeaders("*")
                .allowedMethods("*")
                //.allowCredentials(true)
                .maxAge(MAX_AGE_SECS);
    }
}
