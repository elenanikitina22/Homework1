public class Main {
    public static void main(String[] args) {

        // Здравствуйте, меня зовут Елена Никитина, номер билета 7.

        // Задание 1

        // Напишите метод, который возводит число в квадрат.

        int value = 10;

        System.out.println(squaredValue(value));

    }

    public static int squaredValue(int value) {
        value = value * value;
        return value;
    }

}