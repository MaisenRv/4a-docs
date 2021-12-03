package com.misiontic.products_ms.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
@ResponseBody
public class InsufficientProductsAdvice {

    @ResponseBody
    @ExceptionHandler(InsufficientProductsException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    String InsufficientProducts(InsufficientProductsException ex){
        return ex.getMessage();
    }
}