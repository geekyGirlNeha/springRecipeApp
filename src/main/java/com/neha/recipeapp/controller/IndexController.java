package com.neha.recipeapp.controller;

import com.neha.recipeapp.model.Category;
import com.neha.recipeapp.model.UnitOfMeasure;
import com.neha.recipeapp.repositories.CategoryRepository;
import com.neha.recipeapp.repositories.UnitOfMeasureRepository;
import com.neha.recipeapp.service.RecipeService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"/","","/index"})
    public String getIndex(Model model){

        model.addAttribute("recipies",recipeService.getRecipe());

         return "index";
    }
}
