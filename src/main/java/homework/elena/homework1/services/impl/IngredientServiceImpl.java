package homework.elena.homework1.services.impl;
import homework.elena.homework1.model.Ingredient;
import homework.elena.homework1.services.IngredientService;
import org.springframework.stereotype.Service;
import java.util.Collection;
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

    @Override
    public Ingredient editIngredient(int id, Ingredient ingredient)
    {
        if(ingredients.containsKey(id))
        {
            Ingredient item = ingredients.get(id);
            item.setName(ingredient.getName());
            item.setAmount(ingredient.getAmount());
            item.setMeasureUnit(ingredient.getMeasureUnit());
            return item;
        }

        return null;
    }

    @Override
    public Ingredient deleteIngredient(int id)
    {
        if(ingredients.containsKey(id))
        {
            Ingredient ingredient = ingredients.remove(id);
            return ingredient;
        }

        return null;
    }

    @Override
    public Collection<Ingredient> getAllIngredients()
    {
        return ingredients.values();
    }
}