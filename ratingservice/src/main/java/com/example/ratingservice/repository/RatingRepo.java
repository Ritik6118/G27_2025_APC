package com.example.ratingservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ratingservice.entity.Rating;

@Repository
public interface RatingRepo extends JpaRepository<Rating, Integer> {

}
