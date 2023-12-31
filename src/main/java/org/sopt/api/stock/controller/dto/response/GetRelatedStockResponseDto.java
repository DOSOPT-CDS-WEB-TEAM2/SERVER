package org.sopt.api.stock.controller.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import org.sopt.domain.Stock;

@Builder(access = AccessLevel.PRIVATE)
public record GetRelatedStockResponseDto(
        String code,
        String name,
        String currentPrice,
        float fluctuationRate
) {
    public static GetRelatedStockResponseDto of(Stock stock) {
        return GetRelatedStockResponseDto.builder()
                .code(stock.getCode())
                .name(stock.getName())
                .currentPrice(stock.getCurrentPrice())
                .fluctuationRate(stock.getFluctuationRate())
                .build();
    }
}
