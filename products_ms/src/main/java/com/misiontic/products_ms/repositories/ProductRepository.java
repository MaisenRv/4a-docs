package com.misiontic.products_ms.repositories;

import com.misiontic.products_ms.models.ProductModel    ;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository <ProductModel, String>{
    
}