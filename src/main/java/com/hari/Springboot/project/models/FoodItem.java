package com.hari.Springboot.project.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FoodItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long foodId;
    private String foodName;
    private String category;
    private String ingredients;

    public Long getFoodId() {
        return foodId;
    }

    public void setFoodId(Long foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "FoodItem{" +
                "foodId=" + foodId +
                ", foodName='" + foodName + '\'' +
                ", category='" + category + '\'' +
                ", ingredients='" + ingredients + '\'' +
                '}';
    }

    public FoodItem(Long foodId) {
        this.foodId = foodId;
    }

    public FoodItem(Long foodId, String foodName, String category, String ingredients) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.category = category;
        this.ingredients = ingredients;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
