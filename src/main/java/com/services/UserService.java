package com.services;

import com.api.domain.GraphqlData;
import com.api.domain.UserData;
import com.commands.UserCommand;

public interface UserService {

    UserData getUserMedia();

    UserCommand getUserMediaCommand();

    com.api.domain.test.UserData getUser(String username);
}
