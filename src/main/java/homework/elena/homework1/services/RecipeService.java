package homework.elena.homework1.services;
import homework.elena.homework1.model.Recipe;
import java.util.Collection;

public interface RecipeService {
    public Recipe addNewRecipe(Recipe recipe);
    public Recipe getRecipe(int number);
    public Recipe editRecipe(int number, Recipe recipe);
    public Recipe deleteRecipe(int number);
    public Collection<Recipe> getAllRecipes();
    public void saveRecipes();
}