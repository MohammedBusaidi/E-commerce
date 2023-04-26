package com.ecommerce.Ecommerce.Repositories;

import com.ecommerce.Ecommerce.Models.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<ShoppingCart, Integer>{
}
