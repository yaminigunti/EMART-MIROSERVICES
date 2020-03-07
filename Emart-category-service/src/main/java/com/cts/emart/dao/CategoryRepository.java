package com.cts.emart.dao;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;

import com.cts.emart.model.Category;

public interface CategoryRepository extends CrudRepository<Category, String> {
    Category findByCategoryName(String categoryName);

	Optional<Category> findById(int id);

	void deleteById(int id); 
}
