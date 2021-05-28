package com.jiankowalski.marvel.api.controller;

import java.util.List;

import com.jiankowalski.marvel.api.assembler.StoryModelAssembler;
import com.jiankowalski.marvel.api.model.StoryModel;
import com.jiankowalski.marvel.domain.service.CharacterService;
import com.jiankowalski.marvel.domain.service.StoryService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters/{characterId}/storys")
public class CharacterStoryController {

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
    public List<StoryModel> getStorysByCharacter(@PathVariable Long characterId) {
        var character = characterService.findById(characterId);
        return storyModelAssembler.toCollectionModel(storyService.findByCharacter(character));

    }

}
