package com.jiankowalski.marvel.api.v1.assembler;

import java.util.List;
import java.util.stream.Collectors;

import com.jiankowalski.marvel.api.v1.model.ComicModel;
import com.jiankowalski.marvel.domain.model.Comic;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComicModelAssembler {

    public ComicModel toModel(Comic comic) {
        var modelMapper = new ModelMapper();
        return modelMapper.map(comic, ComicModel.class);
    }

    public List<ComicModel> toCollectionModel(List<Comic> comics) {
        return comics.stream().map(this::toModel).collect(Collectors.toList());
    }

}
