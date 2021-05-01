package com.services;

import com.api.model.HashtagDTO;
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
public class HashtagServiceImplTest {

    private static final String HASHTAG_VALUE = "instagram";

    @Autowired
    private HashtagService hashtagService;

    @Before
    public void setUp() {
    }

    @Test
    public void getHashtagTest() {
        GraphqlContainer graphqlContainer = hashtagService.getHashtag(HASHTAG_VALUE);
        assertNotNull(graphqlContainer);
        assertNotNull(graphqlContainer.getGraphql());
        assertNotNull(graphqlContainer.getGraphql().getHashtag());
        assertEquals(HASHTAG_VALUE, graphqlContainer.getGraphql().getHashtag().getName());

    }

    @Test
    public void getHashtagDTOTest() {
        HashtagDTO hashtagDTO = hashtagService.getHashtagDTO(HASHTAG_VALUE);
        assertNotNull(hashtagDTO);
        assertEquals(HASHTAG_VALUE, hashtagDTO.getTagName());
    }
}
