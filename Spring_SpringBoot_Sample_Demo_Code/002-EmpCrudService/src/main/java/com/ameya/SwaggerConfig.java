package com.ameya;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket employeeCRUDApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ameya.controllers"))
                .paths(paths())
                .build()
                .apiInfo(metaData());
    }
 // Only select apis that matches the given Predicates.
    private Predicate<String> paths() {
    // Match all paths with /employees except /error
        return Predicates.and
        		(
        				PathSelectors.regex("/employees.*"),
        				Predicates.not(PathSelectors.regex("/error.*"))
        		);
        }
    
    private ApiInfo metaData() {
        ApiInfo apiInfo = new ApiInfo(
                "Spring Boot REST API",
                "Spring Boot REST API for EmployeeCRUDService",
                "1.0",
                "Terms of service",
                new Contact("Ameya Joshi", "https://ameyajoshi.com/about/", "ameya@ameyajoshi.com"),
               "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0");
        return apiInfo;
    }
}