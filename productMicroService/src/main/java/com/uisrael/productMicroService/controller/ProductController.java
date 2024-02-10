package com.uisrael.productMicroService.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.uisrael.productMicroService.model.ProductType;
import com.uisrael.productMicroService.service.IProductTypeService;

@RestController
@RequestMapping("/api/productType")
public class ProductController {
	
	
	@Autowired
	private IProductTypeService productTypeService;
	
	@PostMapping()
	@ResponseStatus(value = HttpStatus.CREATED)
	public void createProduct(@RequestBody ProductType product) {
		try {
			productTypeService.createProductType(product);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
	@GetMapping()
	@ResponseStatus(value = HttpStatus.OK)
	public List<ProductType> listProducts() {
		List<ProductType> products = null;
		try {
			products = productTypeService.getProductTypes();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return products;
	}

}
