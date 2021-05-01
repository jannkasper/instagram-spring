package com.controllers;

import com.api.model.UserDTO;
import com.services.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.Model;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    private static final String USERNAME_VALUE = "username";

    @Mock
    UserService userService;

    @Mock
    Model model;

    UserController controller;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        controller = new UserController(userService);
    }

    @Test
    public void testMockMVC() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("index"));
    }

    @Test
    public void getIndexPage() {

        //given
        UserDTO userDTO = new UserDTO();
        userDTO.setUsername(USERNAME_VALUE);

        when(userService.getUserFeedDTO()).thenReturn(userDTO);

        ArgumentCaptor<UserDTO> argumentCaptor = ArgumentCaptor.forClass(UserDTO.class);

        //when
        String viewName = controller.getIndex(model);

        //then
        assertEquals("index", viewName);
        verify(userService, times(1)).getUserFeedDTO();
        verify(model, times(1)).addAttribute(eq("userData"), argumentCaptor.capture());
        UserDTO setInController = argumentCaptor.getValue();
        assertEquals(USERNAME_VALUE, setInController.getUsername());
    }

    @Test
    public void showUserTest() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

        //given
        UserDTO userDTO = new UserDTO();
        when(userService.getUserDTO(anyString())).thenReturn(userDTO);

        //when
        mockMvc.perform(get("/username"))
                .andExpect(status().isOk())
                .andExpect(view().name("user"))
                .andExpect(model().attributeExists("userData"));

        //then
        verify(userService, times(1)).getUserDTO(anyString());
    }
}
