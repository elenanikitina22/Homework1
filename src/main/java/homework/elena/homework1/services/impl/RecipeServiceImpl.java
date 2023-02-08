package homework.elena.homework1.services.impl;
import homework.elena.homework1.model.Ingredient;
import homework.elena.homework1.model.Recipe;
import homework.elena.homework1.services.RecipeService;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;
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

    @Override
    public void editRecipe(int number, String name, int cookingTime, List<Ingredient> ingredients, List<String> steps) {
        if (recipes.containsKey(number))
        {
            Recipe recipe = recipes.get(number);
            recipe.setName(name);
            recipe.setCookingTime(cookingTime);
            recipe.setIngredients(ingredients);
            recipe.setSteps(steps);
        }
    }

    @Override
    public void deleteRecipe(int number) {
        if (recipes.containsKey(number))
        {
            recipes.remove(number);
        }
    }
}