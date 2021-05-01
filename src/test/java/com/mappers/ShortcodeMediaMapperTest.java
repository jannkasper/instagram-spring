package com.mappers;

import com.api.mapper.ShortcodeMediaMapper;
import com.api.model.ShortcodeMediaDTO;
import com.domain.ShortcodeMedia;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShortcodeMediaMapperTest {
    private static final String ID_VALUE = "id";
    private static final String SHORTCODE_VALUE = "shortcode";

    private ShortcodeMediaMapper mapper;

    @Before
    public void setUp() {
        mapper =  new ShortcodeMediaMapper();
    }

    @Test
    public void nullObjectTest() {
        assertNull(mapper.convert(null));
    }

    @Test
    public void emptyObjectTest() {
        assertNotNull(mapper.convert(new ShortcodeMedia()));
    }

    @Test
    public void convert() {
        //given
        ShortcodeMedia shortcodeMedia = new ShortcodeMedia();
        shortcodeMedia.setId(ID_VALUE);
        shortcodeMedia.setShortcode(SHORTCODE_VALUE);

        //when
        ShortcodeMediaDTO shortcodeMediaDTO = mapper.convert(shortcodeMedia);

        //then
        assertEquals(ID_VALUE, shortcodeMediaDTO.getId());
        assertEquals(SHORTCODE_VALUE, shortcodeMediaDTO.getShortcode());

    }
}
