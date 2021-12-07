package com.misiontic.products_ms.repositories;


import com.misiontic.products_ms.models.TransactionModel    ;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TransactionRepository extends MongoRepository<TransactionModel,String>{
    
}