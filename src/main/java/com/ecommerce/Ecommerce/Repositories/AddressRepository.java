package com.ecommerce.Ecommerce.Repositories;

import com.ecommerce.Ecommerce.Models.ShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<ShippingAddress, Integer> {
}
