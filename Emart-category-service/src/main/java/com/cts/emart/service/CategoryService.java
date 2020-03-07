package com.cts.emart.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.emart.dao.CategoryRepository;
import com.cts.emart.model.Category;

@Service
public class CategoryService {
		
		@Autowired
		CategoryRepository repo;

		public List<Category> getAllUsers() {
			return (List<Category>)repo.findAll();
			
		}

		public void addCategory(Category category) {
			repo.save(category);
			
		}

		public Optional<Category> getcategoryDetailsByID(int id) {
			return repo.findById(id);
		}

		public void updateCategory(Category category) {
			repo.save(category);
			
		}

		public void deleteCategory(int id) {
			repo.deleteById(id);
			
		}

		public Optional<Category> getCategoryDetailsByID(int id) {
			
			return repo.findById(id);
		}

		public Category getCategoryByCategoryName(String categoryname) {
			
			return repo.findByCategoryName(categoryname);
		}

		public List<Category> getAllCategory() {
		
			return (List<Category>)repo.findAll();
		}

		

}
