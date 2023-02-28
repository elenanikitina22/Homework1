package homework.elena.homework1.services.impl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import homework.elena.homework1.model.Ingredient;
import homework.elena.homework1.services.FilesService;
import homework.elena.homework1.services.IngredientService;
import jakarta.annotation.PostConstruct;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class IngredientServiceImpl implements IngredientService {
    private Map<Integer, Ingredient> ingredients = new HashMap<Integer, Ingredient>();
    private int id = 0;

    private final FilesService filesService;

    public IngredientServiceImpl(FilesService filesService) {
        this.filesService = filesService;
    }

    @PostConstruct
    private void init() {
        try {
            String json = filesService.readFromFile("ingredients.json");
            ingredients = new ObjectMapper().readValue(json, new TypeReference<HashMap<Integer, Ingredient>>() {});
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

    public Ingredient addNewIngredient(Ingredient ingredient)
    {
        id++;
        ingredients.put(id, ingredient);
        return ingredient;
    }

    public Ingredient getIngredient(int id)
    {
        return ingredients.get(id);
    }

    @Override
    public Ingredient editIngredient(int id, Ingredient ingredient)
    {
        if(ingredients.containsKey(id))
        {
            Ingredient item = ingredients.get(id);
            item.setName(StringUtils.trim(ingredient.getName()));
            item.setAmount(ingredient.getAmount());
            item.setMeasureUnit(StringUtils.trim(ingredient.getMeasureUnit()));
            return item;
        }

        return null;
    }

    @Override
    public Ingredient deleteIngredient(int id)
    {
        if(ingredients.containsKey(id))
        {
            Ingredient ingredient = ingredients.remove(id);
            return ingredient;
        }

        return null;
    }

    @Override
    public Collection<Ingredient> getAllIngredients()
    {
        return ingredients.values();
    }

    public void saveIngridients()
    {
        filesService.saveToJsonFile(ingredients, "ingredients");
    }
}