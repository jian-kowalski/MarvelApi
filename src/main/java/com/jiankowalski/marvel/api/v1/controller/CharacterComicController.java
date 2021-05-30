package com.jiankowalski.marvel.api.v1.controller;

import java.util.List;

import com.jiankowalski.marvel.api.v1.assembler.ComicModelAssembler;
import com.jiankowalski.marvel.api.v1.model.ComicModel;
import com.jiankowalski.marvel.api.v1.openapi.controller.CharacterComicControllerOpenapi;
import com.jiankowalski.marvel.domain.model.Character;
import com.jiankowalski.marvel.domain.service.CharacterService;
import com.jiankowalski.marvel.domain.service.ComicService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/characters/{characterId}/comics", produces = "application/json;charset=UTF-8")
public class CharacterComicController implements CharacterComicControllerOpenapi {

    private final CharacterService characterService;
    private final ComicService comicService;
    private final ComicModelAssembler comicModelAssembler;

    public CharacterComicController(CharacterService characterService, ComicModelAssembler comicModelAssembler,
            ComicService comicService) {
        this.characterService = characterService;
        this.comicService = comicService;
        this.comicModelAssembler = comicModelAssembler;
    }

    @GetMapping
    public List<ComicModel> getComicsByCharacter(@PathVariable Long characterId) {
        Character character = characterService.findById(characterId);
        return comicModelAssembler.toCollectionModel(comicService.findByCharacter(character));

    }

}
