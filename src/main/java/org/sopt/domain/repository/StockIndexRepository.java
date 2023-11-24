package org.sopt.domain.repository;

import java.util.List;
import org.sopt.domain.Continent;
import org.sopt.domain.StockIndex;
import org.springframework.data.repository.Repository;

public interface StockIndexRepository extends Repository<StockIndex, Long> {

    List<StockIndex> findAll();

    List<StockIndex> findAllByContinent(Continent continent);
}
