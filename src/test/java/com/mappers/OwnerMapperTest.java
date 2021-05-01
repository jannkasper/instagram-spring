package com.mappers;

import com.api.mapper.OwnerMapper;
import com.api.model.OwnerDTO;
import com.domain.Owner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OwnerMapperTest {
    private static final String ID_VALUE = "id";
    private static final String USERNAME_VALUE = "instagram";

    private OwnerMapper mapper;

    @Before
    public void setUp() {
        mapper =  new OwnerMapper();
    }

    @Test
    public void nullObjectTest() {
        assertNull(mapper.convert(null));
    }

    @Test
    public void emptyObjectTest() {
        assertNotNull(mapper.convert(new Owner()));
    }

    @Test
    public void convert() {
        //given
        Owner owner = new Owner();
        owner.setId(ID_VALUE);
        owner.setUsername(USERNAME_VALUE);

        //when
        OwnerDTO ownerDTO = mapper.convert(owner);

        //then
        assertEquals(ID_VALUE, ownerDTO.getId());
        assertEquals(USERNAME_VALUE, ownerDTO.getUsername());

    }
}
