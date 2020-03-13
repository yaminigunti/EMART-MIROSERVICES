package com.cts.bas.service;

import java.util.Optional;

import com.cts.bas.model.Category;

public interface CategoryService {

	Optional<Category> findByCategoryName(String categoryName);

	
}
