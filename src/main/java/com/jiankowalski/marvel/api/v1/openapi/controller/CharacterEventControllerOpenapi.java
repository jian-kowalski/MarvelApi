package com.jiankowalski.marvel.api.v1.openapi.controller;

import java.util.List;

import com.jiankowalski.marvel.api.exceptionhandler.Problem;
import com.jiankowalski.marvel.api.v1.model.EventModel;

import org.springframework.web.bind.annotation.PathVariable;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@Api(tags = "/v1/public/characters/{characterId}/events")
public interface CharacterEventControllerOpenapi {

    @ApiOperation("Fetches a single character by id")
    @ApiResponses({ @ApiResponse(code = 404, message = "Character not found for cód: ", response = Problem.class) })
    List<EventModel> getEventsByCharacter(
            @ApiParam(value = "A single character id.", example = "1", required = true) @PathVariable Long characterId);

}
