package com.ecommerce.Ecommerce.Repositories;

import com.ecommerce.Ecommerce.Models.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
