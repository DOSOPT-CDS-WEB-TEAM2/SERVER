package org.sopt.api.incomeStatement.service;

import lombok.RequiredArgsConstructor;
import org.sopt.api.incomeStatement.controller.dto.response.GetIncomeStatementResponseDto;
import org.sopt.domain.IncomeStatement;
import org.sopt.domain.Stock;
import org.sopt.domain.repository.IncomeStatementRepository;
import org.sopt.domain.repository.StockRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class IncomeStatementService {

    private final IncomeStatementRepository incomeStatementRepository;
    private final StockRepository stockRepository;

    public GetIncomeStatementResponseDto getIncomeStatement(String stockCode) {

        Stock stock = stockRepository.findByCodeOrThrow(stockCode);
        IncomeStatement incomeStatement = incomeStatementRepository.getIncomeStatementByStockOrElseThrowException(
                stock);

        return GetIncomeStatementResponseDto.of(incomeStatement);
    }
}
