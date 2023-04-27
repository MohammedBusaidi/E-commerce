package com.ecommerce.Ecommerce.Controllers;

import com.ecommerce.Ecommerce.Models.ShoppingCart;
import com.ecommerce.Ecommerce.Services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "cart")
public class CartController {
    @Autowired
    CartService cartService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<ShoppingCart> getCarts() {
        return cartService.getAllCarts();
    }
}
