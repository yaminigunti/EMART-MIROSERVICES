package com.cts.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.emart.model.Category;
import com.cts.emart.service.CategoryService;


	@RestController

	public class CategoryController {
		@Autowired
		CategoryService service;

		@RequestMapping("/category")
		List<Category> getAllCategory() {
			return service.getAllCategory();
		}
		
		@RequestMapping(method = RequestMethod.POST, value = "/category")
		void addCategory(@RequestBody Category category) {
			service.addCategory(category);
		}
		
		@RequestMapping("/category/{id}")
		Optional<Category> getCategoryDetailsByID(@PathVariable int id) {
			return service.getCategoryDetailsByID(id);
		}
		
		@RequestMapping(method = RequestMethod.PUT, value = "/category/")
		void updateCategory(@RequestBody Category category) {
			service.updateCategory(category);
		}
		
		@RequestMapping(method = RequestMethod.DELETE, value = "/category/{id}")
		void deleteCategory(@PathVariable int id) {
			service.deleteCategory(id);
		}
		
		
		@RequestMapping("/category/categoryName/{categoryName}")
		Category getCategoryByCategoryName(@PathVariable String categoryName){
			return service.getCategoryByCategoryName(categoryName);
		}
		
}
