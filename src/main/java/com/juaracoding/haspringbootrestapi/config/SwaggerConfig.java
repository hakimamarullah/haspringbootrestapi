package com.juaracoding.haspringbootrestapi.config;
/*
IntelliJ IDEA 2022.2.2 (Community Edition)
Build #IC-222.4167.29, built on September 13, 2022
Runtime version: 17.0.4+7-b469.53 amd64
@Author hakim a.k.a. Hakim Amarullah
Java Developer
Created on 8/3/2023 7:12 PM
@Last Modified 8/3/2023 7:12 PM
Version 1.0
*/


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.Collections;

@Configuration
public class SwaggerConfig {



    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("springboot-public")
                .packagesToScan("com.juaracoding.haspringbootrestapi.controller")
                .pathsToMatch("/**")
                .build();
    }

    //    ApiInfo(String title,
//    String description,
//    String version,
//    String termsOfServiceUrl,
//    String contactName,
//    String license,
//    String licenseUrl) {
    @Bean
    public OpenAPI springShopOpenAPI() {
        var contact = new Contact();
        contact.setEmail("hakimamarullah@gmail.com");
        contact.setName("Hakim Amarullah");
        return new OpenAPI()
                .info(new Info().title("SpringBootAPI")
                        .contact(contact)
                        .description("Spring JPA")
                        .version("v1.0")
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }


}

