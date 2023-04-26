package com.ecommerce.Ecommerce.Controllers;

import com.ecommerce.Ecommerce.Models.Invoice;
import com.ecommerce.Ecommerce.Services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "invoice")
public class InvoiceController {
    @Autowired
    InvoiceService invoiceService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Invoice> getInvocies() {
        return invoiceService.getAllInvoices();
    }
}
