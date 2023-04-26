package com.ecommerce.Ecommerce.Services;

import com.ecommerce.Ecommerce.Models.Review;
import com.ecommerce.Ecommerce.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewService {
    @Autowired
    ReviewRepository reviewRepository;
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }
}
