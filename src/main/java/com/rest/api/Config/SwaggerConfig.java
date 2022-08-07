package com.rest.api.Config;

import io.swagger.annotations.Contact;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.*;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {

    @Bean
    public InternalResourceViewResolver defaultViewResolver() {
        return new InternalResourceViewResolver();
    }

//    public static final Contact SUPPORTED_CONTACTS = new Contact("Hadi","github.com/hadipsy27","hadipsy27@gmail.com");

    @Bean
    public Docket newApi(){
        Set Produsers = new HashSet<>(Arrays.asList("application/json"));
        Set Consums = new HashSet<>(Arrays.asList("application/json"));
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .produces(Produsers)
                .consumes(Consums);
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("Employee service")
                .description("Employee service with Swagger Documentation")
                .termsOfServiceUrl("mailto:hadipsy27@gmail.com")
                .contact(null)
                .license("Employee Licence Version 1.0")
                .licenseUrl("https://github.com/hadipsy27/springboot-employee/blob/409ddcba56b0cbb0a32e84f563dc90b726e7e157/LICENSE.md")
                .version("3.0")
                .build();
    }
}
