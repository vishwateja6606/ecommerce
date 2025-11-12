package com.product.vishwa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.vishwa.Dto.Productdto;
import com.product.vishwa.service.ProductService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/product")
@AllArgsConstructor
public class ProductController {
	@Autowired
	private ProductService productservice;
	//getall products
	@GetMapping
	public List<Productdto>getallproducts(){
		
		return productservice.getallproducts();
	}
	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping("/{id}")
	public void deletecatgory(@PathVariable Long id) {
		productservice.deletecategory(id);
		
	}
	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping
	public Productdto createproduct(@RequestBody Productdto productdto ) {
		
		productdto =productservice.createProduct(productdto);
		return productdto;
	}
	
	
	

}
