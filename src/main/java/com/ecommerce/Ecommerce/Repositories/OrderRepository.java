package com.ecommerce.Ecommerce.Repositories;

import com.ecommerce.Ecommerce.Models.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
