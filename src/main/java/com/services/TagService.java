package com.services;

import com.api.domain.GraphqlData;
import com.commands.HashtagCommand;

public interface TagService {

    GraphqlData getTag(String tag);

    HashtagCommand getTagCommand(String tag);

}
