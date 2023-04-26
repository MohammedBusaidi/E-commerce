package com.ecommerce.Ecommerce.Repositories;

import com.ecommerce.Ecommerce.Models.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {
}
