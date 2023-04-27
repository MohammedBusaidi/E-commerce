package com.ecommerce.Ecommerce.Controllers;

import com.ecommerce.Ecommerce.Models.Order;
import com.ecommerce.Ecommerce.Services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "order")
public class OrderController {
    @Autowired
    OrderService orderService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }
}
