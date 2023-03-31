package com.react.groceryapp.model.user;

import java.util.List;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"orderDate",
"itemList",
"totalItems",
"totalCategories",
"totalPrice"
})
@Generated("jsonschema2pojo")
public class PreviousOrder {

@JsonProperty("orderDate")
private String orderDate;
@JsonProperty("itemList")
private List<Item> itemList;
@JsonProperty("totalItems")
private Integer totalItems;
@JsonProperty("totalCategories")
private Integer totalCategories;
@JsonProperty("totalPrice")
private Integer totalPrice;

@JsonProperty("orderDate")
public String getOrderDate() {
return orderDate;
}

@JsonProperty("orderDate")
public void setOrderDate(String orderDate) {
this.orderDate = orderDate;
}

@JsonProperty("itemList")
public List<Item> getItemList() {
return itemList;
}

@JsonProperty("itemList")
public void setItemList(List<Item> itemList) {
this.itemList = itemList;
}

@JsonProperty("totalItems")
public Integer getTotalItems() {
return totalItems;
}

@JsonProperty("totalItems")
public void setTotalItems(Integer totalItems) {
this.totalItems = totalItems;
}

@JsonProperty("totalCategories")
public Integer getTotalCategories() {
return totalCategories;
}

@JsonProperty("totalCategories")
public void setTotalCategories(Integer totalCategories) {
this.totalCategories = totalCategories;
}

@JsonProperty("totalPrice")
public Integer getTotalPrice() {
return totalPrice;
}

@JsonProperty("totalPrice")
public void setTotalPrice(Integer totalPrice) {
this.totalPrice = totalPrice;
}

}