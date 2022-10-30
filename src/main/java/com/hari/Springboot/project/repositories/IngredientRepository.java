package com.hari.Springboot.project.repositories;

import com.hari.Springboot.project.models.FoodItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends JpaRepository<FoodItem,Long> {

    public FoodItem findByFoodName(String name);

    @Query(value = "select * from FOOD_ITEM where FOOD_NAME like %?1%",nativeQuery = true)
    public List<FoodItem> userDefinedSearch(String name);
}
