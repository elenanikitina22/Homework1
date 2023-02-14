package homework.elena.homework1.model;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Recipe {
    private String name;
    private int cookingTime;
    private List<Ingredient> ingredients;
    private List<String> steps;
}