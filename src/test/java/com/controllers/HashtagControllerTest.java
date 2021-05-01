package com.controllers;

import com.api.model.HashtagDTO;
import com.services.HashtagService;
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
public class HashtagControllerTest {

    @Mock
    HashtagService hashtagService;

    HashtagController controller;

    MockMvc mockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        controller = new HashtagController(hashtagService);
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
    }

    @Test
    public void showHashtagTest() throws Exception {
        //given
        HashtagDTO hashtagDTO = new HashtagDTO();

        //when
        when(hashtagService.getHashtagDTO(anyString())).thenReturn(hashtagDTO);

        //then
        mockMvc.perform(get("/tags/tagName"))
                .andExpect(status().isOk())
                .andExpect(view().name("tag"))
                .andExpect(model().attributeExists("tagData"));
    }
}
