package warehouse.elena.warehouse.controllers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String applicationLaunched()
    {
        return "Приложение запущено";
    }
}