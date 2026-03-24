package com.springboot.mapper;

import com.springboot.dto.CategoryDTO;
import com.springboot.entity.CategoryEntity;

public class CategoryMapper {

	public static CategoryDTO toDTO(CategoryEntity entity) {
		CategoryDTO dto = new CategoryDTO(entity.getId(),entity.getName());
		return dto;
	}
	
	public static CategoryEntity toEntity(CategoryDTO dto) {
		CategoryEntity entity =new CategoryEntity(dto.getId(),dto.getName());
		return entity;
	}
}
