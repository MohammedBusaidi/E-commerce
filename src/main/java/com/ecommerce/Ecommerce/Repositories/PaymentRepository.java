package com.ecommerce.Ecommerce.Repositories;

import com.ecommerce.Ecommerce.Models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
