package com.hari.Springboot.project.services;

import com.hari.Springboot.project.models.FoodItem;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IngredientService {


    public FoodItem saveFood(FoodItem foodItem);

    public List<FoodItem> getFoodList();

    public FoodItem getFoodItemById(Long id);

    public String deleteFoodById(Long id);

    public FoodItem updateFoodItem(Long id, FoodItem foodItem);

    public FoodItem findFoodItemByName(String name);

    public List<FoodItem> findFoodItemsByName(String name);
}
