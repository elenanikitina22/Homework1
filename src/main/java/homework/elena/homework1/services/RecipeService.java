package homework.elena.homework1.services;
import homework.elena.homework1.model.Recipe;

public interface RecipeService {
    public Recipe addNewRecipe(Recipe recipe);
    public Recipe getRecipe(int number);
}