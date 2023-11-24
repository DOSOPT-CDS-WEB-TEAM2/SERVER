package org.sopt.domain.repository;

import static org.sopt.api.stock.exception.StockExceptionType.NOT_FOUND_STOCK;

import org.sopt.api.stock.exception.StockException;
import org.sopt.domain.Stock;
import org.springframework.data.repository.Repository;

public interface StockRepository extends Repository<Stock, String> {
    Stock findByCode(String code);

    default Stock findByCodeOrThrow(String code) {
        Stock stock = findByCode(code);
        if (stock == null) {
            throw new StockException(NOT_FOUND_STOCK);
        }
        return stock;
    }
}
