package com.cts.bas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.bas.entity.OrdersEntity;
import com.cts.bas.model.Category;
import com.cts.bas.model.Orders;
import com.cts.bas.model.Products;
import com.cts.bas.model.SubCategory;
import com.cts.bas.service.CategoryService;
import com.cts.bas.service.OrdersService;
import com.cts.bas.service.ProductsService;
import com.cts.bas.service.SubCategoryService;

@RestController
public class BuyerController {

	@Autowired
	public CategoryService service;

	@Autowired
	public ProductsService serv;

	@Autowired
	public SubCategoryService sub;

	@Autowired
	public OrdersService ord;

	@RequestMapping("categories/{categoryName}")
	public ResponseEntity<Category> getByCategoryName(@PathVariable(name = "categoryName") String categoryName) {
		ResponseEntity<Category> result;
		Category entity = service.findByCategoryName(categoryName).orElse(null);
		if (null != entity) {
			result = new ResponseEntity<Category>(entity, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Category>(HttpStatus.NOT_FOUND);
		}
		return result;
	}
	

	@RequestMapping("products/{productName}")
	public ResponseEntity<Products> getByProductName(@PathVariable(name = "productName") String productName) {
		ResponseEntity<Products> result;
		Products ent = serv.findByProductName(productName).orElse(null);
		if (null != ent) {
			result = new ResponseEntity<Products>(ent, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Products>(HttpStatus.NOT_FOUND);
		}
		return result;
	}

	@RequestMapping("subcategories/{subCategoryName}")
	public ResponseEntity<SubCategory> getBySubCategoryName(
			@PathVariable(name = "subCategoryName") String subCategoryName) {
		ResponseEntity<SubCategory> result;
		SubCategory ent = sub.findBySubCategoryName(subCategoryName).orElse(null);
		if (null != ent) {
			result = new ResponseEntity<SubCategory>(ent, HttpStatus.OK);
		} else {
			result = new ResponseEntity<SubCategory>(HttpStatus.NOT_FOUND);
		}
		return result;
	}

	@RequestMapping("orders/{orderId}")
	public ResponseEntity<Orders> getById(@PathVariable(name = "orderId") int orderId) {
		ResponseEntity<Orders> result;
		Orders ent = ord.findById(orderId);
		if (null != ent) {
			result = new ResponseEntity<Orders>(ent, HttpStatus.OK);
		} else {
			result = new ResponseEntity<Orders>(HttpStatus.NOT_FOUND);
		}
		return result;
	}

	@RequestMapping("/orders")
	public ResponseEntity<List<OrdersEntity>> findAll() {
		return new ResponseEntity<List<OrdersEntity>>(HttpStatus.OK);
	}

}