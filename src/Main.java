public class Main {
    public static void main(String[] args) {



        // Задание 1

        int deposit = 15000;
        int total = 0;
        int month = 1;

        while (total <= 2_459_000) {
            total = total + total / 100;
            total = total + deposit;
            System.out.println("#1 Месяц " + month + " сумма накоплений равна " + total + " рублей");
            month = month + 1;
        }


        // Задание 2

        int number = 1;
        int number2 = 10;

        while (number <= 10) {
            System.out.print(number + " ");
            number = number + 1;
        }

        System.out.println();

        for ( ; number2 >= 1 ; ) {
            System.out.print(number2 + " ");
            number2 = number2 - 1;
        }

        System.out.println();


        // Задание 3

        int populationTotal = 12_000_000;
        int fertilityInYear = (populationTotal / 1000) * 17;
        int mortalityInYear = (populationTotal / 1000) * 8;
        int year = 2000;

        for (int i = 0; i <= 10; i++) {
            System.out.println("#3 Год " + year + " численность населения составляет " + populationTotal);
            populationTotal = populationTotal + fertilityInYear - mortalityInYear;
            year = year + 1;
        }


        // Задание 4

        int deposit2 = 15000;
        int total2 = 0;
        int month2 = 1;

        while (total2 <= 12_000_000) {
            total2 = total2 + ((total2 * 7) / 100);
            total2 = total2 + deposit2;
            System.out.println("#4 Месяц " + month2 + " сумма накоплений равна " + total2 + " рублей");
            month2 = month2 + 1;
        }


        // Задание 5

        int deposit3 = 15000;
        int total3 = 0;
        int month3 = 1;

        while (total3 <= 12_000_000) {
            total3 = total3 + ((total3 * 7) / 100);
            total3 = total3 + deposit3;
            if (month3 % 6 == 0) {
                System.out.println("#5 Месяц " + month3 + " сумма накоплений равна " + total3 + " рублей");
            }
            month3 = month3 + 1;
        }


        // Задание 6

        int deposit4 = 15000;
        int total4 = 0;
        int month4 = 1;

        while (month4 <= 108) {
            total4 = total4 + ((total4 * 7) / 100);
            total4 = total4 + deposit4;
            if (month4 % 6 == 0) {
                System.out.println("#6 Месяц " + month4 + " сумма накоплений равна " + total4 + " рублей");
            }
            month4 = month4 + 1;
        }

        // Задание 7

        int friday = 2;

        for (int i = 1; i <= 31; i++) {
            if (i == friday) {
                System.out.println("#7 Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
                friday = friday + 7;
            }
        }


        // Задание 8

        int startYear = 1822;
        int endYear = 2122;

        for (int i = 0; i <= endYear; i++) {
            if (i >= startYear && i <= endYear && i % 79 == 0) {
                System.out.println(i);
            }
        }


    }
}