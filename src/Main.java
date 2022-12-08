public class Main {
    public static void main(String[] args) {


        // Задание 1

        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("#1 Итерация цикла " + i);
        }

        // Задание 2

        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println("#2 Итерация цикла " + i);
        }


        // Задание 3

        for (int i = 2; i <= 17; i = i + 2) {
            System.out.println("#3 Итерация цикла " + i);
        }


        // Задание 4

        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println("#4 Итерация цикла " + i);
        }

        // Задание 5

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println("#5 " + i + " год является високосным.");
        }


        // Задание 6

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println("#6 " + i);
        }


        // Задание 7

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println("#7 " + i);
        }


        // Задание 8

        int deposit = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + deposit;
            System.out.println("#8 Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }


        // Задание 9

        int deposit2 = 29000;
        int total2 = 0;

        for (int i = 1; i <= 12; i++) {
            total2 = total2 + total2 / 100;
            total2 = total2 + deposit2;
            System.out.println("#9 Месяц " + i + " сумма накоплений равна " + total2 + " рублей");
        }


        // Задание 10

        int number;

        for (int i = 1; i <= 10; i = i + 1) {
            number = 2 * i;
            System.out.println("#10 2*" + i + "=" + number);
        }


    }
}
