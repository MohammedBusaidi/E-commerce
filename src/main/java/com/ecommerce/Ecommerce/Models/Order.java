package com.ecommerce.Ecommerce.Models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Getter
@Setter
@Data
@Entity

public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer orderId;
//    @ManyToOne
//    User user;
//    List<Product> products;
    double totalAmount;
    String shippingAddress;
}
