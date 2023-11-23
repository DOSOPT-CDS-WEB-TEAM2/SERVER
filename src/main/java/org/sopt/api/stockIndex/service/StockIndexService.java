package org.sopt.api.stockIndex.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.sopt.api.stockIndex.controller.dto.response.GetStockIndexResponseDto;
import org.sopt.domain.Continent;
import org.sopt.domain.StockIndex;
import org.sopt.domain.repository.StockRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class StockIndexService {
    private final StockRepository stockRepository;

    public List<GetStockIndexResponseDto> getStockIndexByContinent(Continent continent) {
        List<StockIndex> stockIndexList = stockRepository.findAllByContinent(continent);

        return stockIndexList.stream().map(GetStockIndexResponseDto::of).toList();
    }
}
