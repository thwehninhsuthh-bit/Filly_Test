package com.springboot.repository;

import java.util.Optional; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.springboot.entity.CategoryEntity;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity,Integer>{

	
	Optional<CategoryEntity> findByName(String name);
	@Query("select c from CategoryEntity c where c.name=:name")
	Optional<CategoryEntity> searchbyName(@Param("name")String name);
}
