package com.services;

import com.api.domain.FeedData;
import com.api.domain.GraphqlData;
import com.commands.Edge_owner_to_timeline_mediaCommand;
import com.commands.Shortcode_mediaCommand;

public interface PostService {

    GraphqlData getPost(String shortcode);

    Shortcode_mediaCommand getPostCommand(String shortcode);

    FeedData getPostFeed(String shortcode, String userId, String first);

    Edge_owner_to_timeline_mediaCommand getEdge_owner_to_timeline_mediaCommand(String shortcode, String userId, String first);

}
