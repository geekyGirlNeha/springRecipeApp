package com.neha.recipeapp.repositories;

import com.neha.recipeapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
