package com.api.mapper;

import com.domain.Hashtag;
import com.api.model.EdgeListPostDTO;
import com.api.model.HashtagDTO;
import org.springframework.core.convert.converter.Converter;

public class HashtagMapper implements Converter<Hashtag, HashtagDTO> {

    @Override
    public HashtagDTO convert(Hashtag source) {
        if (source == null) {
            return null;
        }

        final HashtagDTO hashtagDTO = new HashtagDTO();
        hashtagDTO.setId(source.getId());
        hashtagDTO.setTagName(source.getName());
        hashtagDTO.setTagImageUrl(source.getProfile_pic_url());

        if (source.getEdge_hashtag_to_media() != null) {
            hashtagDTO.setPostCount(source.getEdge_hashtag_to_media().getCount());
        }

        if (source.getEdge_hashtag_to_top_posts() != null && !source.getEdge_hashtag_to_top_posts().getEdges().isEmpty()) {
            EdgeListPostMapper converter = new EdgeListPostMapper();
            EdgeListPostDTO edgeListPostDTO = converter.convert(source.getEdge_hashtag_to_top_posts());

            hashtagDTO.setTopMedia(edgeListPostDTO);
        }

        if (source.getEdge_hashtag_to_media() != null && !source.getEdge_hashtag_to_media().getEdges().isEmpty()) {
            EdgeListPostMapper converter = new EdgeListPostMapper();
            EdgeListPostDTO edgeListPostDTO = converter.convert(source.getEdge_hashtag_to_media());

            hashtagDTO.setTimelineMedia(edgeListPostDTO);
        }
        return hashtagDTO;
    }
}