package com.services;

import com.api.domain.GraphqlData;
import com.api.domain.profile.Profile;

public interface PostService {

    GraphqlData getPost(String shortcode);

}
