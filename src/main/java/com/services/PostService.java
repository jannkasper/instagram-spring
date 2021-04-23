package com.services;

import com.api.domain.GraphqlData;
import com.commands.Shortcode_mediaCommand;

public interface PostService {

    GraphqlData getPost(String shortcode);

    Shortcode_mediaCommand getPostCommand(String shortcode);
}
