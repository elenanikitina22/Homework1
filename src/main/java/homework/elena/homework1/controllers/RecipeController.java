package homework.elena.homework1.controllers;
import homework.elena.homework1.model.Recipe;
import homework.elena.homework1.services.RecipeService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RequestMapping("/recipe")
@RestController
@Tag(name = "Работа с рецептами", description = "Операции для управления рецептами")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    @Operation(summary = "Добавление рецепта")
    public Recipe addNewRecipe(@RequestBody Recipe recipe)
    {
        Recipe obj = recipeService.addNewRecipe(recipe);
        recipeService.saveRecipes();
        return obj;
    }

    @GetMapping("{number}")
    @Operation(summary = "Получение рецепта по id")
    public Recipe getRecipe(@PathVariable int number)
    {
        return recipeService.getRecipe(number);
    }

    @PutMapping("{number}")
    @Operation(summary = "Изменение рецепта по id")
    public Recipe editRecipe(@PathVariable int number, @RequestBody Recipe recipe)
    {
        Recipe obj = recipeService.editRecipe(number, recipe);
        recipeService.saveRecipes();
        return obj;
    }

    @DeleteMapping("{number}")
    @Operation(summary = "Удаление рецепта по id")
    public Recipe deleteRecipe(@PathVariable int number)
    {
        Recipe obj = recipeService.deleteRecipe(number);
        recipeService.saveRecipes();
        return obj;
    }

    @GetMapping()
    @Operation(summary = "Получение всех рецептов")
    public Collection<Recipe> getAllRecipes()
    {
        return recipeService.getAllRecipes();
    }
}