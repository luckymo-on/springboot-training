package com.example.food_service.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.food_service.entity.Food;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {

}