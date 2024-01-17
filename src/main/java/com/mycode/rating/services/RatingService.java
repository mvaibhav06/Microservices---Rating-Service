package com.mycode.rating.services;

import com.mycode.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    Rating save(Rating rating);

    List<Rating> findAll();

    List<Rating> findByUserId(String userId);

    List<Rating> findByHotelId(String hotelId);
}
