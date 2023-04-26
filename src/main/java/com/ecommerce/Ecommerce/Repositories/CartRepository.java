package com.ecommerce.Ecommerce.Repositories;

import com.ecommerce.Ecommerce.Models.ShoppingCart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<ShoppingCart, Integer>{
}
