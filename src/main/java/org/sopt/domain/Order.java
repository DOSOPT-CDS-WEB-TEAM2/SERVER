package org.sopt.domain;

import static org.sopt.api.stock.exception.StockExceptionType.BAD_REQUEST_ORDER_BY;

import org.sopt.api.stock.exception.StockException;

public enum Order {
    TRADE_ASC, TRADE_DESC;

    public static Order find(String order) {
        for (Order t : values()) {
            if (t.name().equalsIgnoreCase(order)) {
                return t;
            }
        }
        throw new StockException(BAD_REQUEST_ORDER_BY);
    }
}
