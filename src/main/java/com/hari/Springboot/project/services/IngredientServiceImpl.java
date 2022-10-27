package com.hari.Springboot.project.services;

import com.hari.Springboot.project.models.FoodItem;
import com.hari.Springboot.project.repositories.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IngredientServiceImpl implements IngredientService{
    @Autowired
    IngredientRepository ingredientRepository;
    @Override
    public FoodItem saveFood(FoodItem foodItem) {
        return ingredientRepository.save(foodItem);
    }

    @Override
    public List<FoodItem> getFoodList() {
        return ingredientRepository.findAll();
    }

    @Override
    public FoodItem getFoodItemById(Long id) {
        return ingredientRepository.findById(id).get();
    }
}
