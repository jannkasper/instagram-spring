package com.mappers;

import com.api.mapper.UserMapper;
import com.api.model.UserDTO;
import com.domain.User;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    private static final String ID_VALUE = "id";
    private static final String USERNAME_VALUE = "instagram";

    private UserMapper mapper;

    @Before
    public void setUp() {
        mapper =  new UserMapper();
    }

    @Test
    public void nullObjectTest() {
        assertNull(mapper.convert(null));
    }

    @Test
    public void emptyObjectTest() {
        assertNotNull(mapper.convert(new User()));
    }

    @Test
    public void convert() {
        //given
        User user = new User();
        user.setId(ID_VALUE);
        user.setUsername(USERNAME_VALUE);

        //when
        UserDTO userDTO = mapper.convert(user);

        //then
        assertEquals(ID_VALUE, userDTO.getId());
        assertEquals(USERNAME_VALUE, userDTO.getUsername());

    }
}
