package com.misiontic.products_ms.exceptions;

public class InsufficientProductsException extends RuntimeException{
    public InsufficientProductsException (String mensaje){
        super(mensaje);
    }
}