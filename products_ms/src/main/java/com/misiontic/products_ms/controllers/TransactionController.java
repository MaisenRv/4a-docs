package com.misiontic.products_ms.controllers;


import com.misiontic.products_ms.models.TransactionModel;
import com.misiontic.products_ms.exceptions.InsufficientProductsException;
import com.misiontic.products_ms.exceptions.ProductNotFoundException;
import com.misiontic.products_ms.models.ProductModel;
import com.misiontic.products_ms.repositories.ProductRepository;
import com.misiontic.products_ms.repositories.TransactionRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
    private final TransactionRepository transactionRepository;
    private final ProductRepository productRepository;

    public TransactionController(TransactionRepository transactionRepository,ProductRepository productRepository){
        this.transactionRepository = transactionRepository;
        this.productRepository = productRepository;
    }

    @PostMapping("/transaction")
    TransactionModel newTransaction(@RequestBody TransactionModel transaction){

        ProductModel product = productRepository.findById(transaction.getProducto()).orElse(null);

        if (product == null) {
            throw new ProductNotFoundException("No se emcontro el producto: " + transaction.getProducto());
        }

        if (transaction.getCantidad() > product.getCantidad() && transaction.getTipoTransaccion() == "Venta") {
            throw new InsufficientProductsException("No se dispone con suficientes productos");
        }

        if (transaction.getTipoTransaccion().equalsIgnoreCase("Venta")) {
            product.setCantidad(product.getCantidad() - transaction.getCantidad());
        }else if(transaction.getTipoTransaccion().equalsIgnoreCase("Compra")){
            product.setCantidad(product.getCantidad() + transaction.getCantidad());
        }
        productRepository.save(product);
        return transactionRepository.save(transaction);
    }

    @GetMapping("/transaction/{id}")
    TransactionModel getTransaction(@PathVariable String id){
        return transactionRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("El producto no existe"));
    }

    

}