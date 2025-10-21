package com.product.vishwa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.vishwa.Dto.Productdto;
import com.product.vishwa.entity.Category;
import com.product.vishwa.entity.Product;
import com.product.vishwa.exceptions.CategoryNotFoundException;
import com.product.vishwa.mapper.ProductMapper;
import com.product.vishwa.repository.CategoryRepository;
import com.product.vishwa.repository.ProductRepository;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class ProductService {
	
	private ProductRepository productrepository;
	
	private CategoryRepository categoryrepository;
	
	  public Productdto createProduct(Productdto productDTO){

	        Category category= categoryrepository.findById(productDTO.getCategoryId())
	                .orElseThrow(()-> new CategoryNotFoundException("Category id: "
	                        + productDTO.getCategoryId() + " not found!"));

	        // DTO -> entity
	        Product product = ProductMapper.toProductEntity(productDTO, category);
	        product = productrepository.save(product);
	        // Entity -> DTO
	        return ProductMapper.toProductdto(product);

	    }
	  public List<Productdto>getallproducts(){
		  return productrepository.findAll().stream().map(ProductMapper::toProductdto).toList();
	  }
	  public void deletecategory(Long id) {
		  productrepository.deleteById(id);
	  }
	  
}