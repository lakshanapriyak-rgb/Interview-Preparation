package com.devops.urlshortener.controller;

import com.devops.urlshortener.service.UrlService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.net.URI;
import java.util.Map;

@RestController
public class UrlController {

    private final UrlService urlService;

    public UrlController(UrlService urlService) {
        this.urlService = urlService;
    }

    @PostMapping("/shorten")
    public ResponseEntity<Map<String, String>> shorten(@RequestBody Map<String, String> body) {
        String shortCode = urlService.shortenUrl(body.get("url"));
        return ResponseEntity.ok(Map.of("shortCode", shortCode, "shortUrl", "http://localhost:8080/s/" + shortCode));
    }

    @GetMapping("/s/{shortCode}")
    public ResponseEntity<Void> redirect(@PathVariable String shortCode) {
        return urlService.getOriginalUrl(shortCode)
                .map(url -> ResponseEntity.status(302).location(URI.create(url)).<Void>build())
                .orElse(ResponseEntity.notFound().build());
    }
}
