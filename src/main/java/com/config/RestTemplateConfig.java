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
        .defaultHeader("cookie", "ig_cb=2; ig_did=88BB498E-E955-405F-A830-3DB7BC47A8AE; mid=X-DhrwAEAAFWBn9a9lE9zRScjQRf; fbm_124024574287414=base_domain=.instagram.com; datr=Ay8iYAsdTFJuw4kRnu92mOox; csrftoken=BUhoVmbefyV1IrxHhcKcYimJF4vlX7gL; ds_user_id=46186666448; sessionid=46186666448%3AhdJqKrLVlX3hyc%3A8; shbid=4456; shbts=1618634216.6969388; rur=VLL; fbsr_124024574287414=yku1GSfBhuC476cGsUEgNf5cYXtFEl0iYw_SP3kRJgk.eyJ1c2VyX2lkIjoiMTAwMDAxMTMyMjcxMzU5IiwiY29kZSI6IkFRQTJjcDN4aEpIYi1FT2Q0OWxBR2x6MlJmVlE5eGJreEpOVVBrckN5c2ZWQnVmQzRtUzd4OF9HenBuN2JKVXRrc2w3NHNqYjZvbEtIVXF0ZDgxN0hqbTBsNHVNVUNGYWIxeTdJc0o4Q3F0bzlFY1duTVk3ZTZ5SVo0RzNKcDZhdllqSHp6QzQzVWVtS3RSR3Z3ZVNuSTJSeWMwZGt3akNpNmxCSWk5VElmb1Z5UEprbHduYzgwZ0NDdWdveU1mc0NQNEFjc2dnLWYzbHRTVHhNMHNNaHBveWhTal9kM1Q0Yll1eXdVN2QwT0dfVjllbmN1dzNaX3A2ajR1aHd6WnJrQjYwc3lEaFpoVmVxMU5qTGU1amNFUFM2dGU5WE04OUUzT2NFX0RsNU15T1RobmwwNXdMcl9PTU9XZ2Nha2V4WVJWQ182MjI3T0xFa29qbUxUcmt2cTQ1Iiwib2F1dGhfdG9rZW4iOiJFQUFCd3pMaXhuallCQUxCZU5xQnFaQ3FnUEJSbmVKdTFaQ2pzS1JnWkJzVEdRRE56UGlaQ2k2WkJTaVJHN0dLZVNFWVVUSXdURHFxcEhrdTVmQ0tXZjNoUzMwSjBmRWhHV1M0WkFpVndDOFkyTWdnYVhzMGlmS1pDdWN1M1FyenhRYjZsZFdaQVdUYW5sWkExa05rRjhQTDVGZ1I3OFpCMFNVY2dOWkNpNTNhdzBYcndPODdsSVJ5SWFpMiIsImFsZ29yaXRobSI6IkhNQUMtU0hBMjU2IiwiaXNzdWVkX2F0IjoxNjE4NjQxNDYxfQ; fbsr_124024574287414=oVdTljn1GZx1JKvcOqvpIoL4u6Ba75nA7Ef_tK7bX5w.eyJ1c2VyX2lkIjoiMTAwMDAxMTMyMjcxMzU5IiwiY29kZSI6IkFRQXFmNDNyYUkzaXRQQ3pZdmNMR1Bpb1pCemlQV2xuNnN0aFNRbkVMbURxOFBrS0s5V0lfbFpfVXYtaWdpeE1ISnlSZHFSS1JVb1p0X0docVRJTnp3QlUxN0xUSkREajdGVGYtMFU1Y3BCQm9CT0c5TWNRMVlEQ0pBeC1iVG1aQ1NxV1dBR01vU0RScUdkYlBpT3pfRXJ4Y1lLXy1rbllKMS1wLUVldkxSNDRVZ2E2NU9yRDdIMVFVUWYtcHl3QktBU2NVa1JNeFBDR3c1d0NJS0tkMmtCeUhFZWd0Y1dkWXVRZG50LTFpSGZWaGozcHctR2dkSU9jcHlJVUxiV1RmZUtvUzNfVDlTYmJFanVhUmlGYUNEQzFEU1Zhbnctck1RaFdzUlZXQkh0SnhaZU5LY01KVGRabGQzcW90SjhaMEJMeG44RkRxTzZ2RGR1SFhqTE5hR3ZnIiwib2F1dGhfdG9rZW4iOiJFQUFCd3pMaXhuallCQUhTZEFhTkswUEF0Y0FRSDJIdXZaQUhaQmxvajZlWkFtQXdDMDNVRW9rYVpCR1ZDYnFNR05USEd6aG5uVnJIajE5cFlHb243OTJSd29hRmtVVlpDUG5UYWQ4MTliY3MzZ3FyQ3Z0WkFIVFdCc1ZnUURvSERobDhUNDFxWkJJRDVJZUxGVzN5cmpqMzRCdU0yNXpUU2ZFZVZPUExsWUxjNGxTbG4zVm5IQ2c3IiwiYWxnb3JpdGhtIjoiSE1BQy1TSEEyNTYiLCJpc3N1ZWRfYXQiOjE2MTg2NDE5NTJ9")
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
