package com.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.ProductDTO;


@RestController
@RequestMapping("/api/products")
@CrossOrigin("http://localhost:5173/")
public class ProductController {

	@GetMapping
	public List<ProductDTO> getProduct() {
	    List<ProductDTO> products = new ArrayList<>();
	    
	    // Add items normally
	    products.add(new ProductDTO(1, "AAA", 23.1, ""));
	    products.add(new ProductDTO(2, "BBB", 45.5, ""));
	    products.add(new ProductDTO(3, "CCC", 10.0, ""));
	    
	    return products;
	}
	@GetMapping("/{id}")
	public ProductDTO getProductById(@PathVariable int id) {
		ProductDTO product=new ProductDTO(id,"Get Product",5.000,"");
		return product;
	}
	
}
