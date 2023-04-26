package com.ecommerce.Ecommerce.Services;

import com.ecommerce.Ecommerce.Models.ShoppingCart;
import com.ecommerce.Ecommerce.Repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;
    public List<ShoppingCart> getAllCarts() {
        return cartRepository.findAll();
    }
}
