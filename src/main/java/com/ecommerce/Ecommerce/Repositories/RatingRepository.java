package com.ecommerce.Ecommerce.Repositories;

import com.ecommerce.Ecommerce.Models.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RatingRepository extends JpaRepository<Ratings, Integer> {
}
