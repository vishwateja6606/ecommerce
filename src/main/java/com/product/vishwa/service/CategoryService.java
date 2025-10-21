package com.product.vishwa.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import java.util.Locale.Category;

import com.product.vishwa.Dto.Categorydto;
import com.product.vishwa.mapper.CategoryMapper;
import com.product.vishwa.repository.CategoryRepository;

import lombok.AllArgsConstructor;

import com.product.vishwa.entity.*;

//business logic
@Service
@AllArgsConstructor
public class CategoryService {
	@Autowired
      private CategoryRepository categoryRepository;
	//create category
	public Categorydto createCategory(Categorydto categorydto) {
		Category category = CategoryMapper.toCategoryEntity(categorydto);
		category=categoryRepository.save(category);
		categorydto =CategoryMapper.toCategorydto(category);
		return categorydto;
	}
	//get all  category
	public List<Categorydto>getallcategory(){
		return categoryRepository.findAll().stream().map(CategoryMapper::toCategorydto).toList();
	}
	//delete category
	public void deletecategory(Long id){
		categoryRepository.deleteById(id);
	}
	
}


