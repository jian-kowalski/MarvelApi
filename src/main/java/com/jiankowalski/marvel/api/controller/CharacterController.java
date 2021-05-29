package com.jiankowalski.marvel.api.controller;

import com.jiankowalski.marvel.api.assembler.CharacterModelAssembler;
import com.jiankowalski.marvel.api.model.CharacterModel;
import com.jiankowalski.marvel.core.data.PageWrapper;
import com.jiankowalski.marvel.domain.model.Character;
import com.jiankowalski.marvel.domain.repository.filter.CharacterFilter;
import com.jiankowalski.marvel.domain.service.CharacterService;
import com.jiankowalski.marvel.infrastructure.repository.spec.CharacterSpecs;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    private final CharacterService characterService;

    private final CharacterModelAssembler characterModelAssembler;

    private final PagedResourcesAssembler<Character> pagedResourcesAssembler;

    public CharacterController(CharacterService characterService, CharacterModelAssembler characterModelAssembler,
            PagedResourcesAssembler<Character> pagedResourcesAssembler) {
        this.characterService = characterService;
        this.characterModelAssembler = characterModelAssembler;
        this.pagedResourcesAssembler = pagedResourcesAssembler;
    }

    @GetMapping
    public PagedModel<CharacterModel> find(CharacterFilter filter, Pageable pageable) {

        Page<Character> charactersPage = characterService.findAll(
				CharacterSpecs.filter(filter), pageable);
		
        charactersPage = new PageWrapper<>(charactersPage, pageable);
		
		return pagedResourcesAssembler.toModel(charactersPage, characterModelAssembler);
    }

    @GetMapping("/{characterId}")
    public CharacterModel getCharacterById(@PathVariable Long characterId) {
        return characterModelAssembler.toModel(characterService.findById(characterId));
    }

}
