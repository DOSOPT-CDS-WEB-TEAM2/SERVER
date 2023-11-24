package org.sopt.api.stockIndex.controller;

import jakarta.annotation.Nullable;
import lombok.RequiredArgsConstructor;
import org.sopt.api.stockIndex.service.StockIndexService;
import org.sopt.domain.Continent;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/stock-index")
@RestController
public class StockIndexController {

    private final StockIndexService stockIndexService;


    @GetMapping
    public ResponseEntity<Object> getStockIndexList(
            @Nullable @RequestParam String continent) {

        if (continent == null) {
            return ResponseEntity.ok(stockIndexService.getAllStockIndexAndGroupByContinent());
        }

        return ResponseEntity.ok(stockIndexService.getStockIndexByContinent(Continent.find(continent)));
    }

}
