package org.sopt.api.portfolio.controller.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import org.sopt.domain.Stock;

@Builder(access = AccessLevel.PRIVATE)
public record GetPortfolioResponseDto(
        String code,
        String name,
        String currentPrice,
        float fluctuationRate
) {
    public static GetPortfolioResponseDto of(Stock stock) {
        return GetPortfolioResponseDto.builder()
                .code(stock.getCode())
                .name(stock.getName())
                .currentPrice(stock.getCurrentPrice())
                .fluctuationRate(stock.getFluctuationRate())
                .build();
    }
}
