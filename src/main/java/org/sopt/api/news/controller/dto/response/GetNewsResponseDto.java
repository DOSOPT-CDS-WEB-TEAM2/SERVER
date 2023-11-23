package org.sopt.api.news.controller.dto.response;

import java.time.LocalDateTime;
import lombok.Builder;
import org.sopt.domain.News;

@Builder
public record GetNewsResponseDto(
        Long id,
        String title,
        String imageUrl,
        LocalDateTime createdAt,
        String publisher
) {
    public static GetNewsResponseDto of(News news) {
        return GetNewsResponseDto.builder()
                .id(news.getId())
                .title(news.getTitle())
                .imageUrl(news.getImageUrl())
                .createdAt(news.getCreatedAt())
                .publisher(news.getPublisher())
                .build();
    }
}
