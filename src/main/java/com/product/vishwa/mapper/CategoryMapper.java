package com.product.vishwa.mapper;

import com.product.vishwa.Dto.Categorydto;
import com.product.vishwa.entity.Category;

public class CategoryMapper {
	
	public static Category toCategoryEntity(Categorydto categorydto) {
		Category category = new Category();
		category.setName(categorydto.getName());
		return category;
	}
	public static Categorydto toCategorydto(Category category){
        if(category == null){
            return null;
        }
        Categorydto categoryDTO = new Categorydto();

        categoryDTO.setId(category.getId());
        categoryDTO.setName(category.getName());
        categoryDTO.setProducts(category.getProducts().stream()
                .map(ProductMapper::toProductdto).toList());
        return categoryDTO;
    }
}

