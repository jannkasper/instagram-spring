package com.controllers;

import com.api.model.ShortcodeMediaDTO;
import com.services.PostService;
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
public class  PostControllerTest {

    @Mock
    PostService postService;

    PostController controller;

    MockMvc mockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        controller = new PostController(postService);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void showPostTest() throws Exception {
        //given
         ShortcodeMediaDTO shortcodeMediaDTO = new ShortcodeMediaDTO();

        //when
        when(postService.getPostDTO(anyString())).thenReturn(shortcodeMediaDTO);

        //then
        mockMvc.perform(get("/p/shortcode"))
                .andExpect(status().isOk())
                .andExpect(view().name("post"))
                .andExpect(model().attributeExists("postData"));
    }
}