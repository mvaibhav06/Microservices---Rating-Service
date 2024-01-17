package com.mycode.rating.controllers;

import com.mycode.rating.entities.Rating;
import com.mycode.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
public class RatingController {

    @Autowired
    private RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> create(@RequestBody Rating rating){
        return ResponseEntity.status(HttpStatus.CREATED).body(ratingService.save(rating));
    }

    @GetMapping
    private ResponseEntity<List<Rating>> findAll(){
        return ResponseEntity.ok(ratingService.findAll());
    }

    @GetMapping("/users/{userId}")
    private ResponseEntity<List<Rating>> findRatingsByUserId(@PathVariable String userId){
        return ResponseEntity.ok(ratingService.findByUserId(userId));
    }

    @GetMapping("/hotels/{hotelId}")
    private ResponseEntity<List<Rating>> findRatingsByHotelId(@PathVariable String hotelId){
        return ResponseEntity.ok(ratingService.findByHotelId(hotelId));
    }


}
