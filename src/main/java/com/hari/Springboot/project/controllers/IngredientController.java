package com.hari.Springboot.project.controllers;

import com.hari.Springboot.project.models.FoodItem;
import com.hari.Springboot.project.services.IngredientService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IngredientController {

    private final Logger LOGGER = LoggerFactory.getLogger(IngredientController.class);
    @Autowired
    IngredientService ingredientService;

    @PostMapping(value = "/food")
    public FoodItem saveFood(@Validated @RequestBody FoodItem foodItem)
    {
        LOGGER.info("inside saveFood API");
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

    @GetMapping(value = "/foodItemByName/{name}")
    public FoodItem findFoodItemByName(@PathVariable("name") String name)
    {
        return ingredientService.findFoodItemByName(name);
    }

    @GetMapping(value = "/foodItemsByName/{name}")
    public List<FoodItem> findFoodItemsByName(@PathVariable("name") String name)
    {
        return ingredientService.findFoodItemsByName(name);
    }

}
