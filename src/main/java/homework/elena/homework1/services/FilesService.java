package homework.elena.homework1.services;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@Service
public class FilesService {

    @Value("${path.to.files.folder}")
    private String filesDir;

    public void saveToJsonFile(Object object, String fileName) {
        Path path = Path.of(filesDir, fileName + ".json");
        try {
            String json = new ObjectMapper().writeValueAsString(object);
            Files.createDirectories(path.getParent());
            Files.deleteIfExists(path);
            Files.createFile(path);
            Files.writeString(path, json);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String readFromFile(String fileName) {
        try {
            return Files.readString(Path.of(filesDir, fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
