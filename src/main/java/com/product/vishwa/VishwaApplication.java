package com.product.vishwa;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
@OpenAPIDefinition(
		info=@Info(
				title="productlist",
				description="restapi",
				version="",
				contact=@Contact(
						name="vishwa",
						email="vishwateja@gmail.com")
				))
@SpringBootApplication
public class VishwaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VishwaApplication.class, args);
	}

}
