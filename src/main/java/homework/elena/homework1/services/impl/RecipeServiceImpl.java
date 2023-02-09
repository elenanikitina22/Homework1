package homework.elena.homework1.services.impl;
import homework.elena.homework1.model.Recipe;
import homework.elena.homework1.services.RecipeService;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

@Service
public class RecipeServiceImpl implements RecipeService {
    private final Map<Integer, Recipe> recipes = new HashMap<Integer, Recipe>();
    private int number = 0;

    public Recipe addNewRecipe(Recipe recipe)
    {
        number++;
        recipes.put(number, recipe);
        return recipe;
    }

    public Recipe getRecipe(int number)
    {
        return recipes.get(number);
    }
}