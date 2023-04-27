package com.ecommerce.Ecommerce.Controllers;

import com.ecommerce.Ecommerce.Models.Product;
import com.ecommerce.Ecommerce.Services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "product")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
}
