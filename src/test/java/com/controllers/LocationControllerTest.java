package com.controllers;

import com.api.model.LocationDTO;
import com.services.LocationService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class  LocationControllerTest {

    @Mock
    LocationService locationService;

    LocationController controller;

    MockMvc mockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        controller = new LocationController(locationService);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void showLocationTest() throws Exception {
        //given
        LocationDTO locationDTO = new LocationDTO();

        //when
        when(locationService.getLocationDTO(anyString(), anyString())).thenReturn(locationDTO);

        //then
        mockMvc.perform(get("/locations/locationId/locationName"))
                .andExpect(status().isOk())
                .andExpect(view().name("location"))
                .andExpect(model().attributeExists("locationData"));
    }
}
