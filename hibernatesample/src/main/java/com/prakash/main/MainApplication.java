package com.prakash.main;

import com.prakash.entities.ProductsEntity;
import com.prakash.repositories.ProductsRepository;

public class MainApplication {
	
	public static void main(String args[]){
		ProductsEntity productsEntity= new ProductsEntity();
		productsEntity.setName("Sunglass");
		productsEntity.setPrice(100.23);
		
		ProductsRepository productsRepository = new ProductsRepository();
		productsRepository.save(productsEntity);
	}
}
