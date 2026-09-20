package com.resqgrid.backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI resQGridOpenAPI() {

        return new OpenAPI()
                .info(new Info()
                        .title("ResQGrid API")
                        .version("1.0.0")
                        .description(
                                "Disaster Logistics & Resource Optimization System API")
                        .contact(new Contact()
                                .name("ResQGrid Development Team")));
    }
}