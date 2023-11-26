package org.sopt.domain.repository;

import static org.sopt.api.stock.exception.StockExceptionType.NOT_FOUND_STOCK;

import java.util.List;
import java.util.Optional;
import org.sopt.api.stock.exception.StockException;
import org.sopt.domain.Portfolio;
import org.sopt.domain.Stock;
import org.sopt.domain.Type;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

public interface StockRepository extends Repository<Stock, String> {
    List<Stock> getAllByOrderByTradeAmountDesc();

    List<Stock> findAllByType(Type type);

    Optional<Stock> findByCode(String code);

    List<Stock> findAllByPortfolio(Portfolio portfolio);

    default Stock findByCodeOrThrow(String code) {
        return findByCode(code).orElseThrow(
                () -> new StockException(NOT_FOUND_STOCK));
    }
}
