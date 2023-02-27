package homework.elena.homework1.controllers;
import homework.elena.homework1.services.FilesService;
import homework.elena.homework1.services.RecipeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.*;

@RestController
@Tag(name = "Работа с файлами рецептов")
public class FilesController {
    private final FilesService filesService;
    private final RecipeService recipeService;

    public FilesController(FilesService filesService, RecipeService recipeService) {
        this.filesService = filesService;
        this.recipeService = recipeService;
    }

    @Value("${path.to.files.folder}")
    private String filesDir;

    @PostMapping(value = "/files/recipe", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadFileRecipe(@RequestParam MultipartFile file) throws IOException {
        filesService.uploadFile(file);
        return ResponseEntity.ok().build();
    }

    @PostMapping(value = "/files/ingridient", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> uploadFileIngridient(@RequestParam MultipartFile file) throws IOException {
        filesService.uploadFile(file);
        return ResponseEntity.ok().build();
    }

    @GetMapping(value = "/files/recipe")
    public ResponseEntity<InputStreamResource> downloadFile() throws IOException {
        File file = new File(filesDir + "/" + "recipe.txt");
        recipeService.listRecipe();

        if (file.exists()) {
            InputStreamResource resource = new InputStreamResource(new FileInputStream(file));

            return ResponseEntity.ok()
                    .contentType(MediaType.TEXT_PLAIN)
                    .contentLength(file.length())
                    .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + "recipe.txt")
                    .body(resource);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
