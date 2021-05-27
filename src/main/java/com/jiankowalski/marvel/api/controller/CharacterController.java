package com.jiankowalski.marvel.api.controller;

import com.jiankowalski.marvel.api.assembler.CharacterModelAssembler;
import com.jiankowalski.marvel.api.model.CharacterModel;
import com.jiankowalski.marvel.domain.service.CharacterService;

import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    private final CharacterService characterService;

    private final CharacterModelAssembler comicModelAssembler;

    public CharacterController(CharacterService characterService, CharacterModelAssembler comicModelAssembler) {
        this.characterService = characterService;
        this.comicModelAssembler = comicModelAssembler;
    }

    @GetMapping
    public CollectionModel<CharacterModel> listar() {
        return comicModelAssembler.toCollectionModel(characterService.findAll());
    }

    @GetMapping("/{characterId}")
    public CharacterModel find(@PathVariable Long characterId) {
        return comicModelAssembler.toModel(characterService.findById(characterId));
    }

}
