package homework.elena.homework1.services;
import homework.elena.homework1.model.Ingredient;

public interface IngredientService {
    public Ingredient addNewIngredient(Ingredient ingredient);
    public Ingredient getIngredient(int id);
    public void editIngredient(int id, String name, int amount, String measureUnit);
    public void deleteIngredient(int id);
}