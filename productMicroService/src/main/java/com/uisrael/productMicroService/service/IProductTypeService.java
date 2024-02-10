package com.uisrael.productMicroService.service;

import java.util.List;

import com.uisrael.productMicroService.model.ProductType;


public interface IProductTypeService {
	
	public void createProductType(ProductType productType);
	
	public List<ProductType> getProductTypes();

}
