package homework.elena.homework1.services.impl;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import homework.elena.homework1.model.Ingredient;
import homework.elena.homework1.model.Recipe;
import homework.elena.homework1.services.FilesService;
import homework.elena.homework1.services.RecipeService;
import jakarta.annotation.PostConstruct;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class RecipeServiceImpl implements RecipeService {
    private Map<Integer, Recipe> recipes = new HashMap<Integer, Recipe>();
    private int number = 0;

    @Value("${path.to.files.folder}")
    private String filesDir;

    private final FilesService filesService;

    public Map<Integer, Recipe> getRecipes() {
        return recipes;
    }

    public RecipeServiceImpl(FilesService filesService) {
        this.filesService = filesService;
    }

    @PostConstruct
    private void init() {
        try {
            String json = filesService.readFromFile("recepies.json");
            recipes = new ObjectMapper().readValue(json, new TypeReference<HashMap<Integer, Recipe>>() {});
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

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
            item.setName(StringUtils.trim(recipe.getName()));
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

    @Override
    public void saveRecipes() {
        filesService.saveToJsonFile(recipes, "recepies");
    }

    public void listRecipe() throws IOException {
        Path path = Path.of(filesDir, "recipe" + ".txt");
        for(Recipe recipe : recipes.values())
        {
            try (Writer writer = Files.newBufferedWriter(path, StandardOpenOption.APPEND))
            {
                writer.append(recipe.getName() + "\n");
                writer.append("Время приготовления: " + recipe.getCookingTime() + "\n");
                writer.append("Ингридиенты: " + "\n");
                for (Ingredient ingredient : recipe.getIngredients())
                {
                    writer.append(ingredient.getName() + "\n");
                }
                writer.append("Инструкция: " + "\n");

                int i = 0;
                for (String step : recipe.getSteps())
                {
                    i++;
                    writer.append(i + " " + step + "\n");
                }
            }
        }
    }
}