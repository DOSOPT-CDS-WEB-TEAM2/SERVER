package org.sopt.api.stockIndex.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.sopt.api.stockIndex.controller.dto.response.GetStockIndexResponseDto;
import org.sopt.common.util.StockIndexGrouper;
import org.sopt.domain.Continent;
import org.sopt.domain.StockIndex;
import org.sopt.domain.repository.StockIndexRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Transactional(readOnly = true)
@Service
public class StockIndexService {
    private final StockIndexRepository stockIndexRepository;

    public List<GetStockIndexResponseDto> getStockIndexByContinent(Continent continent) {
        List<StockIndex> stockIndexList = stockIndexRepository.findAllByContinent(continent);

        return stockIndexList.stream().map(GetStockIndexResponseDto::of).toList();
    }

    public Map<String, List<GetStockIndexResponseDto>> getAllStockIndexAndGroupByContinent() {
        List<StockIndex> stockIndexList = stockIndexRepository.findAll();
        StockIndexGrouper stockIndexGrouper = new StockIndexGrouper(stockIndexList);

        Map<Continent, List<StockIndex>> stockIndexMapByContinent = stockIndexGrouper.groupByContinent();

        Map<String, List<GetStockIndexResponseDto>> result = new HashMap<>();
        stockIndexMapByContinent.forEach((key, valueList) ->
                {
                    for (StockIndex stockIndex : valueList) {
                        result.computeIfAbsent(key.getKorean(), k -> new ArrayList<>())
                                .add(GetStockIndexResponseDto.of(stockIndex));
                    }

                }
        );

        return result;
    }

}
