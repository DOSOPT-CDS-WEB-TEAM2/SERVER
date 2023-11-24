package org.sopt.domain;

import static org.sopt.api.stockIndex.exception.StockIndexExceptionType.NOT_FOUND_CONTINENT;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.sopt.api.stockIndex.exception.StockIndexException;

@RequiredArgsConstructor
@Getter
public enum Continent {
    AMERICA("미국"), EUROPE("유럽"), MIDDLE_EAST("중동"), AFRICA("아프리카"), ASIA("아시아");

    private final String korean;

    public static Continent find(String continent) {
        for (Continent c : values()) {
            if (c.name().equalsIgnoreCase(continent)) {
                return c;
            }
        }
        throw new StockIndexException(NOT_FOUND_CONTINENT);
    }
}
