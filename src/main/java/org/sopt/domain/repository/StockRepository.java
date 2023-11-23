package org.sopt.domain.repository;

import java.util.List;
import org.sopt.domain.Continent;
import org.sopt.domain.StockIndex;
import org.springframework.data.repository.Repository;

public interface StockRepository extends Repository<StockIndex, Long> {
    List<StockIndex> findAllByContinent(Continent continent);
}
