package com.misiontic.products_ms.controllers;

import com.misiontic.products_ms.repositories.ProductRepository;
import com.misiontic.products_ms.models.ProductModel;
import com.misiontic.products_ms.exceptions.ProductNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository; 
    }

    @GetMapping("/product/{id}")
    ProductModel getProduct(@PathVariable String id){
        return productRepository.findById(id).orElseThrow(()-> new ProductNotFoundException("El producto no existe"));
    }

    @PostMapping("/product")
    ProductModel newProduct(@RequestBody ProductModel product) {
        return productRepository.save(product);
    }
}