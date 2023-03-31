package com.react.groceryapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.react.groceryapp.model.grocery.BaseGroceryCategoryItem;
import com.react.groceryapp.model.grocery.BaseGroceryItem;
import com.react.groceryapp.service.GroceryService;

@RestController
@RequestMapping("/api/basegroceryitem")
public class BaseGroceryCategoryItemController {

	@Autowired
	private GroceryService groceryService;

	@GetMapping
	public List<BaseGroceryCategoryItem> getAllBaseGroceryItems() {
		return groceryService.getAllBaseGroceryCategoryItem();
	}

	@GetMapping("/{id}")
	public ResponseEntity<BaseGroceryCategoryItem> getBaseGroceryItemById(@PathVariable String id) {
		BaseGroceryCategoryItem baseGroceryItem = groceryService.getBaseGroceryItemById(id);
		if (baseGroceryItem == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(baseGroceryItem, HttpStatus.OK);
	}

	@GetMapping("/category/{category}")
	public ResponseEntity<BaseGroceryCategoryItem> getBaseGroceryItemByCategory(@PathVariable String category) {
		return new ResponseEntity<>(groceryService.getBaseGroceryItemByCategory(category), HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<BaseGroceryCategoryItem> createBaseGroceryCategoryItem(
			@RequestBody BaseGroceryCategoryItem requestBaseGroceryCategoryItem) {
		BaseGroceryCategoryItem existingBaseGroceryCategoryItem = groceryService
				.getBaseGroceryItemByCategory(requestBaseGroceryCategoryItem.getCategory());

		if (existingBaseGroceryCategoryItem == null) {
			BaseGroceryCategoryItem baseGroceryItem = groceryService
					.saveBaseGroceryCategoryItem(requestBaseGroceryCategoryItem);
			return new ResponseEntity<>(baseGroceryItem, HttpStatus.CREATED);
		}
		List<BaseGroceryItem> existingBaseGroceryItemList = existingBaseGroceryCategoryItem.getBaseGroceryItemList();
		existingBaseGroceryItemList.addAll(requestBaseGroceryCategoryItem.getBaseGroceryItemList());
		BaseGroceryCategoryItem savedBaseGroceryItem = groceryService
				.saveBaseGroceryCategoryItem(existingBaseGroceryCategoryItem);
		return new ResponseEntity<>(savedBaseGroceryItem, HttpStatus.CREATED);
	}

	@PostMapping("/saveall")
	public ResponseEntity<List<BaseGroceryCategoryItem>> createBaseGroceryItemList(
			@RequestBody List<BaseGroceryCategoryItem> requestBaseGroceryItemList) {
		List<BaseGroceryCategoryItem> baseGroceryItemList = groceryService
				.saveBaseGroceryItems(requestBaseGroceryItemList);
		return new ResponseEntity<>(baseGroceryItemList, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<BaseGroceryCategoryItem> updateBaseGroceryItem(@PathVariable String id,
			@RequestBody BaseGroceryCategoryItem requestBaseGroceryItem) {
		BaseGroceryCategoryItem existingBaseGroceryItem = groceryService.getBaseGroceryItemById(id);
		if (existingBaseGroceryItem == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		requestBaseGroceryItem.setId(id);
		BaseGroceryCategoryItem savedBaseGroceryItem = groceryService
				.saveBaseGroceryCategoryItem(requestBaseGroceryItem);
		return new ResponseEntity<>(savedBaseGroceryItem, HttpStatus.CREATED);
	}
}