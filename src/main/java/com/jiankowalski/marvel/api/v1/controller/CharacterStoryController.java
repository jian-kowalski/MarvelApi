package com.jiankowalski.marvel.api.v1.controller;

import java.util.List;

import com.jiankowalski.marvel.api.v1.assembler.StoryModelAssembler;
import com.jiankowalski.marvel.api.v1.model.StoryModel;
import com.jiankowalski.marvel.api.v1.openapi.controller.CharacterStoryControllerOpenapi;
import com.jiankowalski.marvel.domain.service.CharacterService;
import com.jiankowalski.marvel.domain.service.StoryService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/characters/{characterId}/stories", produces = "application/json;charset=UTF-8")
public class CharacterStoryController implements CharacterStoryControllerOpenapi {

    private final CharacterService characterService;
    private final StoryService storyService;
    private final StoryModelAssembler storyModelAssembler;

    public CharacterStoryController(CharacterService characterService, StoryService storyService,
            StoryModelAssembler storyModelAssembler) {
        this.characterService = characterService;
        this.storyService = storyService;
        this.storyModelAssembler = storyModelAssembler;
    }

    @GetMapping
    public List<StoryModel> getStoriesByCharacter(@PathVariable Long characterId) {
        var character = characterService.findById(characterId);
        return storyModelAssembler.toCollectionModel(storyService.findByCharacter(character));

    }

}
