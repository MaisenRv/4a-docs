package com.misiontic.products_ms.controllers;

import com.misiontic.products_ms.repositories.ProductRepository;
import com.misiontic.products_ms.models.ProductModel;

import java.util.List;

import com.misiontic.products_ms.exceptions.ProductNotFoundException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository){
        this.productRepository = productRepository; 
    }

    @GetMapping("/product/{nombre}")
    ProductModel getProduct(@PathVariable String nombre){
        return productRepository.findById(nombre).orElseThrow(()-> new ProductNotFoundException("El producto no existe"));
    }

    @PostMapping("/product")
    ProductModel newProduct(@RequestBody ProductModel product) {
        return productRepository.save(product);
    }

    @PutMapping("/updateProduct/{nombre}")
    ProductModel updateProduct (@RequestBody ProductModel productUpdate, @PathVariable String nombre){
        
        ProductModel product = productRepository.findById(nombre).orElseThrow(()-> new ProductNotFoundException("El producto no existe"));

        product.setNombre(productUpdate.getNombre());
        product.setDescripcion(productUpdate.getDescripcion());
        product.setCantidad(productUpdate.getCantidad());
        product.setTalla(productUpdate.getTalla());
        product.setTipo(productUpdate.getTipo());

        return productRepository.save(product);
    }

    @GetMapping("/products")
    List<ProductModel> allProducts(){
        List<ProductModel> allProducts = productRepository.findAll();
        return allProducts;
    }
}