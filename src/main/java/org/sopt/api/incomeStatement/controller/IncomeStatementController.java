package org.sopt.api.incomeStatement.controller;

import lombok.RequiredArgsConstructor;
import org.sopt.api.incomeStatement.controller.dto.response.GetIncomeStatementResponseDto;
import org.sopt.api.incomeStatement.service.IncomeStatementService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/income-statement")
@RestController
public class IncomeStatementController {
    private final IncomeStatementService incomeStatementService;

    @GetMapping("/{stockCode}")
    public ResponseEntity<GetIncomeStatementResponseDto> getIncomeStatement(@PathVariable String stockCode) {
        return ResponseEntity.ok(incomeStatementService.getIncomeStatement(stockCode));

    }
}
