package com.services;

import com.api.domain.GraphqlData;

public interface TagService {

    GraphqlData getTag(String tag);
}
