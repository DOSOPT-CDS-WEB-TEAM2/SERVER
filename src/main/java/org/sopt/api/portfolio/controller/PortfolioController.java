package org.sopt.api.portfolio.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.sopt.api.portfolio.controller.dto.response.GetPortfolioResponseDto;
import org.sopt.api.portfolio.service.PortfolioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/portfolio")
@RequiredArgsConstructor
public class PortfolioController {

    private final PortfolioService portfolioService;
    @RequestMapping
    public ResponseEntity<List<GetPortfolioResponseDto>> getPortfolio(){
        return ResponseEntity.ok(portfolioService.getPortfolio());
    }
}
