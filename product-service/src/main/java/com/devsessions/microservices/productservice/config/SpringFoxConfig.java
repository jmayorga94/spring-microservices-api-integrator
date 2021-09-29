package com.devsessions.microservices.productservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@EnableSwagger2
public class SpringFoxConfig implements WebMvcConfigurer {
    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
    		.apiInfo(metaData())
            .select()
            //.apis(RequestHandlerSelectors.any())
            .apis(RequestHandlerSelectors.basePackage("com.devsessions.microservices.presentation"))
            .paths(PathSelectors.any())
            .build();
	}

    private ApiInfo metaData() {

        return new ApiInfoBuilder()
	        .title("Product API")
	        .description("Product API ")
	        .version("1.0.0")
	        .license("Apache 2.0")
	        .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0")       
	        .build();
    }
}
