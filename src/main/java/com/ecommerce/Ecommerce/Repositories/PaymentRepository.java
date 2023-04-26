package com.ecommerce.Ecommerce.Repositories;

import com.ecommerce.Ecommerce.Models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
}
