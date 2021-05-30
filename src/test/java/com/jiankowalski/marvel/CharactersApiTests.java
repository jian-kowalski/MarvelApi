package com.jiankowalski.marvel;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CharactersApiTests {

	private static final String ID_CHARACTER_EXISTING = "/1";
	private static final String ID_CHARACTER_NONEXISTENT = "/100";
	private static final String CAPITAO_DO_CODIGO = "Capitão do cód";
	private static final String ORDENACAO_POR_NOME = "name";
	private static final Integer ID_FILTER_CHARACTER = 2;
	


	@LocalServerPort
	private int port;

	@BeforeEach
	void setUp() {
		RestAssured.enableLoggingOfRequestAndResponseIfValidationFails();
		RestAssured.port = port;
		RestAssured.basePath = "/v1/public/characters";
	}

	@Test
	public void deveRetornarStatus200_QuandoConsultaTodosOsCharacters() {
		RestAssured
				.given()
				.accept(ContentType.JSON)
				.when()
				.get() 
				.then()
				.statusCode(HttpStatus.OK.value());
	}

	@Test
	public void deveRetornarStatus200_QuandoConsultaUmCharacterPorId() {
		RestAssured
			.given()
			.accept(ContentType.JSON)
			.when()
			.get(ID_CHARACTER_EXISTING) 
			.then()
			.statusCode(HttpStatus.OK.value());
	}

	@Test
	public void deveRetornarStatus404_QuandoConsultaUmCharacterQueNaoExiste() {
		RestAssured
			.given()
			.accept(ContentType.JSON)
			.when()
			.get(ID_CHARACTER_NONEXISTENT) 
			.then()
			.statusCode(HttpStatus.NOT_FOUND.value());
	}

	@Test
	public void deveRetornarStatus200_QuandoFiltrarUmCharacterQueNaoExiste() {
		RestAssured
			.given()
			.param("id", ID_FILTER_CHARACTER)
			.accept(ContentType.JSON)
			.when()
			.get() 
			.then()
			.statusCode(HttpStatus.OK.value());
	}

	@Test
	public void deveRetornarStatus200_QuandoFiltrarUmCharacterPOO() {
		RestAssured
			.given()
			.param("name", CAPITAO_DO_CODIGO)
			.accept(ContentType.JSON)
			.when()
			.get() 
			.then()
			.statusCode(HttpStatus.OK.value());
	}

	@Test
	public void deveRetornarStatus200_QuandoOrdenarPorNome() {
		RestAssured
			.given()
			.param("order",  ORDENACAO_POR_NOME)
			.accept(ContentType.JSON)
			.when()
			.get() 
			.then()
			.statusCode(HttpStatus.OK.value());
	}

}
