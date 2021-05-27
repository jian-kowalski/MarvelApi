package com.jiankowalski.marvel.api.assembler;

import com.jiankowalski.marvel.api.controller.CharacterComicController;
import com.jiankowalski.marvel.api.controller.CharacterController;
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

        characterModel.add(WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.methodOn(CharacterController.class).listar())
                .withRel("characters"));

        characterModel.getComics().forEach(comic -> {
            comic.add(WebMvcLinkBuilder
                    .linkTo(WebMvcLinkBuilder.methodOn(CharacterComicController.class).find(comic.getId()))
                    .withSelfRel());
        });

        return characterModel;
    }

    @Override
    public CollectionModel<CharacterModel> toCollectionModel(Iterable<? extends Character> entities) {
        return super.toCollectionModel(entities).add(WebMvcLinkBuilder.linkTo(CharacterController.class).withSelfRel());
    }
}
