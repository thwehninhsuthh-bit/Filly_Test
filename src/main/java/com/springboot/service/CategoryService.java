package com.springboot.service;

import java.util.List;

import org.springframework.stereotype.Service;



import com.springboot.dto.CategoryDTO;
import com.springboot.entity.CategoryEntity;
import com.springboot.exception.CategoryNotFoundExpection;
import com.springboot.mapper.CategoryMapper;
import com.springboot.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryService {
  
  private final CategoryRepository cateRepo;

  public CategoryDTO createCategory(CategoryDTO dto) {
    
  CategoryEntity output=cateRepo.save(CategoryMapper.toEntity(dto));
    return CategoryMapper.toDTO(output);
  }
  
  public List<CategoryDTO> getAllCategories(){
    
    List<CategoryEntity> entityList=cateRepo.findAll();
  return   entityList
    .stream()
    .map(CategoryMapper::toDTO)
    .toList();
  }
  
  public CategoryDTO getById(Integer id) {
    
  CategoryEntity entity=  cateRepo
    .findById(id)
    .orElseThrow(()->new RuntimeException("Category Not Found"));
    return CategoryMapper.toDTO(entity);
  }
  public CategoryDTO updateCategory(Integer id,CategoryDTO dto) {
	  
	  CategoryEntity entity=  cateRepo
			    .findById(id)
			    .orElseThrow(()->new CategoryNotFoundExpection("Category Not Found"));
	  entity.setName(dto.getName());
	 CategoryEntity resultEntity= cateRepo.save(entity);
	 return CategoryMapper.toDTO(resultEntity);
  }
  
public void deleteCategory(Integer id) {
   // Check if exists first to provide a better error message
   if (!cateRepo.existsById(id)) {
       throw new CategoryNotFoundExpection("Category with ID " + id + " not found");
   }
   cateRepo.deleteById(id);
}
  public CategoryDTO findByName(String name) {
	  
	  CategoryEntity entity= cateRepo.findByName(name)
			  .orElseThrow(()->new CategoryNotFoundExpection("Category Not Found"));;
	  return CategoryMapper.toDTO(entity);
  }
  
  
 public CategoryDTO searchbyName(String name) {
	  
	  CategoryEntity entity= cateRepo.searchbyName(name)
			  .orElseThrow(()->new CategoryNotFoundExpection("Category Not Found"));;
	  return CategoryMapper.toDTO(entity);
  }
}