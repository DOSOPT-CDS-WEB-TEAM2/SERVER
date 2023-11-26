package org.sopt.api.portfolio.exception;

import org.sopt.common.exception.BaseCustomException;
import org.sopt.common.exception.ExceptionType;

public class PortfolioException extends BaseCustomException {
    public PortfolioException(ExceptionType exceptionType) {
        super(exceptionType);
    }
}
