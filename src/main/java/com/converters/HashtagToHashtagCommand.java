package com.converters;

import com.api.domain.Hashtag;
import com.commands.Edge_owner_to_timeline_mediaCommand;
import com.commands.HashtagCommand;
import org.springframework.core.convert.converter.Converter;

public class HashtagToHashtagCommand implements Converter<Hashtag, HashtagCommand> {

    @Override
    public HashtagCommand convert(Hashtag source) {
        if (source == null) {
            return null;
        }

        final HashtagCommand hashtagCommand = new HashtagCommand();
        hashtagCommand.setId(source.getId());
        hashtagCommand.setTagName(source.getName());
        hashtagCommand.setTagImageUrl(source.getProfile_pic_url());

        if (source.getEdge_hashtag_to_media() != null) {
            hashtagCommand.setPostCount(source.getEdge_hashtag_to_media().getCount());
        }

        if (source.getEdge_hashtag_to_top_posts() != null && !source.getEdge_hashtag_to_top_posts().getEdges().isEmpty()) {
            Edge_owner_to_timeline_mediaToEdge_owner_to_timeline_mediaCommand converter = new Edge_owner_to_timeline_mediaToEdge_owner_to_timeline_mediaCommand();
            Edge_owner_to_timeline_mediaCommand edge_owner_to_timeline_mediaCommand = converter.convert(source.getEdge_hashtag_to_top_posts());

            hashtagCommand.setTopMedia(edge_owner_to_timeline_mediaCommand);
        }

        if (source.getEdge_hashtag_to_media() != null && !source.getEdge_hashtag_to_media().getEdges().isEmpty()) {
            Edge_owner_to_timeline_mediaToEdge_owner_to_timeline_mediaCommand converter = new Edge_owner_to_timeline_mediaToEdge_owner_to_timeline_mediaCommand();
            Edge_owner_to_timeline_mediaCommand edge_owner_to_timeline_mediaCommand = converter.convert(source.getEdge_hashtag_to_media());

            hashtagCommand.setTimelineMedia(edge_owner_to_timeline_mediaCommand);
        }
        return hashtagCommand;
    }
}