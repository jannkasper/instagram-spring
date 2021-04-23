package com.services;

import com.api.domain.GraphqlData;

public interface PostService {

    GraphqlData getPost(String shortcode);

}
