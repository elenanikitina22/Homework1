import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    // Задание 1

    public static void task1() {

        int year = 2021;

        checkYear(year);

    }

    public static void checkYear(int year) {

        if (year % 4 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }


    // Задание 2

    public static void task2() {

        int clientOS = 1;
        int clientDeviceYear = LocalDate.now().getYear();

        checkOSandDeviceYear(clientOS, clientDeviceYear);

    }

    public static void checkOSandDeviceYear(int clientOS, int clientDeviceYear) {

        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else if (clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        }

        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }

    }


    // Задание 3

    public static void task3() {

        int deliveryDistance = 95;

        checkDistance(deliveryDistance);

    }

    public static void checkDistance(int deliveryDistance) {

        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 день");
        }

        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: 2 дня");
        }

        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней: 3 дня");
        }

    }

}

