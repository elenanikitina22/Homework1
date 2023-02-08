package homework.elena.homework1.controllers;
import homework.elena.homework1.model.Ingredient;
import homework.elena.homework1.model.Recipe;
import homework.elena.homework1.services.RecipeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/recipe")
@RestController
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public void addNewRecipe(@RequestBody Recipe recipe)
    {
        Recipe addedRecipe = recipeService.addNewRecipe(recipe);
    }

    @GetMapping("{number}")
    public Recipe getRecipe(@PathVariable int number)
    {
        Recipe recipe = recipeService.getRecipe(number);

        return recipe;
    }

    @PostMapping
    public void editRecipe(@RequestBody int number, String name, int cookingTime, List<Ingredient> ingredients, List<String> steps)
    {
        recipeService.editRecipe(number, name, cookingTime, ingredients, steps);
    }

    @PostMapping
    public void deleteRecipe(@RequestBody int number)
    {
        recipeService.deleteRecipe(number);
    }
}