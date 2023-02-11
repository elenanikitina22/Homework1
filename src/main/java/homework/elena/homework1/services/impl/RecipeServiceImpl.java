package homework.elena.homework1.services.impl;
import homework.elena.homework1.model.Recipe;
import homework.elena.homework1.services.RecipeService;
import org.springframework.stereotype.Service;
import java.util.Collection;
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

    @Override
    public Recipe editRecipe(int number, Recipe recipe)
    {
        if (recipes.containsKey(number))
        {
            Recipe item = recipes.get(number);
            item.setName(recipe.getName());
            item.setCookingTime(recipe.getCookingTime());
            item.setIngredients(recipe.getIngredients());
            item.setSteps(recipe.getSteps());
            return item;
        }

        return null;
    }

    @Override
    public Recipe deleteRecipe(int number)
    {
        if (recipes.containsKey(number))
        {
            Recipe recipe = recipes.remove(number);
            return recipe;
        }

        return null;
    }

    @Override
    public Collection<Recipe> getAllRecipes()
    {
        return recipes.values();
    }
}