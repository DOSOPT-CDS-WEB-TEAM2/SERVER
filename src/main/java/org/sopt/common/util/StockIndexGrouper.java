package org.sopt.common.util;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import org.sopt.domain.Continent;
import org.sopt.domain.StockIndex;

public class StockIndexGrouper {
    private final List<StockIndex> stockIndexList;

    public StockIndexGrouper(List<StockIndex> stockIndexList) {
        this.stockIndexList = stockIndexList;
    }

    public Map<Continent, List<StockIndex>> groupByContinent() {

        EnumMap<Continent, List<StockIndex>> result = new EnumMap<>(Continent.class);

        for (StockIndex stockIndex : stockIndexList) {
            Continent continent = stockIndex.getContinent();
            result.computeIfAbsent(continent, k -> new ArrayList<>()).add(stockIndex);
        }

        return result;
    }

}
