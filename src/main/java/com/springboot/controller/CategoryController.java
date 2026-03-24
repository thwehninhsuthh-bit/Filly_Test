package com.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dto.CategoryDTO;
import com.springboot.exception.SuccessResponse;
import com.springboot.service.CategoryService;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@RestController
@RequestMapping("/category")
public class CategoryController {

	private final CategoryService catService;
	@PostMapping("/create")
	
	public  ResponseEntity<SuccessResponse<CategoryDTO>> crateCategory(@RequestBody CategoryDTO dto) {
		CategoryDTO resDTO=catService.createCategory(dto);
		
		SuccessResponse<CategoryDTO>response = new SuccessResponse<CategoryDTO>(
				"create successful",resDTO);
		return ResponseEntity.status(HttpStatus.CREATED).body(response);
	}
	@GetMapping("/list")
	public List<CategoryDTO> getAllCategories(){
		return catService.getAllCategories();
	}
	@GetMapping("/getbyid/{id}")
	public CategoryDTO getById(@PathVariable Integer id) {
		return catService.getById(id);
		
		
	}
	@PutMapping("/update/{id}")
	public CategoryDTO updateCategory(@PathVariable Integer id,@RequestBody CategoryDTO dto) {
		return catService.updateCategory(id, dto);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteCategory(@PathVariable Integer id) {
	    catService.deleteCategory(id);
	    return "Category deleted successfully with id: " + id;
	}
	@GetMapping("/findbyname")
	public CategoryDTO findByName(@RequestParam String name) {
		return catService.findByName(name);
		
	}
	@GetMapping("/searchbyname")
	public CategoryDTO searchbyName(@RequestParam String name) {
		return catService.searchbyName(name);
		
	}
}
