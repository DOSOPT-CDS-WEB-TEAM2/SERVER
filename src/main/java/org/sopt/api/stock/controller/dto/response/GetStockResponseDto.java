package org.sopt.api.stock.controller.dto.response;

import static jakarta.persistence.EnumType.STRING;

import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;
import lombok.AccessLevel;
import lombok.Builder;
import org.sopt.domain.Portfolio;
import org.sopt.domain.Stock;
import org.sopt.domain.Type;

@Builder(access = AccessLevel.PRIVATE)
public record GetStockResponseDto(
        String code,
        String name,
        String currentPrice,
        float fluctuationRate,
        String graphUrl,
        String fluctuationPrice,
        String previousDayIncrease,
        String todayLowestPrice,
        String todayHighestPrice,
        String pastWeekLowestPrice,
        String pastWeekHighestPrice,
        String marketCapitalization,
        String averageTrading,
        float stockPriceReturn,
        float dividendYield
) {
        public static GetStockResponseDto of(Stock stock){
                return GetStockResponseDto.builder()
                        .code(stock.getCode())
                        .name(stock.getName())
                        .currentPrice(stock.getCurrentPrice())
                        .fluctuationRate(stock.getFluctuationRate())
                        .graphUrl(stock.getGraphUrl())
                        .fluctuationPrice(stock.getFluctuationPrice())
                        .previousDayIncrease(stock.getPreviousDayClosingPrice())
                        .todayLowestPrice(stock.getTodayLowestPrice())
                        .todayHighestPrice(stock.getTodayHighestPrice())
                        .pastWeekLowestPrice(stock.getPastWeekLowestPrice())
                        .pastWeekHighestPrice(stock.getPastWeekHighestPrice())
                        .marketCapitalization(stock.getMarketCapitalization())
                        .averageTrading(stock.getAverageTrading())
                        .stockPriceReturn(stock.getStockPriceReturn())
                        .dividendYield(stock.getDividendYield())
                        .build();
        }
}
