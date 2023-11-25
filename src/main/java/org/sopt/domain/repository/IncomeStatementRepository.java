package org.sopt.domain.repository;

import static org.sopt.api.incomeStatement.exception.IncomeStatementExceptionType.NOT_FOUND_INCOME_STATEMENT;

import java.util.Optional;
import org.sopt.api.incomeStatement.exception.IncomeStatementException;
import org.sopt.domain.IncomeStatement;
import org.sopt.domain.Stock;
import org.springframework.data.repository.Repository;

public interface IncomeStatementRepository extends Repository<IncomeStatement, Long> {
    Optional<IncomeStatement> getIncomeStatementByStock(Stock stock);

    default IncomeStatement getIncomeStatementByStockOrElseThrowException(Stock stock) {
        return getIncomeStatementByStock(stock).orElseThrow(
                () -> new IncomeStatementException(NOT_FOUND_INCOME_STATEMENT));
    }
}
