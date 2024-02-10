package com.uisrael.productMicroService.service;

import java.util.List;

import com.uisrael.productMicroService.model.Product;


public interface IProductService {
	
	public void createProduct(Product product);
	
	public List<Product> getProducts();

}
