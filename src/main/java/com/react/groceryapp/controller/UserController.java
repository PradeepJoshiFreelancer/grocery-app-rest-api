package com.react.groceryapp.controller;

import java.util.ArrayList;
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
import com.react.groceryapp.model.user.User;
import com.react.groceryapp.service.GroceryService;
import com.react.groceryapp.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private GroceryService groceryService;

	@GetMapping
	public List<User> getAllUsers() {
		return userService.getUser();
	}

	@GetMapping("/{id}")
	public ResponseEntity<User> getUserById(@PathVariable String id) {
		User user = userService.getUserById(id);
		if (user == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<>(user, HttpStatus.OK);
	}

	@GetMapping("/{id}/itemlist")
	public ResponseEntity<List<BaseGroceryCategoryItem>> getAllItemListForUser(@PathVariable String id) {
		User user = userService.getUserById(id);
		if (user == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		List<BaseGroceryCategoryItem> baseItemList = groceryService.getAllBaseGroceryCategoryItem();
		List<BaseGroceryCategoryItem> customItemList = user.getCustomItems();
		List<BaseGroceryCategoryItem> finalList = new ArrayList<BaseGroceryCategoryItem>();
		finalList.addAll(baseItemList);
		finalList.addAll(customItemList);
		return new ResponseEntity<>(finalList, HttpStatus.OK);
	}

	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User requestUser) {

		User savedBaseGroceryItem = userService.saveUser(requestUser);
		return new ResponseEntity<>(savedBaseGroceryItem, HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<User> updateUser(@PathVariable String id, @RequestBody User requestUser) {
		User existingUser = userService.getUserById(id);
		if (existingUser == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		requestUser.setId(id);
		User savedUser = userService.saveUser(requestUser);
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	}

	@PutMapping("/{id}/addcustomitem")
	public ResponseEntity<List<BaseGroceryCategoryItem>> addCustomItemforUser(@PathVariable String id,
			@RequestBody BaseGroceryCategoryItem requestCustomItem) {
		User existingUser = userService.getUserById(id);
		if (existingUser == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		List<BaseGroceryCategoryItem> existingCustomItemsList = existingUser.getCustomItems();
		BaseGroceryCategoryItem existingCustomItem = existingCustomItemsList.stream()
				.filter(item -> item.getCategory().equals(requestCustomItem.getCategory())).findFirst().orElse(null);
		if (existingCustomItem == null) {
			existingCustomItemsList.add(requestCustomItem);
		} else {
			List<BaseGroceryItem> baseGroceryItemList = existingCustomItem.getBaseGroceryItemList();
			baseGroceryItemList.addAll(requestCustomItem.getBaseGroceryItemList());
		}
		User savedUser = userService.saveUser(existingUser);
		return new ResponseEntity<>(savedUser.getCustomItems(), HttpStatus.CREATED);
	}
}