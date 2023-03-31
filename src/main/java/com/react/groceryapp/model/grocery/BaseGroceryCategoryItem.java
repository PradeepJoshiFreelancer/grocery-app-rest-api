package com.react.groceryapp.model.grocery;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "category", "baseGroceryItemList" })
@Generated("jsonschema2pojo")
@Document(collection = "basegroceryitem")
public class BaseGroceryCategoryItem {
	
	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	@JsonProperty("category")
	private String category;
	@JsonProperty("baseGroceryItemList")
	private List<BaseGroceryItem> baseGroceryItemList;

	@JsonProperty("category")
	public String getCategory() {
		return category;
	}

	@JsonProperty("category")
	public void setCategory(String category) {
		this.category = category;
	}

	@JsonProperty("baseGroceryItemList")
	public List<BaseGroceryItem> getBaseGroceryItemList() {
		return baseGroceryItemList;
	}

	@JsonProperty("baseGroceryItemList")
	public void setBaseGroceryItemList(List<BaseGroceryItem> baseGroceryItemList) {
		this.baseGroceryItemList = baseGroceryItemList;
	}

}