package com.dh.chat.contact.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Santiago Mamani
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("contatc-api")
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.dh.chat.contact.service.controller.api"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiEndPointsInfo())
                .useDefaultResponseMessages(false);
    }

    @Bean
    public Docket system() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("contatc-system")
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("com.dh.chat.contact.service.controller.system"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiEndPointsInfo())
                .useDefaultResponseMessages(false);
    }

    private ApiInfo apiEndPointsInfo() {

        return new ApiInfoBuilder()
                .title("Contact Service API")
                .description("Contact Management REST API ")
                .contact(new Contact("santiago", "", "sm.zeballos.umss@gmail.com"))
                .version("1.0.0")
                .license("Apache 1.0").licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
                .build();
    }
}
