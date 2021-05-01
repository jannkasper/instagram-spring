package com.utils;

import com.util.Formatter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FormatterTest {

    @Autowired
    private Formatter formatter;

    @Test
    public void numCommaFormatterTest() {
        assertEquals("", formatter.numCommaFormatter(null));
        assertEquals("", formatter.numCommaFormatter(-999));
        assertEquals("999", formatter.numCommaFormatter(999));
        assertEquals("1,000", formatter.numCommaFormatter(1000));
        assertEquals("10,000", formatter.numCommaFormatter(10000));
        assertEquals("100,000", formatter.numCommaFormatter(100000));
        assertEquals("1,000,000", formatter.numCommaFormatter(1000000));
    }

    @Test
    public void numFormatterTest() {
        assertEquals("", formatter.numFormatter(null));
        assertEquals("", formatter.numFormatter(-999));
        assertEquals("999", formatter.numFormatter(999));
        assertEquals("1.0k", formatter.numFormatter(1000));
        assertEquals("10.0k", formatter.numFormatter(10000));
        assertEquals("100.0k", formatter.numFormatter(100000));
        assertEquals("1.0M", formatter.numFormatter(1000000));
    }

    @Test
    public void urlFormatterTest() {
        assertEquals("", formatter.urlFormatter(null));
        assertEquals("", formatter.urlFormatter("TEST"));
        assertEquals("", formatter.urlFormatter("www.instagram.com"));
        assertEquals("www.instagram.com", formatter.urlFormatter("https://www.instagram.com/"));
    }

    @Test
    public void bioFormatterTest() {
        assertEquals("", formatter.bioFormatter(null));
        assertEquals("TEST", formatter.bioFormatter("TEST"));
        assertEquals("<br/>", formatter.bioFormatter("\n"));
        assertEquals("<br/>", formatter.bioFormatter("<br/>"));
    }

    @Test
    public void hashtagFormatterTest() {
        assertEquals(null, formatter.hashtagFormatter(null));
        assertEquals("TEST", formatter.hashtagFormatter("TEST"));
        assertEquals("<a href=\"/tags/test\" style=\"color:#00376b\">#test</a>", formatter.hashtagFormatter("#test"));
        assertEquals("<a href=\"/test\" style=\"color:#00376b\">@test</a>", formatter.hashtagFormatter("@test"));
    }
}
