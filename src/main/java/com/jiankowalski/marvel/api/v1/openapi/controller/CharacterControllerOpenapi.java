package com.jiankowalski.marvel.api.v1.openapi.controller;

import com.jiankowalski.marvel.api.exceptionhandler.Problem;
import com.jiankowalski.marvel.api.v1.model.CharacterModel;
import com.jiankowalski.marvel.domain.repository.filter.CharacterFilter;

import org.springframework.data.domain.Pageable;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "/v1/public/characters")
public interface CharacterControllerOpenapi {

    @ApiOperation("Fetches lists of comic characters with optional filters. See notes on individual parameters below")
    PagedModel<CharacterModel> find(CharacterFilter filter, Pageable pageable);

    @ApiOperation("Fetches a single character by id")
    @ApiResponses({
		@ApiResponse(code = 404, message = "Character not found for cód: ", response = Problem.class)
	})
    public CharacterModel getCharacterById(@ApiParam(value = "A single character id.", example = "1", required = true)
        @PathVariable Long characterId);

}
