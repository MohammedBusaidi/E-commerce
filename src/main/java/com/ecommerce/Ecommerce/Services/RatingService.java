package com.ecommerce.Ecommerce.Services;

import com.ecommerce.Ecommerce.Models.Ratings;
import com.ecommerce.Ecommerce.Repositories.RatingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingService {
    @Autowired
    RatingRepository ratingRepository;
    public List<Ratings> getAllRatings() {
        return ratingRepository.findAll();
    }
}
