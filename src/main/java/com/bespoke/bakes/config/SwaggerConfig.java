package com.bespoke.bakes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
public class SwaggerConfig {

    @Bean
    public Docket admin() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Admin")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bespoke.bakes.controller"))
                .paths(PathSelectors.ant("/admin/**"))
                .build();
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("API v1")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bespoke.bakes.controller"))
                .paths(PathSelectors.ant("/api/v1/**"))
                .build();
    }

    @Bean
    public Docket login() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Login")
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.bespoke.bakes.controller"))
                .paths(PathSelectors.ant("/login/**"))
                .build();
    }
}
