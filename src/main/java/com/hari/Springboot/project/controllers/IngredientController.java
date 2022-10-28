package com.hari.Springboot.project.controllers;

import com.hari.Springboot.project.models.FoodItem;
import com.hari.Springboot.project.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IngredientController {

    @Autowired
    IngredientService ingredientService;

    @PostMapping(value = "/food")
    public FoodItem saveFood(@RequestBody FoodItem foodItem)
    {
        return ingredientService.saveFood(foodItem);
    }

    @GetMapping(value = "/food")
    public List<FoodItem> getFoodList()
    {
        return ingredientService.getFoodList();
    }

    @GetMapping(value = "/foodItemById/{id}")
    public FoodItem getFoodItemById(@PathVariable("id") Long id)
    {
        return ingredientService.getFoodItemById(id);
    }

    @DeleteMapping(value = "/foodItemById/{id}")
    public String deleteFoodById(@PathVariable("id") Long id)
    {
        return ingredientService.deleteFoodById(id);
    }

    @PutMapping(value = "/foodItemById/{id}")
    public FoodItem updateFoodItem(@PathVariable("id") Long id, @RequestBody FoodItem foodItem)
    {
        return ingredientService.updateFoodItem(id,foodItem);
    }
}
