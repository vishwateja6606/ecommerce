package com.product.vishwa.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.vishwa.Dto.Categorydto;
import com.product.vishwa.service.CategoryService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/categories")
@AllArgsConstructor
public class CategoriesController {
	private CategoryService categoryservice;
	@PreAuthorize("hasAuthority('ADMIN')")
	@DeleteMapping("/{id}")
	public void deletecategory(@PathVariable Long id) {
		categoryservice.deletecategory(id);
	}

	@GetMapping
	   public List<Categorydto> getAllCategories(){
        return categoryservice.getallcategory();
    }
	@PreAuthorize("hasAuthority('ADMIN')")
	@PostMapping
	  public ResponseEntity<?> createCategory(@RequestBody Categorydto categoryDTO){
        Categorydto savedCategory = categoryservice.createCategory(categoryDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedCategory);

}
	
	

}
