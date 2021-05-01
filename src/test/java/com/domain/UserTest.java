package com.domain;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTest {
    private static final String ID_VALUE = "id";
    private static final String USERNAME_VALUE = "username";

    User user;

    @Before
    public void setUp() {
        user = new User();
    }

    @Test
    public void getIdTest() {
        user.setId(ID_VALUE);

        Assertions.assertEquals(ID_VALUE, user.getId());
    }

    @Test
    public void getUsernameTest() {
        user.setUsername(USERNAME_VALUE);

        Assertions.assertEquals(USERNAME_VALUE, user.getUsername());
    }
}
