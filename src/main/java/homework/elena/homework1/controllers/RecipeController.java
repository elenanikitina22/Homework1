package homework.elena.homework1.controllers;
import homework.elena.homework1.model.Recipe;
import homework.elena.homework1.services.RecipeService;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RequestMapping("/recipe")
@RestController
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public Recipe addNewRecipe(@RequestBody Recipe recipe)
    {
        return recipeService.addNewRecipe(recipe);
    }

    @GetMapping("{number}")
    public Recipe getRecipe(@PathVariable int number)
    {
        return recipeService.getRecipe(number);
    }

    @PutMapping()
    public Recipe editRecipe(@RequestBody int number, Recipe recipe)
    {
        return recipeService.editRecipe(number, recipe);
    }

    @DeleteMapping("{number}")
    public Recipe deleteRecipe(@PathVariable int number)
    {
        return recipeService.deleteRecipe(number);
    }

    @GetMapping()
    public Collection<Recipe> getAllRecipes()
    {
        return recipeService.getAllRecipes();
    }
}