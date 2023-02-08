package homework.elena.homework1.services.impl;
import homework.elena.homework1.model.Ingredient;
import homework.elena.homework1.services.IngredientService;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {
    private final Map<Integer, Ingredient> ingredients = new HashMap<Integer, Ingredient>();
    private int id = 0;

    public Ingredient addNewIngredient(Ingredient ingredient)
    {
        id++;
        ingredients.put(id, ingredient);
        return ingredient;
    }

    public Ingredient getIngredient(int id)
    {
        return ingredients.get(id);
    }
}