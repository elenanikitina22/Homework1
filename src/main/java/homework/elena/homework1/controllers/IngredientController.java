package homework.elena.homework1.controllers;
import homework.elena.homework1.model.Ingredient;
import homework.elena.homework1.services.IngredientService;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RequestMapping("/ingredient")
@RestController
public class IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping
    public Ingredient addNewIngredient(@RequestBody Ingredient ingredient)
    {
        return ingredientService.addNewIngredient(ingredient);
    }

    @GetMapping("{id}")
    public Ingredient getIngredient(@PathVariable int id)
    {
        return ingredientService.getIngredient(id);
    }

    @PutMapping("{id}")
    public Ingredient editIngredient(@PathVariable int id, @RequestBody Ingredient ingredient)
    {
        return ingredientService.editIngredient(id, ingredient);
    }

    @DeleteMapping("{id}")
    public Ingredient deleteIngredient(@PathVariable int id)
    {
        return ingredientService.deleteIngredient(id);
    }

    @GetMapping()
    public Collection<Ingredient> getAllRecipes()
    {
        return ingredientService.getAllIngredients();
    }
}