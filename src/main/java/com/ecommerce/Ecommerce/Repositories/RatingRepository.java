package com.ecommerce.Ecommerce.Repositories;

import com.ecommerce.Ecommerce.Models.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Ratings, Integer> {
}
