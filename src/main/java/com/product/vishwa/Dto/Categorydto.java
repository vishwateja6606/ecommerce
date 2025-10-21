package com.product.vishwa.Dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categorydto {
	private Long id;
	private String name;
	private List<Productdto>products;

}
