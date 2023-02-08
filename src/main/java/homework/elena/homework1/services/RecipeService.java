package homework.elena.homework1.services;
import homework.elena.homework1.model.Ingredient;
import homework.elena.homework1.model.Recipe;

import java.util.List;

public interface RecipeService {
    public Recipe addNewRecipe(Recipe recipe);
    public Recipe getRecipe(int number);
    public void editRecipe(int number, String name, int cookingTime, List<Ingredient> ingredients, List<String> steps);
    public void deleteRecipe(int number);
}