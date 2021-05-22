package com.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder, @Value("${instagram.cookie}") String cookie) {
        return builder
        .defaultHeader("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
        .defaultHeader("accept-language", "pl,en-US;q=0.9,en;q=0.8,nl;q=0.7,nb;q=0.6")
        .defaultHeader("cache-control", "max-age=0")
        .defaultHeader("cookie", cookie)
        .defaultHeader("sec-ch-ua", "\"Google Chrome\";v=\"87\", \" Not;A Brand\";v=\"99\", \"Chromium\";v=\"87\"")
        .defaultHeader("sec-ch-ua-mobile", "?0")
        .defaultHeader("sec-fetch-dest", "document")
        .defaultHeader("sec-fetch-mode", "navigate")
        .defaultHeader("sec-fetch-site", "same-origin")
        .defaultHeader("sec-fetch-user", "?1")
        .defaultHeader("upgrade-insecure-requests", "1")
        .defaultHeader("user-agent", "Mozilla/5.0 (Macintosh; Intel Mac OS X 11_2_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.88 Safari/537.36")
        .build();
    }
}
