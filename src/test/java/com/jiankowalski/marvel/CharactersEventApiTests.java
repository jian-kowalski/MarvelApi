package com.jiankowalski.marvel;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.hamcrest.Matchers;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CharactersEventApiTests {

	private static final Integer ID_CHARACTER_EXISTING = 1;
	private static final Integer ID_CHARACTER_NONEXISTENT = 100;

	@LocalServerPort
	private int port;

	@BeforeEach
	void setUp() {
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		RestAssured.port = port;
		RestAssured.basePath = "/v1/public/characters/{characterId}/events";
	}

	@Test
    public void deveRetornarStatus200_QuandoConsultaEventCharactersExistente() {
        RestAssured.given()
				.pathParam("characterId", ID_CHARACTER_EXISTING)
                .accept(ContentType.JSON)
                .when()
                .get()
                .then()
                .statusCode(HttpStatus.OK.value());
    }

	@Test
    public void deveRetornarStatus404_QuandoConsultaEventCharactersInexistente() {
        RestAssured.given()
				.pathParam("characterId", ID_CHARACTER_NONEXISTENT)
                .accept(ContentType.JSON)
                .when()
                .get()
                .then()
                .statusCode(HttpStatus.NOT_FOUND.value());
    }

	@Test
    public void testarComicNaoNulos() {
        RestAssured.given()
				.pathParam("characterId", ID_CHARACTER_EXISTING)
                .accept(ContentType.JSON)
                .when()
                .get()
                .then()
                .body("", Matchers.notNullValue());
    }

}
