package com.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.user.entity.Food;

public interface FoodRepo extends JpaRepository<Food, Long> {
}