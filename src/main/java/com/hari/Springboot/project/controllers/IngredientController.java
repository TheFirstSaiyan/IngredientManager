package com.hari.Springboot.project.controllers;

import com.hari.Springboot.project.models.FoodItem;
import com.hari.Springboot.project.services.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredientController {

    @Autowired
    IngredientService ingredientService;
    @PostMapping(value = "/food")
    public FoodItem saveFood(@RequestBody FoodItem foodItem)
    {
        return ingredientService.saveFood(foodItem);
    }
}
