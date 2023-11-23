package org.sopt.api.stockIndex.controller.dto.response;

import lombok.Builder;
import org.sopt.domain.StockIndex;

@Builder
public record GetStockIndexResponseDto(
        Long id,
        String name,
        String currentStockIndex,
        float fluctuationRate

) {

    public static GetStockIndexResponseDto of(StockIndex stockIndex) {
        return GetStockIndexResponseDto.builder()
                .id(stockIndex.getId())
                .name(stockIndex.getName())
                .currentStockIndex(stockIndex.getCurrentStockIndex())
                .fluctuationRate(stockIndex.getFluctuationRate())
                .build();
    }
}
