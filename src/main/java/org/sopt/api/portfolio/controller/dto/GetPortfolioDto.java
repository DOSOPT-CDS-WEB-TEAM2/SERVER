package org.sopt.api.portfolio.controller.dto;

import lombok.AccessLevel;
import lombok.Builder;
import org.sopt.api.stock.controller.dto.response.GetRelatedStockResponseDto;
import org.sopt.domain.Stock;

@Builder(access = AccessLevel.PRIVATE)
public record GetPortfolioDto(
        String code,
        String name,
        String currentPrice,
        float fluctuationRate
) {
    public static GetPortfolioDto of(Stock stock) {
        return GetPortfolioDto.builder()
                .code(stock.getCode())
                .name(stock.getName())
                .currentPrice(stock.getCurrentPrice())
                .fluctuationRate(stock.getFluctuationRate())
                .build();
    }
}
