package com.domain;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OwnerTest {
    private static final String ID_VALUE = "id";
    private static final String USERNAME_VALUE = "username";

    Owner owner;

    @Before
    public void setUp() {
        owner = new Owner();
    }

    @Test
    public void getIdTest() {
        owner.setId(ID_VALUE);

        Assertions.assertEquals(ID_VALUE, owner.getId());
    }

    @Test
    public void getUsernameTest() {
        owner.setUsername(USERNAME_VALUE);

        Assertions.assertEquals(USERNAME_VALUE, owner.getUsername());
    }
}
