package org.sopt.domain;

import static org.sopt.api.stock.exception.StockExceptionType.NOT_FOUND_RELATED_STOCK;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.sopt.api.stock.exception.StockException;

@RequiredArgsConstructor
@Getter
public enum Type {
    CHEMISTRY, ETC;

    //private final String korean;

    public static Type find(String type) {
        for (Type t : values()) {
            if (t.name().equalsIgnoreCase(type)) {
                return t;
            }
        }
        throw new StockException(NOT_FOUND_RELATED_STOCK);
    }
}
