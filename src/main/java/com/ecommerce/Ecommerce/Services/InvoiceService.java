package com.ecommerce.Ecommerce.Services;

import com.ecommerce.Ecommerce.Models.Invoice;
import com.ecommerce.Ecommerce.Repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    InvoiceRepository invoiceRepository;
    public List<Invoice> getAllInvoices() {
        return invoiceRepository.findAll();
    }
}
