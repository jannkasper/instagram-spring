package com.services;

import com.api.model.UserDTO;
import com.domain.EntryDataContainer;
import com.domain.UserContainer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    private static final String USERNAME_VALUE = "instagram";

    @Autowired
    private UserService userService;

    @Before
    public void setUp() {
    }

    @Test
    public void getUserTest() {
        EntryDataContainer entryDataContainer = userService.getUser(USERNAME_VALUE);
        assertNotNull(entryDataContainer);
        assertEquals(1, entryDataContainer.getEntry_data().getProfilePage().size());
        assertEquals(USERNAME_VALUE, entryDataContainer.getEntry_data().getProfilePage().get(0).getGraphql().getUser().getUsername());
    }

    @Test
    public void getUserDTOTest() {
        UserDTO userDTO = userService.getUserDTO(USERNAME_VALUE);
        assertNotNull(userDTO);
        assertEquals(USERNAME_VALUE, userDTO.getUsername());
    }

    @Test
    public void getUserFeedTest() {
        UserContainer userContainer = userService.getUserFeed();
        assertNotNull(userContainer);
        assertNotNull(userContainer.getUser().getEdge_web_feed_timeline());
    }

    @Test
    public void getUserFeedDTOTest() {
        UserDTO userDTO = userService.getUserFeedDTO();
        assertNotNull(userDTO);
        assertNotNull(userDTO.getPostArray());
    }
}
