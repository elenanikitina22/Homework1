package homework.elena.homework1.controllers;
import homework.elena.homework1.model.Recipe;
import homework.elena.homework1.services.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("user")
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
}