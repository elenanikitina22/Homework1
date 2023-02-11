package homework.elena.homework1.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    @GetMapping("/")
    public String applicationLaunched() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String infoPage() {
        return "Елена Никитинa, проект Homework2, 01.02.203, Учебный проект";
    }

}
