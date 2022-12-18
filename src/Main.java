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

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }


    // Задание 2

    public static void task2() {

        int clientOS = 1;
        int clientDeviceYear = 2015;
        int currentYear = LocalDate.now().getYear();

        checkOSandDeviceYear(clientOS, clientDeviceYear, currentYear);

    }

    public static void checkOSandDeviceYear(int clientOS, int clientDeviceYear, int currentYear) {

        if (clientOS == 0) {
            if (clientDeviceYear == currentYear) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
        }

        if (clientOS == 1) {
            if (clientDeviceYear == currentYear) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }

    }


    // Задание 3

    public static void task3() {

        int deliveryDistance = 15;

        int days = checkDistance(deliveryDistance);

        if (days == 1) {
            System.out.println("Потребуется дней: 1 день");
        } else if (days == 2) {
            System.out.println("Потребуется дней: 2 дня");
        } else if (days == 3) {
            System.out.println("Потребуется дней: 3 дня");
        } else if (days == 0) {
            System.out.println("Доставка не осуществляется");
        }

    }

    public static int checkDistance(int deliveryDistance) {

        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return 0;
        }

    }

}

