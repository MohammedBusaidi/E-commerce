package com.ecommerce.Ecommerce.Controllers;

import com.ecommerce.Ecommerce.Models.Ratings;
import com.ecommerce.Ecommerce.Services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "rating")
public class RatingController {
    @Autowired
    RatingService ratingService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Ratings> getRatings() {
        return ratingService.getAllRatings();
    }
}
