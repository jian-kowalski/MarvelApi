package com.jiankowalski.marvel.api.assembler;

import com.jiankowalski.marvel.api.controller.CharacterComicController;
import com.jiankowalski.marvel.api.controller.CharacterController;
import com.jiankowalski.marvel.api.controller.CharacterEventController;
import com.jiankowalski.marvel.api.controller.CharacterSerieController;
import com.jiankowalski.marvel.api.controller.CharacterStoryController;
import com.jiankowalski.marvel.api.model.CharacterModel;
import com.jiankowalski.marvel.domain.model.Character;

import org.modelmapper.ModelMapper;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.stereotype.Component;

@Component
public class CharacterModelAssembler extends RepresentationModelAssemblerSupport<Character, CharacterModel> {

    private final ModelMapper modelMapper;

    public CharacterModelAssembler(ModelMapper modelMapper) {
        super(CharacterController.class, CharacterModel.class);
        this.modelMapper = modelMapper;
    }

    @Override
    public CharacterModel toModel(Character character) {
        CharacterModel characterModel = createModelWithId(character.getId(), character);

        modelMapper.map(character, characterModel);

        addLinkToRel(characterModel);

        return characterModel;
    }

    @Override
    public CollectionModel<CharacterModel> toCollectionModel(Iterable<? extends Character> entities) {
        return super.toCollectionModel(entities).add(WebMvcLinkBuilder.linkTo(CharacterController.class).withSelfRel());
    }

    private void addLinkToRel(CharacterModel characterModel) {
        addLinkToCharactersAll(characterModel);

        addlinkToComics(characterModel);

        addLinkToEvents(characterModel);

        addlinkToStorys(characterModel);

        addlinkToSeries(characterModel);
    }

    private void addLinkToEvents(CharacterModel characterModel) {
        if (!characterModel.getEvents().isEmpty()) {
            characterModel.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CharacterEventController.class)
                    .getEventsByCharacter(characterModel.getId())).withRel("events"));
        }
    }

    private void addlinkToComics(CharacterModel characterModel) {
        if (!characterModel.getComics().isEmpty()) {
            characterModel.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CharacterComicController.class)
                    .getComicsByCharacter(characterModel.getId())).withRel("comics"));
        }
    }

    private void addlinkToStorys(CharacterModel characterModel) {
        if (!characterModel.getStorys().isEmpty()) {
            characterModel.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CharacterStoryController.class)
                    .getStorysByCharacter(characterModel.getId())).withRel("storys"));
        }
    }

    private void addlinkToSeries(CharacterModel characterModel) {
        if (!characterModel.getSeries().isEmpty()) {
            characterModel.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CharacterSerieController.class)
                    .getSeriesByCharacter(characterModel.getId())).withRel("series"));
        }
    }

    private CharacterModel addLinkToCharactersAll(CharacterModel characterModel) {
        return characterModel.add(WebMvcLinkBuilder
                .linkTo(WebMvcLinkBuilder.methodOn(CharacterController.class).find(null)).withRel("characters"));
    }

}
