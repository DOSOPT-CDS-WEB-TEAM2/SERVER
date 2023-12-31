package org.sopt.api.stock.controller;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.sopt.api.stock.controller.dto.response.GetRelatedStockResponseDto;
import org.sopt.api.stock.controller.dto.response.GetStockOrderByTradeAmountResponseDto;
import org.sopt.api.stock.controller.dto.response.GetStockResponseDto;
import org.sopt.api.stock.service.StockService;
import org.sopt.domain.Order;
import org.sopt.domain.Type;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
@RequiredArgsConstructor
public class StockController {

    private final StockService stockService;

    @GetMapping("/{stockCode}")
    public ResponseEntity<GetStockResponseDto> getStock(@PathVariable String stockCode) {
        return ResponseEntity.ok(stockService.getStock(stockCode));
    }

    @GetMapping(params = "type")
    public ResponseEntity<List<GetRelatedStockResponseDto>> getRelatedStockList(
            @RequestParam String type) {

        return ResponseEntity.ok(stockService.getRelatedStockList(Type.find(type)));
    }

    @GetMapping(params = "order")
    public ResponseEntity<List<GetStockOrderByTradeAmountResponseDto>> getStockOrderByTrading(
            @RequestParam String order
    ){
        return ResponseEntity.ok(stockService.getStockOrderByTrading(Order.find(order)));
    }
}
