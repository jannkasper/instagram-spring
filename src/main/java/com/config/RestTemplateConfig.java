package com.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder
        .defaultHeader("accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9")
        .defaultHeader("accept-language", "pl,en-US;q=0.9,en;q=0.8,nl;q=0.7,nb;q=0.6")
        .defaultHeader("cache-control", "max-age=0")
        .defaultHeader("cookie", "ig_cb=2; ig_did=88BB498E-E955-405F-A830-3DB7BC47A8AE; mid=X-DhrwAEAAFWBn9a9lE9zRScjQRf; fbm_124024574287414=base_domain=.instagram.com; datr=Ay8iYAsdTFJuw4kRnu92mOox; csrftoken=BUhoVmbefyV1IrxHhcKcYimJF4vlX7gL; ds_user_id=46186666448; sessionid=46186666448%3AhdJqKrLVlX3hyc%3A8; shbid=4456; rur=VLL; shbts=1619235133.442773; fbsr_124024574287414=LE04hEanLeaZP_VrFsWitwuNROr_G4rCX_lxwpkmz5I.eyJ1c2VyX2lkIjoiMTAwMDAxMTMyMjcxMzU5IiwiY29kZSI6IkFRQXBuN0h2YUlOLWRSX25zMGxiaTl0bXNEdFB1VXZGdjlmdVllRmFBVTVpZE1IT3REc3BQLWhDVmttamFFd0owcmgyWkN2WkxPaFhOY2tGLTI4NkpRbk1QaTJtTjFkLUctZ2QtN1hVQTFBb2NVMVlhSUNtZ2dLQVlVbmlvSkxJbU5jZC1SWHFiZHNFTXNHSzJENHhBSkliMW9INjRtNHhkX3N6MllzTk5PS3hUOHVXNEpOZFNpelRicWdiYURpUVN1aHR3Vk9sSTNMNVpUVUJXSEFkNnh4bHVDdjNyTlJlTlp0VG8xMzJCWV8zR3Q1TFV1dU9WTl9oNnk1RkZzUVMtYW5idEI2MVNaMEJpUXMxeUdRbGxSZUgzLW5yUklCclFUYVpnVS1hak1fbWNaNWNhWDhxOFlpdEh2XzJLdE0wSjlINlQxNTZhTUFrRlpxSGl4UndSN094Iiwib2F1dGhfdG9rZW4iOiJFQUFCd3pMaXhuallCQUJPcHhRcFBKTkdTVjV4eDA1Q0wxdVpBMlg1SHRSNEVNSzVzcFYxaDRKSHZ4SUpLajdJa1ZZQjBmVUVTYVJ4YUJFT2gwdk5Zb1lZd2FlVGxSSHVTWkJwUXpZWkE4Q08xNWtyWkNNWkNXWkN0UzNxMVI5N3ZTRk94TlNncUtHRm5BS1JsZThydnBaQ1FlTWhxdG1WZWlxV2FaQjIwbmkwczlicXFaQnl1dnNVMDUiLCJhbGdvcml0aG0iOiJITUFDLVNIQTI1NiIsImlzc3VlZF9hdCI6MTYxOTIzNzUzNH0; fbsr_124024574287414=khUebGOWzNUiqLR6bVYu-C_gvON2Vs97avZ9VUxk3D4.eyJ1c2VyX2lkIjoiMTAwMDAxMTMyMjcxMzU5IiwiY29kZSI6IkFRQ0VqTHRWelZEZE1CazZfMnhxRXZoZVAzbEJhbnI0SVdNTG55b3lVam5Tbm1kMmUtQ01fNXVWaWd1VE5JNVQwY0VYeW9KTlJQdnN2M1JBMlJVWWZYUXFyUVRYZ2h3N09BYVBzZWVsQnZvcm9mTEs2VDFyZWV2dk9oTzlKbGt4UnFSMFd6SDE5am5zUGFsLUdrc3R6SkVlTnNTcGp6SHg1VkVPUWhWVTY5SVdXOGhya1I3MFdqdGhwZTJiU2c1QkloanUwVlZ3Q3dwTDhGaUZaSlpVRDdvRlZ3cFJJWFk4U0s3R3lGeXRLd2RRZFpuX1lkai1zVDZCck9mYmEzQlp5T0owb3NoNHlmOXNoTDVlV2x2MDdtc1ZySmxOejQwc2RNYVEtQ1Fzb2NYVXNWQU5QbFJuaTVJaElDaVRPRWlwVmJHaFRkLUhDbWZIMjRfQmhrcmowRHNuIiwib2F1dGhfdG9rZW4iOiJFQUFCd3pMaXhuallCQUNGclFaQWpweDJzWUlNbVY3ZVpBWXFhUFZJWkJQN1RiWXY4bHJTVlVlcktrOEtYVUp5cmdraW1wRjF1ZGhPZzlUVEFFRW1IWkJHdFdCQ1pDd1N4SlpDd1M4SXYzcnJvQjJaQ29FblJRZnpVWkJGNVNOSEpYbjRyaVpBMGxaQ2twSldmb3V6eVpDbElZMURjZEZXd0dqZWJ4NlpBWkJSMjRuaFpDUzlqaXloenVqYk1sQiIsImFsZ29yaXRobSI6IkhNQUMtU0hBMjU2IiwiaXNzdWVkX2F0IjoxNjE5MjQ1NjUxfQ")
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
