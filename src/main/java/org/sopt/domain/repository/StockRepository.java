package org.sopt.domain.repository;

import static org.sopt.api.stock.exception.StockExceptionType.NOT_FOUND_STOCK;

import java.util.List;
import org.sopt.api.stock.exception.StockException;
import org.sopt.domain.Stock;
import org.sopt.domain.Type;
import org.springframework.data.repository.Repository;

public interface StockRepository extends Repository<Stock, String> {
    List<Stock> findAllByType(Type type);
    Stock findByCode(String code);

    default Stock findByCodeOrThrow(String code) {
        Stock stock = findByCode(code);
        if (stock == null) {
            throw new StockException(NOT_FOUND_STOCK);
        }
        return stock;
    }
}
