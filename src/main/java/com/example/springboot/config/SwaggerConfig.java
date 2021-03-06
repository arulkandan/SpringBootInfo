package com.example.springboot.config;

import static com.google.common.base.Predicates.or;
import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicate;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("public-api")
				.apiInfo(apiInfo()).select().paths(PathSelectors.regex("/index.*")).build().pathMapping("/");
	}

	

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Title : digital-documents")
				.description("DocHub Microservices")
				.termsOfServiceUrl("http://digital-documents.digitalchannel-qv.svc:8080/digital/api/auth/v1/documents/")
				.contact("arulkkanthansk_kaliyaperumal@keybank.com").license("KeyBank License")
				.licenseUrl("arulkkanthansk_kaliyaperumal@keybank.com").version("1.0").build();
	}
}
