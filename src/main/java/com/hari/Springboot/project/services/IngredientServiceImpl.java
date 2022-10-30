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

    @Override
    public String deleteFoodById(Long id) {
        ingredientRepository.deleteById(id);
        return "Food Item with id = " + id + " deleted successfully!";
    }

    @Override
    public FoodItem updateFoodItem(Long id, FoodItem foodItem) {
        FoodItem existingFoodItem = ingredientRepository.findById(id).get();
        if(foodItem.getFoodName() != null || !foodItem.getFoodName().equals(""))
            existingFoodItem.setFoodName(foodItem.getFoodName());
        if(foodItem.getCategory() != null || !foodItem.getCategory().equals(""))
            existingFoodItem.setCategory(foodItem.getCategory());
        if(foodItem.getIngredients() != null || !foodItem.getIngredients().equals(""))
            existingFoodItem.setIngredients(foodItem.getIngredients());

        return ingredientRepository.save(existingFoodItem);

    }

    @Override
    public FoodItem findFoodItemByName(String name) {
        return ingredientRepository.findByFoodName(name);
    }

    @Override
    public List<FoodItem> findFoodItemsByName(String name) {
        return ingredientRepository.userDefinedSearch(name);
    }
}
