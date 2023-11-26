package org.sopt.api.stock.controller.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import org.sopt.domain.Stock;

@Builder(access = AccessLevel.PRIVATE)
public record GetStockOrderByTradeAmountResponseDto(
        String name,
        float fluctuationRate
) {
    public static GetStockOrderByTradeAmountResponseDto of(Stock stock) {
        return GetStockOrderByTradeAmountResponseDto.builder()
                .name(stock.getName())
                .fluctuationRate(stock.getFluctuationRate())
                .build();
    }
}
