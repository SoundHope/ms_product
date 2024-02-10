package com.uisrael.productMicroService.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uisrael.productMicroService.model.Product;
import com.uisrael.productMicroService.repository.IProductRepository;
import com.uisrael.productMicroService.service.IProductService;

@Component
@Service
public class ProductServiceImpl  implements IProductService{
	
	@Autowired
	private IProductRepository productRepository;

	@Override
	public void createProduct(Product product) {
		// TODO Auto-generated method stub
		try {
			productRepository.insert(product);
			System.out.println("Product created");
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		
	}

	@Override
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		try {
			products = productRepository.findAll();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		// TODO Auto-generated method stub
		return products;
	}

}
