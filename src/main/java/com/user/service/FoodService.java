package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.Food;
import com.user.repo.FoodRepo;

@Service
public class FoodService {

    private final FoodRepo repo;

    public FoodService(FoodRepo repo) {
        this.repo = repo;
    }

    public Food create(Food food) {
        return repo.save(food);
    }

    public List<Food> getAll() {
        return repo.findAll();
    }

    public Food get(Long id) {
        return repo.findById(id)
                .orElseThrow(() -> new RuntimeException("Food not found"));
    }

    public Food update(Long id, Food updated) {
        Food food = get(id);
        food.setName(updated.getName());
        food.setPrice(updated.getPrice());
        return repo.save(food);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}