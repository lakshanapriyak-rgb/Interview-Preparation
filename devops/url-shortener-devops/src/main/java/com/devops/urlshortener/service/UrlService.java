package com.devops.urlshortener.service;

import com.devops.urlshortener.model.UrlMapping;
import com.devops.urlshortener.repository.UrlRepository;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.UUID;

@Service
public class UrlService {

    private final UrlRepository urlRepository;

    public UrlService(UrlRepository urlRepository) {
        this.urlRepository = urlRepository;
    }

    public String shortenUrl(String originalUrl) {
        String shortCode = UUID.randomUUID().toString().substring(0, 6);
        UrlMapping mapping = new UrlMapping();
        mapping.setShortCode(shortCode);
        mapping.setOriginalUrl(originalUrl);
        urlRepository.save(mapping);
        return shortCode;
    }

    public Optional<String> getOriginalUrl(String shortCode) {
        return urlRepository.findByShortCode(shortCode)
                .map(UrlMapping::getOriginalUrl);
    }
}
