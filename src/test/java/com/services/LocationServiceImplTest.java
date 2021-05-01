package com.services;

import com.api.model.LocationDTO;
import com.domain.GraphqlContainer;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LocationServiceImplTest {

    private static final String LOCATION_ID_VALUE = "116231";
    private static final String LOCATION_NAME_VALUE = "amsterdam-netherlands";

    @Autowired
    private LocationService locationService;

    @Before
    public void setUp() {
    }

    @Ignore
    @Test
    public void getLocationTest() {
        GraphqlContainer graphqlContainer = locationService.getLocation(LOCATION_ID_VALUE, LOCATION_NAME_VALUE);
        assertNotNull(graphqlContainer);
        assertNotNull(graphqlContainer.getGraphql());
        assertNotNull(graphqlContainer.getGraphql().getLocation());
        assertEquals(LOCATION_ID_VALUE, graphqlContainer.getGraphql().getLocation().getId());
        assertEquals(LOCATION_NAME_VALUE, graphqlContainer.getGraphql().getLocation().getName());
    }
    @Ignore
    @Test
    public void getLocationDTOTest() {
        LocationDTO locationDTO = locationService.getLocationDTO(LOCATION_ID_VALUE, LOCATION_NAME_VALUE);
        assertNotNull(locationDTO);
        assertEquals(LOCATION_ID_VALUE, locationDTO.getId());
    }
}
