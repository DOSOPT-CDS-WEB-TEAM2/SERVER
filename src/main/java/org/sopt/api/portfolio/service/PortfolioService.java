package org.sopt.api.portfolio.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.sopt.api.portfolio.controller.dto.response.GetPortfolioResponseDto;
import org.sopt.domain.Portfolio;
import org.sopt.domain.Stock;
import org.sopt.domain.repository.PortfolioRepository;
import org.sopt.domain.repository.StockRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class PortfolioService {
    private final PortfolioRepository portfolioRepository;
    private final StockRepository stockRepository;

    public List<GetPortfolioResponseDto> getPortfolio(){
        Portfolio portfolio = portfolioRepository.findByIdOrElseThrowException(1L);
        List<Stock> stockList = stockRepository.findAllByPortfolio(portfolio);

        return stockList.stream().map(GetPortfolioResponseDto::of).toList();
    }
}
