package org.sopt.api.stock.exception;

import lombok.RequiredArgsConstructor;
import org.sopt.common.exception.BaseCustomException;
import org.sopt.common.exception.ExceptionType;

public class StockException extends BaseCustomException {
    public StockException(ExceptionType exceptionType){
        super(exceptionType);
    }
}
