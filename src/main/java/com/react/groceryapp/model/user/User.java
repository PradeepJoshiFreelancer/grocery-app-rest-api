package com.react.groceryapp.model.user;

import java.util.List;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.react.groceryapp.model.grocery.BaseGroceryCategoryItem;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "customItems", "isAdmin", "previousOrders", "roles", "userFirstName", "userId", "userLastName" })
@Generated("jsonschema2pojo")
@Document(collection = "user")
public class User {

	@Id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("customItems")
	private List<BaseGroceryCategoryItem> customItems;
	@JsonProperty("isAdmin")
	private Boolean isAdmin;
	@JsonProperty("previousOrders")
	private List<PreviousOrder> previousOrders;
	@JsonProperty("roles")
	private List<String> roles;
	@JsonProperty("userFirstName")
	private String userFirstName;
	@JsonProperty("userId")
	private Integer userId;
	@JsonProperty("userLastName")
	private String userLastName;

	@JsonProperty("customItems")
	public List<BaseGroceryCategoryItem> getCustomItems() {
		return customItems;
	}

	@JsonProperty("customItems")
	public void setCustomItems(List<BaseGroceryCategoryItem> customItems) {
		this.customItems = customItems;
	}

	@JsonProperty("isAdmin")
	public Boolean getIsAdmin() {
		return isAdmin;
	}

	@JsonProperty("isAdmin")
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	@JsonProperty("previousOrders")
	public List<PreviousOrder> getPreviousOrders() {
		return previousOrders;
	}

	@JsonProperty("previousOrders")
	public void setPreviousOrders(List<PreviousOrder> previousOrders) {
		this.previousOrders = previousOrders;
	}

	@JsonProperty("roles")
	public List<String> getRoles() {
		return roles;
	}

	@JsonProperty("roles")
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@JsonProperty("userFirstName")
	public String getUserFirstName() {
		return userFirstName;
	}

	@JsonProperty("userFirstName")
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	@JsonProperty("userId")
	public Integer getUserId() {
		return userId;
	}

	@JsonProperty("userId")
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@JsonProperty("userLastName")
	public String getUserLastName() {
		return userLastName;
	}

	@JsonProperty("userLastName")
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

}
