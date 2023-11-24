package org.sopt.api.stock.exception;

import lombok.RequiredArgsConstructor;
import org.sopt.common.exception.ExceptionType;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
public enum StockExceptionType implements ExceptionType {
    NOT_FOUND_STOCK(HttpStatus.NOT_FOUND, "존재하지 않는 주식입니다.");


    private final HttpStatus httpStatus;
    private final String string;

    @Override
    public HttpStatus httpStatus() {
        return httpStatus;
    }

    @Override
    public String message() {
        return string;
    }
}
