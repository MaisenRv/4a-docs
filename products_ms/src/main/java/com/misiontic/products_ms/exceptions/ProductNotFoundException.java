package com.misiontic.products_ms.exceptions;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException(String mensaje){
        super(mensaje);    
    }
}