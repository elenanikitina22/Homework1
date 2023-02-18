package homework.elena.homework1.controllers;
import homework.elena.homework1.model.Recipe;
import homework.elena.homework1.services.FilesService;
import homework.elena.homework1.services.RecipeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.util.HashMap;

@RestController
@Tag(name = "Работа с файлами рецептов")
public class FilesController {
    private final FilesService filesService;
    private final RecipeService recipeService;

    public FilesController(FilesService filesService, RecipeService recipeService) {
        this.filesService = filesService;
        this.recipeService = recipeService;
    }

    @Value("C:/Users/Elena/Desktop")
    private String filesDir;

    @PostMapping(value = "/files/Recipe", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadFileRecipe(@RequestParam MultipartFile file) throws IOException {
        filesService.uploadFile(file);
        filesService.saveToJsonFile(recipeService.getRecipes(), "recepies");
        return ResponseEntity.ok().build();
    }

    @PostMapping(value = "/files/Ingridient", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadFileIngridient(@RequestParam MultipartFile file) throws IOException {
        filesService.uploadFile(file);
        filesService.saveToJsonFile(recipeService.getRecipes(), "ingredients");
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/{name}")
    public ResponseEntity<InputStreamResource> downloadFile(@PathVariable String name, HttpServletResponse response) throws IOException {
        File file = new File(filesDir + "/" + name);

        if (file.exists()) {
            InputStreamResource resource = new InputStreamResource(new FileInputStream(file));
            filesService.saveToJsonFile(recipeService.getRecipes(), "recepies");

            return ResponseEntity.ok()
                    .contentType(MediaType.APPLICATION_OCTET_STREAM)
                    .contentLength(file.length())
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + name)
                    .body(resource);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
