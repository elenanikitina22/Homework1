import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Курсовой проект

        // Часть 1

        System.out.println("Hello world!");



        // Задача на функциональное программирование

        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = in.nextLine();

        System.out.printf("Ваш текст: %s \n", text);
        in.close();


    }
}