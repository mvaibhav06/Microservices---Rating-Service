package com.mycode.rating.services.impl;

import com.mycode.rating.entities.Rating;
import com.mycode.rating.repositories.RatingRepository;
import com.mycode.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating save(Rating rating) {
        String radomId = UUID.randomUUID().toString();
        rating.setRatingId(radomId);

        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> findAll() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> findByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> findByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
