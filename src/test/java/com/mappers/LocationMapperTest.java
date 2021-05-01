package com.mappers;

import com.api.mapper.LocationMapper;
import com.api.model.LocationDTO;
import com.domain.Location;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationMapperTest {
    private static final String ID_VALUE = "id";
    private static final String NAME_VALUE = "name";

    private LocationMapper mapper;

    @Before
    public void setUp() {
        mapper =  new LocationMapper();
    }

    @Test
    public void nullObjectTest() {
        assertNull(mapper.convert(null));
    }

    @Test
    public void emptyObjectTest() {
        assertNotNull(mapper.convert(new Location()));
    }

    @Test
    public void convert() {
        //given
        Location location = new Location();
        location.setId(ID_VALUE);
        location.setName(NAME_VALUE);

        //when
        LocationDTO locationDTO = mapper.convert(location);

        //then
        assertEquals(ID_VALUE, locationDTO.getId());
        assertEquals(NAME_VALUE, locationDTO.getName());

    }
}
