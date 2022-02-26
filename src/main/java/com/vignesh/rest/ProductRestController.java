package com.vignesh.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vignesh.entity.Product;
import com.vignesh.repo.ProductRepository;

@RestController
public class ProductRestController {

	@Autowired
	private ProductRepository repo;
	
	@PostMapping(value="/addproduct", consumes="application/json")
	public ResponseEntity<String> addProduct(@RequestBody Product product){
		repo.save(product);
		return new ResponseEntity<>("Product Saved",HttpStatus.CREATED);
	}
	
	@GetMapping(value="/getproducts",produces="application/json")
	public ResponseEntity<List<Product>> getProduct(){
		List<Product> list_of_products = repo.findAll();
		return new ResponseEntity<>(list_of_products,HttpStatus.OK);
	}
}
