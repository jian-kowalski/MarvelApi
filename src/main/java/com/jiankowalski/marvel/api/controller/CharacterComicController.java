package com.jiankowalski.marvel.api.controller;

import java.util.List;

import com.jiankowalski.marvel.api.assembler.ComicModelAssembler;
import com.jiankowalski.marvel.api.model.ComicModel;
import com.jiankowalski.marvel.domain.model.Character;
import com.jiankowalski.marvel.domain.service.CharacterService;
import com.jiankowalski.marvel.domain.service.ComicService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters/{characterId}/comics")
public class CharacterComicController {

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
