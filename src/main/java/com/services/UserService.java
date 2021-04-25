package com.services;

import com.api.domain.EntryData;
import com.api.domain.UserData;
import com.commands.UserCommand;

public interface UserService {

    UserData getUserMedia();

    UserCommand getUserMediaCommand();

    EntryData getUser(String username);
}
