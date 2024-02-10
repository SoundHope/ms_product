package com.uisrael.productMicroService.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.uisrael.productMicroService.model.ProductType;

public interface IProductTypeRepository extends MongoRepository<ProductType, String> {

}
