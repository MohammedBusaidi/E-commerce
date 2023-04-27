package com.ecommerce.Ecommerce.Controllers;

import com.ecommerce.Ecommerce.Models.ShippingAddress;
import com.ecommerce.Ecommerce.Services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "address")
public class AddressController {
    @Autowired
    AddressService addressService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<ShippingAddress> getAddress() {
        return addressService.getAllAddress();
    }
}
