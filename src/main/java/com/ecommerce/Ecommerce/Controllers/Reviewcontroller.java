package com.ecommerce.Ecommerce.Controllers;


import com.ecommerce.Ecommerce.Models.Review;
import com.ecommerce.Ecommerce.Services.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "review")
public class Reviewcontroller {
    @Autowired
    ReviewService reviewService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Review> getReviews() {
        return reviewService.getAllReviews();
    }
}
