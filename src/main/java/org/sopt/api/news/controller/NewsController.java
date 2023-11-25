package org.sopt.api.news.controller;

import jakarta.annotation.Nullable;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.sopt.api.news.controller.dto.response.GetNewsResponseDto;
import org.sopt.api.news.service.NewsService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/news")
@RestController
public class NewsController {

    private final NewsService newsService;

    @GetMapping
    public ResponseEntity<List<GetNewsResponseDto>> getNews(
            @Nullable @RequestParam(name = "related-stock") String relatedStock) {
        if (relatedStock == null) {
            return ResponseEntity.ok(newsService.getNews());
        }
        return ResponseEntity.ok(newsService.getRelatedNews(relatedStock));
    }
}
