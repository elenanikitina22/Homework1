package homework.elena.homework1.controllers;
import homework.elena.homework1.model.Ingredient;
import homework.elena.homework1.services.FilesService;
import homework.elena.homework1.services.IngredientService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;

@RequestMapping("/ingredient")
@RestController
@Tag(name = "Работа с ингридиентами", description = "Операции для управления ингридиентами")
public class IngredientController {
    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService, FilesService filesService) {
        this.ingredientService = ingredientService;
    }

    @PostMapping()
    @Operation(summary = "Добавление ингридиента")
    public Ingredient addNewIngredient(@RequestBody Ingredient ingredient)
    {
        Ingredient obj = ingredientService.addNewIngredient(ingredient);
        ingredientService.saveIngridients();
        return obj;
    }

    @GetMapping("{id}")
    @Operation(summary = "Получение ингридиента по id")
    public ResponseEntity<Ingredient> getIngredient(@PathVariable int id)
    {
        try
        {
            Ingredient ingredient = ingredientService.getIngredient(id);
            return new ResponseEntity<Ingredient>(ingredient, HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("{id}")
    @Operation(summary = "Изменение ингридиента по id")
    public Ingredient editIngredient(@PathVariable int id, @RequestBody Ingredient ingredient)
    {
        Ingredient obj = ingredientService.editIngredient(id, ingredient);
        ingredientService.saveIngridients();
        return obj;
    }

    @DeleteMapping("{id}")
    @Operation(summary = "Удаление ингридиента по id")
    public Ingredient deleteIngredient(@PathVariable int id)
    {
        Ingredient obj = ingredientService.deleteIngredient(id);
        ingredientService.saveIngridients();
        return obj;
    }

    @GetMapping()
    @Operation(summary = "Получение всех ингридиентов")
    public Collection<Ingredient> getAllRecipes()
    {
        return ingredientService.getAllIngredients();
    }
}