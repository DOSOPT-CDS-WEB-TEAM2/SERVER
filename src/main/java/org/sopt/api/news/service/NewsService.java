package org.sopt.api.news.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.sopt.api.news.controller.dto.response.GetNewsResponseDto;
import org.sopt.domain.News;
import org.sopt.domain.Stock;
import org.sopt.domain.repository.NewsRepository;
import org.sopt.domain.repository.StockRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class NewsService {

    private final NewsRepository newsRepository;
    private final StockRepository stockRepository;

    public List<GetNewsResponseDto> getNews() {
        List<News> newsList = newsRepository.findAll();
        return newsList.stream().map(GetNewsResponseDto::of).toList();
    }

    public List<GetNewsResponseDto> getRelatedNews(String stockCode) {
        Stock stock = stockRepository.findByCodeOrThrow(stockCode);

        return newsRepository.findAllByStock(stock).stream().map(GetNewsResponseDto::of).toList();
    }
}
