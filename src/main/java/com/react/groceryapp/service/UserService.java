package com.react.groceryapp.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.react.groceryapp.model.user.User;
import com.react.groceryapp.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUser() {
    	return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id).orElse(null);
    }    
 
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    public void deleteUser(String id) {
    	userRepository.deleteById(id);
    }
}
