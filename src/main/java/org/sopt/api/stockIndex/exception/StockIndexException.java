package org.sopt.api.stockIndex.exception;

import org.sopt.common.exception.BaseCustomException;
import org.sopt.common.exception.ExceptionType;

public class StockIndexException extends BaseCustomException {

    public StockIndexException(ExceptionType exceptionType) {
        super(exceptionType);
    }
}
