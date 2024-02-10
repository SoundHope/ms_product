package com.uisrael.productMicroService.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.productMicroService.model.ProductType;
import com.uisrael.productMicroService.repository.IProductTypeRepository;
import com.uisrael.productMicroService.service.IProductTypeService;

@Component
@Service
public class ProductTypeServiceImpl  implements IProductTypeService{
	
	@Autowired
	private IProductTypeRepository productTypeRepository;

	@Override
	public void createProductType(ProductType productType) {
		// TODO Auto-generated method stub
		try {
			productTypeRepository.insert(productType);
			System.out.println("ProductType created");
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
	}

	@Override
	public List<ProductType> getProductTypes() {
		// TODO Auto-generated method stub
		List<ProductType> productTypes = new ArrayList<ProductType>();
		try {
			productTypes = productTypeRepository.findAll();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return productTypes;
	}
	
}
