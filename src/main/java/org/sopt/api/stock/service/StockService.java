package org.sopt.api.stock.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.sopt.api.stock.controller.dto.response.GetRelatedStockResponseDto;
import org.sopt.api.stock.controller.dto.response.GetStockResponseDto;
import org.sopt.domain.Stock;
import org.sopt.domain.Type;
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

    public List<GetRelatedStockResponseDto> getRelatedStockList(Type type){
        List<Stock> relatedStockList = stockRepository.findAllByType(type);
        return relatedStockList.stream().
                map(stock->GetRelatedStockResponseDto.of(stock)).toList();
    }
}
