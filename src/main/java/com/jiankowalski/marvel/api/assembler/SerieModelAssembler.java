package com.jiankowalski.marvel.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import com.jiankowalski.marvel.api.model.SerieModel;
import com.jiankowalski.marvel.domain.model.Serie;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class SerieModelAssembler {

    public SerieModel toModel(Serie serie) {
        var modelMapper = new ModelMapper();
        return modelMapper.map(serie, SerieModel.class);
    }

    public List<SerieModel> toCollectionModel(List<Serie> series) {
        return series.stream().map(this::toModel).collect(Collectors.toList());
    }

}
