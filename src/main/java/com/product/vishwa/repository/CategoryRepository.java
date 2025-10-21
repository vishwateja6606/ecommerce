package com.product.vishwa.repository;

import java.util.Optional;

//import java.util.Locale.Category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.vishwa.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long>{
	
	 Optional<Category> findByName(String categoryName);
	    void deleteByName(String categoryName);
}
