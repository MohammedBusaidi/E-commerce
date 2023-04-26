package com.ecommerce.Ecommerce.Repositories;

import com.ecommerce.Ecommerce.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
