package com.domain;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationTest {
    private static final String ID_VALUE = "id";
    private static final String NAME_VALUE = "name";

    Location location;

    @Before
    public void setUp() {
        location = new Location();
    }

    @Test
    public void getIdTest() {
        location.setId(ID_VALUE);

        Assertions.assertEquals(ID_VALUE, location.getId());
    }

    @Test
    public void getUsernameTest() {
        location.setName(NAME_VALUE);

        Assertions.assertEquals(NAME_VALUE, location.getName());
    }
}
