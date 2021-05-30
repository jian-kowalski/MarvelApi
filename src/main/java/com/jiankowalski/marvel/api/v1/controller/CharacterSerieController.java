package com.jiankowalski.marvel.api.v1.controller;

import java.util.List;

import com.jiankowalski.marvel.api.v1.assembler.SerieModelAssembler;
import com.jiankowalski.marvel.api.v1.model.SerieModel;
import com.jiankowalski.marvel.api.v1.openapi.controller.CharacterSerieControllerOpenapi;
import com.jiankowalski.marvel.domain.service.CharacterService;
import com.jiankowalski.marvel.domain.service.SerieService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/characters/{characterId}/series")
public class CharacterSerieController implements CharacterSerieControllerOpenapi {

    private final CharacterService characterService;
    private final SerieService serieService;
    private final SerieModelAssembler serieModelAssembler;

    public CharacterSerieController(CharacterService characterService, SerieService serieService,
            SerieModelAssembler serieModelAssembler) {
        this.characterService = characterService;
        this.serieService = serieService;
        this.serieModelAssembler = serieModelAssembler;
    }

    @GetMapping
    public List<SerieModel> getSeriesByCharacter(@PathVariable Long characterId) {
        var character = characterService.findById(characterId);
        return serieModelAssembler.toCollectionModel(serieService.findByCharacter(character));

    }

}
