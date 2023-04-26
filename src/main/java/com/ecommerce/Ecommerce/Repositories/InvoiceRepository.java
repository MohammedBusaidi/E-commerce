package com.ecommerce.Ecommerce.Repositories;

import com.ecommerce.Ecommerce.Models.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {
}
