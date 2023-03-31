package com.react.groceryapp.model.grocery;

import javax.annotation.Generated;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "itemId","defaultQuantity", "defaultUnitQuantity", "img", "isBaseItem", "itemName", "price" })
@Generated("jsonschema2pojo")
public class BaseGroceryItem {

	@JsonProperty("itemId")
	@Id
	private Long itemId;
	@JsonProperty("defaultQuantity")
	private Integer defaultQuantity;
	@JsonProperty("defaultUnitQuantity")
	private String defaultUnitQuantity;
	@JsonProperty("img")
	private String img;
	@JsonProperty("isBaseItem")
	private Boolean isBaseItem;
	@JsonProperty("itemName")
	private String itemName;
	@JsonProperty("price")
	private Integer price;

	@JsonProperty("defaultQuantity")
	public Integer getDefaultQuantity() {
		return defaultQuantity;
	}

	@JsonProperty("defaultQuantity")
	public void setDefaultQuantity(Integer defaultQuantity) {
		this.defaultQuantity = defaultQuantity;
	}

	@JsonProperty("defaultUnitQuantity")
	public String getDefaultUnitQuantity() {
		return defaultUnitQuantity;
	}

	@JsonProperty("defaultUnitQuantity")
	public void setDefaultUnitQuantity(String defaultUnitQuantity) {
		this.defaultUnitQuantity = defaultUnitQuantity;
	}

	@JsonProperty("img")
	public String getImg() {
		return img;
	}

	@JsonProperty("img")
	public void setImg(String img) {
		this.img = img;
	}

	@JsonProperty("isBaseItem")
	public Boolean getIsBaseItem() {
		return isBaseItem;
	}

	@JsonProperty("isBaseItem")
	public void setIsBaseItem(Boolean isBaseItem) {
		this.isBaseItem = isBaseItem;
	}

	@JsonProperty("itemId")
	public Long getItemId() {
		return itemId;
	}

	@JsonProperty("itemId")
	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	@JsonProperty("itemName")
	public String getItemName() {
		return itemName;
	}

	@JsonProperty("itemName")
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@JsonProperty("price")
	public Integer getPrice() {
		return price;
	}

	@JsonProperty("price")
	public void setPrice(Integer price) {
		this.price = price;
	}
}