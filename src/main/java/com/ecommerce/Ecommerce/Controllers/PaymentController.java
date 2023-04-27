package com.ecommerce.Ecommerce.Controllers;

import com.ecommerce.Ecommerce.Models.Payment;
import com.ecommerce.Ecommerce.Services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "payment")
public class PaymentController {
    @Autowired
    PaymentService paymentService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Payment> getPayments() {
        return paymentService.getAllPayments();
    }
}
