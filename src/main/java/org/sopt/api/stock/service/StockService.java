package org.sopt.api.stock.service;

import lombok.RequiredArgsConstructor;
import org.sopt.api.stock.controller.dto.response.GetStockResponseDto;
import org.sopt.domain.Stock;
import org.sopt.domain.repository.StockRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class StockService {
    private final StockRepository stockRepository;

    public GetStockResponseDto getStock(String code) {
        Stock stock = stockRepository.findByCodeOrThrow(code);
        return GetStockResponseDto.of(stock);
    }
}
