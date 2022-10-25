package com.hari.Springboot.project.services;

import com.hari.Springboot.project.models.FoodItem;
import org.springframework.stereotype.Service;

public interface IngredientService {
    FoodItem saveFood(FoodItem foodItem);
}
