public class Main {
    public static void main(String[] args) {




    // Задание 1

    int clientOS = 1;

    if (clientOS == 0) {
        System.out.println("#1 Установите версию приложения для iOS по ссылке.");
    } if (clientOS == 1) {
            System.out.println("#1 Установите версию приложения для Android по ссылке.");
        }


        // Задание 2

        int clientOS2 = 1;
        int clientDeviceYear = 2015;

        if (clientOS2 == 0 && clientDeviceYear >= 2015) {
            System.out.println("#2 Установите версию приложения для iOS по ссылке.");
        } else if (clientOS2 == 0) {
            System.out.println("#2 Установите облегченную версию приложения для iOS по ссылке.");
        }

        if (clientOS2 == 1 && clientDeviceYear >= 2015) {
            System.out.println("#2 Установите версию приложения для Android по ссылке.");
        } else if (clientOS2 == 1) {
            System.out.println("#2 Установите облегченную версию приложения для Android по ссылке.");
        }

        // Задание 3


        int year = 2021;


        if (year % 4 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }


        // Задание 4

        int deliveryDistance = 95;

        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней: 1 день");
        }

        if (deliveryDistance > 20 && deliveryDistance <= 60) {
        System.out.println("Потребуется дней: 2 дня");
        }

        if (deliveryDistance > 60 && deliveryDistance <= 100 ) {
        System.out.println("Потребуется дней: 3 дня");
        }


        // Задание 5


        int monthNumber = 12;
        String season;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                season = "Зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Значение не является вренемем года.";
        }

        System.out.println(season);


    }
}