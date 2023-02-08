package homework.elena.homework1.controllers;
import homework.elena.homework1.model.Ingredient;
import homework.elena.homework1.services.IngredientService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/ingredient")
@RestController
public class IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    public void addNewIngredient(@RequestBody Ingredient ingredient)
    {
        Ingredient addedIngredient = ingredientService.addNewIngredient(ingredient);
    }

    @GetMapping("{id}")
    public Ingredient getIngredient(@PathVariable int id)
    {
        Ingredient ingredient = ingredientService.getIngredient(id);

        return ingredient;
    }

    @PostMapping
    public void editIngredient(@RequestBody int id, String name, int amount, String measureUnit)
    {
        ingredientService.editIngredient(id, name, amount, measureUnit);
    }

    public void deleteIngredient(@RequestBody int id)
    {
        ingredientService.deleteIngredient(id);
    }
}