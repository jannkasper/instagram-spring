package com.api.mapper;

import com.domain.EdgeList;
import com.api.model.EdgeListLikeDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class EdgeListLikeMapper implements Converter<EdgeList<Object>, EdgeListLikeDTO> {

    @Override
    public EdgeListLikeDTO convert(EdgeList<Object> source) {
        if (source == null) {
            return null;
        }

        final EdgeListLikeDTO edgeListLikeDTO = new EdgeListLikeDTO();
        edgeListLikeDTO.setCount(source.getCount());
        return edgeListLikeDTO;
    }
}
