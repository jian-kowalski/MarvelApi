package com.jiankowalski.marvel.api.v1.controller;

import java.util.List;

import com.jiankowalski.marvel.api.v1.assembler.EventModelAssembler;
import com.jiankowalski.marvel.api.v1.model.EventModel;
import com.jiankowalski.marvel.api.v1.openapi.controller.CharacterEventControllerOpenapi;
import com.jiankowalski.marvel.domain.service.CharacterService;
import com.jiankowalski.marvel.domain.service.EventService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/characters/{characterId}/events", produces = "application/json;charset=UTF-8")
public class CharacterEventController implements CharacterEventControllerOpenapi {

    private final CharacterService characterService;
    private final EventService eventService;
    private final EventModelAssembler eventModelAssembler;

    public CharacterEventController(CharacterService characterService, EventService eventService,
            EventModelAssembler eventModelAssembler) {
        this.characterService = characterService;
        this.eventService = eventService;
        this.eventModelAssembler = eventModelAssembler;
    }

    @GetMapping
    public List<EventModel> getEventsByCharacter(@PathVariable Long characterId) {
        var character = characterService.findById(characterId);
        return eventModelAssembler.toCollectionModel(eventService.findByCharacter(character));

    }

}
