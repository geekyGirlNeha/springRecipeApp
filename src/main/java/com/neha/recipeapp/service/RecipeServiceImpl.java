package com.neha.recipeapp.service;

import com.neha.recipeapp.model.Recipe;
import com.neha.recipeapp.repositories.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    public final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipe() {
       Set<Recipe> recipes = new HashSet<>();
       recipeRepository.findAll().iterator().forEachRemaining(recipes::add);
       return recipes;
    }
}
