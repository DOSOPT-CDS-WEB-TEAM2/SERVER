package org.sopt.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class IncomeStatement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "stock_code")
    @OneToOne(fetch = FetchType.LAZY)
    private Stock stock;

    private String income;

    private float comparedIncome;

    private String profitMargin;

    private float comparedProfitMargin;

    private String operatingExpenses;

    private float comparedOperatingExpenses;

    private String incomePerShare;

    private float comparedIncomePerShare;

    private String ebitda;

    private float comparedEbitda;

    private String effectiveTaxRate;

    private float comparedEffectiveTaxRate;
}
