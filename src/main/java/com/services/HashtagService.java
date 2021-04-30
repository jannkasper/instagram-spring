package com.services;

import com.domain.GraphqlContainer;
import com.api.model.HashtagDTO;

public interface HashtagService {

    GraphqlContainer getHashtag(String tag);

    HashtagDTO getHashtagDTO(String tag);

}
