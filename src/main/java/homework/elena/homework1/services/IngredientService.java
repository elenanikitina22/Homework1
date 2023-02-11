package homework.elena.homework1.services;
import homework.elena.homework1.model.Ingredient;
import java.util.Collection;

public interface IngredientService {
    public Ingredient addNewIngredient(Ingredient ingredient);
    public Ingredient getIngredient(int id);
    public Ingredient editIngredient(int id, Ingredient ingredient);
    public Ingredient deleteIngredient(int id);
    public Collection<Ingredient> getAllIngredients();
}