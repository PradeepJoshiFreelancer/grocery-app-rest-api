package com.react.groceryapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.react.groceryapp.model.grocery.BaseGroceryCategoryItem;

public interface GroceryRepository extends MongoRepository<BaseGroceryCategoryItem, String> {

    @Query(value="{category:'?0'}")
    BaseGroceryCategoryItem findAll(String category);
    
    public long count();
}
