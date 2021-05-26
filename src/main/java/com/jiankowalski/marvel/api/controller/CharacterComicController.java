package com.jiankowalski.marvel.api.controller;

import java.util.List;

import com.jiankowalski.marvel.api.assembler.ComicModelAssembler;
import com.jiankowalski.marvel.api.model.ComicModel;
import com.jiankowalski.marvel.domain.service.CharacterService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters/{characterId}")
public class CharacterComicController {

    private final CharacterService characterService;
    private final ComicModelAssembler comicModelAssembler;
    
    public CharacterComicController(CharacterService characterService, ComicModelAssembler comicModelAssembler) {
        this.characterService = characterService;
        this.comicModelAssembler = comicModelAssembler;
    }


    @GetMapping("/comics")
    public List<ComicModel> buscar(@PathVariable Long characterId) {
        return comicModelAssembler.toCollectionModel(characterService.findComicsById(characterId));
    }
    
    
}
