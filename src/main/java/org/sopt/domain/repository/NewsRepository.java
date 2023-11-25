package org.sopt.domain.repository;

import java.util.List;
import org.sopt.domain.News;
import org.sopt.domain.Stock;
import org.springframework.data.repository.Repository;

public interface NewsRepository extends Repository<News, Long> {
    List<News> findAll();

    List<News> findAllByStock(Stock stock);
}
