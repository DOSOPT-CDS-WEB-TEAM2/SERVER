package org.sopt.domain;

import static jakarta.persistence.EnumType.STRING;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "char")
    private String code;

    private String name;

    private String currentPrice;

    private float fluctuationRate;

    private String graphSummaryUrl;

    private String graphUrl;

    private String fluctuationPrice;

    private String previousDayClosingPrice;

    private String marketCapitalization;

    private String averageTrading;

    private String todayLowestPrice;

    private String todayHighestPrice;

    private String pastWeekLowestPrice;

    private String pastWeekHighestPrice;

    private float dividendYield;

    private float stockPriceReturn;

    private int tradeAmount;

    @JoinColumn(name = "portfolio_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Portfolio portfolio;

    @Enumerated(value = STRING)
    private Type type;
}
