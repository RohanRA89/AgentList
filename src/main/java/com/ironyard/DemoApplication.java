package com.ironyard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static com.google.common.collect.Lists.newArrayList;
import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public Docket PostApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("Agent-api")
				.apiInfo(apiInfo())
				.select()
				.paths(regex("/agents/*.*"))
				.build();



	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Welcome to Mission Impossible")
				.description("Welcome Agents")
				.termsOfServiceUrl("http://theironyard.com")
				.contact("Rohan Ayub")
				.license("Apache License Version 2.0")
				.licenseUrl("https://github.com/IBM-Bluemix/news-aggregator/blob/master/LICENSE")
				.version("2.1")
				.build();

	}
}