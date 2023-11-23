package org.sopt.api.stockIndex.controller;

import static java.util.Collections.emptyList;

import jakarta.annotation.Nullable;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.sopt.api.stockIndex.controller.dto.response.GetStockIndexResponseDto;
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
    public ResponseEntity<List<GetStockIndexResponseDto>> getStockIndexList(
            @Nullable @RequestParam String continent) {

        if (continent == null) {
            // TODO: 전체 시장 지수 조회
            return ResponseEntity.ok(emptyList());
        }

        return ResponseEntity.ok(stockIndexService.getStockIndexByContinent(Continent.find(continent)));
    }

}
