package homework.elena.homework1.services;
import homework.elena.homework1.model.Recipe;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;

public interface RecipeService {
    public Map<Integer, Recipe> getRecipes();
    public Recipe addNewRecipe(Recipe recipe);
    public Recipe getRecipe(int number);
    public Recipe editRecipe(int number, Recipe recipe);
    public Recipe deleteRecipe(int number);
    public Collection<Recipe> getAllRecipes();
    public void saveRecipes();
    public void listRecipe() throws IOException;
}