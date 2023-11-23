package org.sopt.api.news.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.sopt.api.news.controller.dto.response.GetNewsResponseDto;
import org.sopt.domain.News;
import org.sopt.domain.repository.NewsRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class NewsService {

    private final NewsRepository newsRepository;

    public List<GetNewsResponseDto> getNews() {
        List<News> newsList = newsRepository.findAll();
        return newsList.stream().map(GetNewsResponseDto::of).toList();
    }
}
