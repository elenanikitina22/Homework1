package homework.elena.homework1.controllers;
import homework.elena.homework1.model.Ingredient;
import homework.elena.homework1.services.IngredientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    public ResponseEntity addNewIngredient(@RequestBody Ingredient ingredient)
    {
        Ingredient addedIngredient = ingredientService.addNewIngredient(ingredient);
        return ResponseEntity.ok(addedIngredient);
    }

    @GetMapping("{id}")
    public ResponseEntity getIngredient(int id)
    {
        Ingredient ingredient = ingredientService.getIngredient(id);

        if (ingredient != null)
        {
            return ResponseEntity.ok(ingredient);
        }
        else
        {
            return ResponseEntity.notFound().build();
        }
    }
}
