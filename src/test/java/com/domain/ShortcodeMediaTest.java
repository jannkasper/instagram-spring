package com.domain;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShortcodeMediaTest {
    private static final String ID_VALUE = "id";
    private static final String SHORTCODE_VALUE = "shortcode";

    ShortcodeMedia shortcodeMedia;

    @Before
    public void setUp() {
        shortcodeMedia = new ShortcodeMedia();
    }

    @Test
    public void getIdTest() {
        shortcodeMedia.setId(ID_VALUE);

        Assertions.assertEquals(ID_VALUE, shortcodeMedia.getId());
    }

    @Test
    public void getShortcodeTest() {
        shortcodeMedia.setShortcode(SHORTCODE_VALUE);

        Assertions.assertEquals(SHORTCODE_VALUE, shortcodeMedia.getShortcode());
    }
}
