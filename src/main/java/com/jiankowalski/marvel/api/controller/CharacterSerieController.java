package com.jiankowalski.marvel.api.controller;

import java.util.List;

import com.jiankowalski.marvel.api.assembler.SerieModelAssembler;
import com.jiankowalski.marvel.api.model.SerieModel;
import com.jiankowalski.marvel.domain.service.CharacterService;
import com.jiankowalski.marvel.domain.service.SerieService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters/{characterId}/series")
public class CharacterSerieController {

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
