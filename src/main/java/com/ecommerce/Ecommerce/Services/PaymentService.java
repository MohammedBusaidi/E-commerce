package com.ecommerce.Ecommerce.Services;

import com.ecommerce.Ecommerce.Models.Payment;
import com.ecommerce.Ecommerce.Repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
    @Autowired
    PaymentRepository paymentRepository;
    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }
}
