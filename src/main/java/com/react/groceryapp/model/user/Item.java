package com.react.groceryapp.model.user;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "catigory", "catigoryItemList" })
@Generated("jsonschema2pojo")
public class Item {

	@JsonProperty("category")
	private String category;
	@JsonProperty("cartItemList")
	private List<CartItemList> cartItemList;

	@JsonProperty("category")
	public String getCategory() {
		return category;
	}

	@JsonProperty("category")
	public void setCategory(String category) {
		this.category = category;
	}

	@JsonProperty("cartItemList")
	public List<CartItemList> getCartItemList() {
		return cartItemList;
	}

	@JsonProperty("cartItemList")
	public void setCartItemList(List<CartItemList> cartItemList) {
		this.cartItemList = cartItemList;
	}
}