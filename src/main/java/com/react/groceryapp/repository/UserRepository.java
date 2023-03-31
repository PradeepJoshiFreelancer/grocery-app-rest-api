package com.react.groceryapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.react.groceryapp.model.user.User;

public interface UserRepository extends MongoRepository<User, String> {


}
