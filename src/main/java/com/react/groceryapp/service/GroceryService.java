package com.react.groceryapp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.groceryapp.model.grocery.BaseGroceryCategoryItem;
import com.react.groceryapp.repository.GroceryRepository;

@Service
public class GroceryService {

    @Autowired
    private GroceryRepository groceryRepository;

    public List<BaseGroceryCategoryItem> getAllBaseGroceryCategoryItem() {
        return groceryRepository.findAll();
    }

    public BaseGroceryCategoryItem getBaseGroceryItemById(String id) {
        return groceryRepository.findById(id).orElse(null);
    }
    
    public BaseGroceryCategoryItem getBaseGroceryItemByCategory(String category) {
        return groceryRepository.findAll(category);
    }

    public BaseGroceryCategoryItem saveBaseGroceryCategoryItem(BaseGroceryCategoryItem baseGroceryCategoryItem) {
        return groceryRepository.save(baseGroceryCategoryItem);
    }
    
    public List<BaseGroceryCategoryItem> saveBaseGroceryItems(List <BaseGroceryCategoryItem> baseGroceryItems) {
        return groceryRepository.saveAll(baseGroceryItems);
    }

    public void deleteBaseGroceryCategoryItem(String id) {
    	groceryRepository.deleteById(id);
    }
}
