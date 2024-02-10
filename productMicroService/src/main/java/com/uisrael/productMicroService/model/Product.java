package com.uisrael.productMicroService.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Document(collection = "product")
public class Product{
	
	@Id
	private String id;
	private String name;
	private String description;
	private double price;
	private boolean state;
	
	@DBRef
	private ProductType productType;

}
