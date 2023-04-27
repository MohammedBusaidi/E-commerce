package com.ecommerce.Ecommerce.Services;

import com.ecommerce.Ecommerce.Models.Order;
import com.ecommerce.Ecommerce.Repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}
