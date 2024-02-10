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

import com.uisrael.productMicroService.model.Product;
import com.uisrael.productMicroService.model.ProductType;
import com.uisrael.productMicroService.service.IProductService;
import com.uisrael.productMicroService.service.IProductTypeService;

@RestController
@RequestMapping("/api/product")
public class ProductTypeController {
	
	@Autowired
	private IProductService productService;
	
	@Autowired
	private IProductTypeService productTypeService;
	
	@PostMapping()
	@ResponseStatus(value = HttpStatus.CREATED)
	public void createProduct(@RequestBody Product product) {
		try {
			if (product.getProductType() != null) {
				ProductType productype = product.getProductType();
				productTypeService.createProductType(productype);
            }
			productService.createProduct(product);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
	
	@GetMapping()
	@ResponseStatus(value = HttpStatus.OK)
	public List<Product> listProducts() {
		List<Product> products = null;
		try {
			products = productService.getProducts();
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		return products;
	}

}
