package com.react.groceryapp.model.user;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"itemId",
"itemName",
"defaultQuantity",
"defaultUnitQuantity",
"amount",
"price"
})
@Generated("jsonschema2pojo")
public class CartItemList {

@JsonProperty("itemId")
private String itemId;
@JsonProperty("itemName")
private String itemName;
@JsonProperty("defaultQuantity")
private Integer defaultQuantity;
@JsonProperty("defaultUnitQuantity")
private String defaultUnitQuantity;
@JsonProperty("amount")
private Integer amount;
@JsonProperty("price")
private Integer price;

@JsonProperty("itemId")
public String getItemId() {
return itemId;
}

@JsonProperty("itemId")
public void setItemId(String itemId) {
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

@JsonProperty("amount")
public Integer getAmount() {
return amount;
}

@JsonProperty("amount")
public void setAmount(Integer amount) {
this.amount = amount;
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

