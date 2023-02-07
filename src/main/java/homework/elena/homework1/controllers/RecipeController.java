package homework.elena.homework1.controllers;
import homework.elena.homework1.model.Recipe;
import homework.elena.homework1.services.RecipeService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public ResponseEntity addNewRecipe(@RequestBody Recipe recipe)
    {
        Recipe addedRecipe = recipeService.addNewRecipe(recipe);
        return ResponseEntity.ok(addedRecipe);
    }

    @GetMapping("{number}")
    public ResponseEntity getRecipe(int number)
    {
        Recipe recipe = recipeService.getRecipe(number);

        if (recipe != null)
        {
            return ResponseEntity.ok(recipe);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
}