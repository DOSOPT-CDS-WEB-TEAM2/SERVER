package org.sopt.api.incomeStatement.exception;

import lombok.RequiredArgsConstructor;
import org.sopt.common.exception.ExceptionType;
import org.springframework.http.HttpStatus;

@RequiredArgsConstructor
public enum IncomeStatementExceptionType implements ExceptionType {
    NOT_FOUND_INCOME_STATEMENT(HttpStatus.NOT_FOUND, "손익 계산서가 존재하지 않습니다.");

    private final HttpStatus httpStatus;
    private final String message;

    @Override
    public HttpStatus httpStatus() {
        return httpStatus;
    }

    @Override
    public String message() {
        return message;
    }
}
