package com.ecommerce.Ecommerce.Controllers;


import com.ecommerce.Ecommerce.Models.User;
import com.ecommerce.Ecommerce.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<User> getUsers() {
        return userService.getAllUsers();
    }
}
