package com.services;

import com.api.model.EdgeListPostDTO;
import com.api.model.HashtagDTO;
import com.api.model.ShortcodeMediaDTO;
import com.domain.DataContainer;
import com.domain.GraphqlContainer;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostServiceImplTest {

    private static final String SHORTCODE_VALUE = "CM-GBiNs1PW";
    private static final String USER_ID_VALUE = "25025320";
    private static final String FIRST_VALUE = "12";

    @Autowired
    private PostService postService;

    @Before
    public void setUp() {
    }

    @Test
    public void getPostTest() {
        GraphqlContainer graphqlContainer = postService.getPost(SHORTCODE_VALUE);
        assertNotNull(graphqlContainer);
        assertNotNull(graphqlContainer.getGraphql());
        assertNotNull(graphqlContainer.getGraphql().getShortcode_media());
        assertEquals(SHORTCODE_VALUE, graphqlContainer.getGraphql().getShortcode_media().getShortcode());
    }

    @Test
    public void getPostDTOTest() {
        ShortcodeMediaDTO shortcodeMediaDTO = postService.getPostDTO(SHORTCODE_VALUE);
        assertNotNull(shortcodeMediaDTO);
        assertEquals(SHORTCODE_VALUE, shortcodeMediaDTO.getShortcode());
    }

    @Test
    public void getPostFeedTest() {
        DataContainer dataContainer = postService.getPostFeed(SHORTCODE_VALUE, USER_ID_VALUE, FIRST_VALUE);
        assertNotNull(dataContainer);
        assertNotNull(dataContainer.getData());
        assertNotNull(dataContainer.getData().getUser());
        assertNotNull(dataContainer.getData().getUser().getEdge_owner_to_timeline_media());
    }

    @Test
    public void getPostFeedDTOTest() {
        EdgeListPostDTO edgeListPostDTO = postService.getPostFeedDTO(SHORTCODE_VALUE, USER_ID_VALUE, FIRST_VALUE);
        assertNotNull(edgeListPostDTO);
        assertNotNull(edgeListPostDTO.getMediaArray());
    }
}
