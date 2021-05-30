package com.jiankowalski.marvel.api;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.hamcrest.Matchers;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CharactersStoryApiTests {

	private static final Integer ID_CHARACTER_EXISTING = 1;
	private static final Integer ID_CHARACTER_NONEXISTENT = 100;

	@LocalServerPort
	private int port;

	@BeforeEach
	void setUp() {
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		RestAssured.port = port;
		RestAssured.basePath = "/v1/public/characters/{characterId}/stories";
	}

	@Test
    public void deveRetornarStatus200_QuandoConsultaStoryCharactersExistente() {
        RestAssured.given()
				.pathParam("characterId", ID_CHARACTER_EXISTING)
                .accept(ContentType.JSON)
                .when()
                .get()
                .then()
                .statusCode(HttpStatus.OK.value());
    }

	@Test
    public void deveRetornarStatus404_QuandoConsultaStoryCharactersInexistente() {
        RestAssured.given()
				.pathParam("characterId", ID_CHARACTER_NONEXISTENT)
                .accept(ContentType.JSON)
                .when()
                .get()
                .then()
                .statusCode(HttpStatus.NOT_FOUND.value());
    }

	@Test
    public void testarStoryNaoNulos() {
        RestAssured.given()
				.pathParam("characterId", ID_CHARACTER_EXISTING)
                .accept(ContentType.JSON)
                .when()
                .get()
                .then()
                .body("", Matchers.notNullValue());
    }

}
