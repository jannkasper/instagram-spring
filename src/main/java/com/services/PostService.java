package com.services;

import com.domain.DataContainer;
import com.domain.GraphqlContainer;
import com.api.model.EdgeListPostDTO;
import com.api.model.ShortcodeMediaDTO;

public interface PostService {

    GraphqlContainer getPost(String shortcode);

    ShortcodeMediaDTO getPostDTO(String shortcode);

    DataContainer getPostFeed(String shortcode, String userId, String first);

    EdgeListPostDTO getPostFeedDTO(String shortcode, String userId, String first);

}
