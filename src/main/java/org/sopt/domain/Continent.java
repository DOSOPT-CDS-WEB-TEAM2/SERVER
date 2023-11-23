package org.sopt.domain;

import static org.sopt.api.stockIndex.exception.StockIndexExceptionType.NOT_FOUND_CONTINENT;

import lombok.Getter;
import org.sopt.api.stockIndex.exception.StockIndexException;

@Getter
public enum Continent {
    AMERICA, EUROPE, MIDDLE_EAST, AFRICA, ASIA;

    public static Continent find(String continent) {
        for (Continent c : values()) {
            if (c.name().equalsIgnoreCase(continent)) {
                return c;
            }
        }
        throw new StockIndexException(NOT_FOUND_CONTINENT);
    }
}
