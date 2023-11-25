package org.sopt.api.incomeStatement.controller.dto.response;

import lombok.AccessLevel;
import lombok.Builder;
import org.sopt.domain.IncomeStatement;

@Builder(access = AccessLevel.PRIVATE)
public record GetIncomeStatementResponseDto(
        String income,
        float comparedIncome,
        String profitMargin,
        float comparedProfitMargin,
        String operatingExpenses,
        float comparedOperatingExpenses,
        String incomePerShare,
        float comparedIncomePerShare,
        String ebitda,
        float comparedEbitda,
        String effectiveTaxRate,
        float comparedEffectiveTaxRate
) {

    public static GetIncomeStatementResponseDto of(IncomeStatement incomeStatement) {

        return GetIncomeStatementResponseDto.builder()
                .income(incomeStatement.getIncome())
                .comparedIncome(incomeStatement.getComparedIncome())
                .profitMargin(incomeStatement.getProfitMargin())
                .comparedProfitMargin(incomeStatement.getComparedProfitMargin())
                .incomePerShare(incomeStatement.getIncomePerShare())
                .comparedIncomePerShare(incomeStatement.getComparedIncomePerShare())
                .operatingExpenses(incomeStatement.getOperatingExpenses())
                .comparedOperatingExpenses(incomeStatement.getComparedOperatingExpenses())
                .ebitda(incomeStatement.getEbitda())
                .comparedEbitda(incomeStatement.getComparedEbitda())
                .effectiveTaxRate(incomeStatement.getEffectiveTaxRate())
                .comparedEffectiveTaxRate(incomeStatement.getComparedEffectiveTaxRate()).build();
    }
}
