package com.services;

import com.domain.EntryDataContainer;
import com.domain.UserContainer;
import com.api.model.UserDTO;

public interface UserService {

    UserContainer getUserFeed();

    UserDTO getUserFeedDTO();

    EntryDataContainer getUser(String username);

    UserDTO getUserDTO(String username);
}
