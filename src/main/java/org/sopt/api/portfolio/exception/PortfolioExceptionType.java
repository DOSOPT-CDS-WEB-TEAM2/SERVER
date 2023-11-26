package org.sopt.api.portfolio.exception;

import lombok.RequiredArgsConstructor;
import org.sopt.common.exception.ExceptionType;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
public enum PortfolioExceptionType implements ExceptionType {
    NOT_FOUND_PORTFOLIO(HttpStatus.NOT_FOUND, "존재하지 않는 포토폴리오입니다.");


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
