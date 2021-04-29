package com.controllers;

import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

@Slf4j
@Controller
public class ImageController {

    @GetMapping({ "/fetch/img/"})
    public void showImage(@RequestParam("url") String url, HttpServletResponse response) throws IOException {
        URL toDownload = new URL(url);

        InputStream stream = toDownload.openStream();

        IOUtils.copy(stream, response.getOutputStream());
    }
}

