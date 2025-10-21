package com.product.vishwa.Dto;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Productdto {
     private Long id;
     private String name;
     private String description;
     private Double price;
     private Long CategoryId;
}
