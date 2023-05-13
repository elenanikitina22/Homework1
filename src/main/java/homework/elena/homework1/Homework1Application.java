package homework.elena.homework1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Homework1Application {

    public static void main(String[] args) {

        String text = "Текст для разделения на части.";
        String delimiter = " ";

        // Разделение строки
        String[] parts = text.split(delimiter);

        // Вывод второго слова
        System.out.println("Второе слово: " + parts[1]);

        // SpringApplication.run(Homework1Application.class, args);

    }

}
