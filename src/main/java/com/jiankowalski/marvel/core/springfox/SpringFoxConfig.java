package com.jiankowalski.marvel.core.springfox;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SpringFoxConfig implements WebMvcConfigurer {

	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.jiankowalski.marvel.api"))
				.build()
				.apiInfo(apiInfoV1())
				.tags(new Tag("/v1/public/characters", "Fetches lists of characters"),
					  new Tag("/v1/public/characters/{characterId}/comics", "Fetches lists of comics filtered by a character id"),
					  new Tag("/v1/public/characters/{characterId}/events", "Fetches lists of events filtered by a character id"),
					  new Tag("/v1/public/characters/{characterId}/series", "Fetches lists of series filtered by a character id"),
					  new Tag("/v1/public/characters/{characterId}/stories", "Fetches lists of stories filtered by a character id"));
	}

	private ApiInfo apiInfoV1() {
		return new ApiInfoBuilder().title("Marvel API")
				.description("Reescrita dos endpoints de Characters da MarvelApi").version("1")
				.contact(new Contact("Jian Kowalski", "https://github.com/jian-kowalski", 
					"jian_kowalski@hotmail.com"))
				.build();
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}

}
