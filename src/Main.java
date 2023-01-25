import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Курсовой проект

        // Часть 1









        // 2. Задача на функциональное программирование

        // Ввод текста пользователем

        // Scanner in = new Scanner(System.in);
        // System.out.print("Введите текст: ");
        // String text = in.nextLine();
        // in.close();

        // Текст по умолчанию

        String text = "yourapp the quick brown fox jumps over the lazy dog";

        String[] textToArray = text.split(" ");
        Arrays.sort(textToArray);

        System.out.println("В тексте " + textToArray.length + " слов");
        System.out.println("TOP10:");


        System.out.println("Содержимое массива: " + Arrays.toString(textToArray));


    }
}