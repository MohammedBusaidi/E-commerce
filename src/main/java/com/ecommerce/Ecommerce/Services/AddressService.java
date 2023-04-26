package com.ecommerce.Ecommerce.Services;

import com.ecommerce.Ecommerce.Models.ShippingAddress;
import com.ecommerce.Ecommerce.Repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    AddressRepository addressRepository;
    public List<ShippingAddress> getAllAddress() {
        return addressRepository.findAll();
    }
}
