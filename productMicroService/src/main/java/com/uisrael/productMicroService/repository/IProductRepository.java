package com.uisrael.productMicroService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.productMicroService.model.Product;

public interface IProductRepository extends MongoRepository<Product, String> {

}
