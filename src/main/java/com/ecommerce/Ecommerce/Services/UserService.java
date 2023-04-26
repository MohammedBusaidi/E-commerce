package com.ecommerce.Ecommerce.Services;

import com.ecommerce.Ecommerce.Models.User;
import com.ecommerce.Ecommerce.Repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    UserRepository userRepository;
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
