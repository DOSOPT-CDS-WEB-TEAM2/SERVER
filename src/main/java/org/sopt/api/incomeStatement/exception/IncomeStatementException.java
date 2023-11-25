package org.sopt.api.incomeStatement.exception;

import org.sopt.common.exception.BaseCustomException;
import org.sopt.common.exception.ExceptionType;

public class IncomeStatementException extends BaseCustomException {
    public IncomeStatementException(ExceptionType exceptionType) {
        super(exceptionType);
    }
}
