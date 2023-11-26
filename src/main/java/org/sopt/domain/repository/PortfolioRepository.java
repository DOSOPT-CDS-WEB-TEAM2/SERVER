package org.sopt.domain.repository;

import static org.sopt.api.portfolio.exception.PortfolioExceptionType.NOT_FOUND_PORTFOLIO;

import java.util.Optional;
import org.sopt.api.portfolio.exception.PortfolioException;
import org.sopt.domain.Portfolio;
import org.springframework.data.repository.Repository;

public interface PortfolioRepository extends Repository<Portfolio, Long> {

    Optional<Portfolio> findById(Long id);

    default public Portfolio findByIdOrElseThrowException(Long id){
        return findById(id).orElseThrow(
                ()-> new PortfolioException(NOT_FOUND_PORTFOLIO));
    }
}
