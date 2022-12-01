public class Main {
    public static void main(String[] args) {



        // IF

        int age = 16;

        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        }

        if (age < 18) {
            System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }



        int age2 = 20;

        if (age2 >= 7 && age2 <18) {
            System.out.println("Ребенок ходит в школу.");
        }

        if (age2 >= 18 && age2 <24) {
            System.out.println("Человек уже закончил школу и может отправляться в университет.");
        }

        if (age2 >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу.");
        }


        int passengers = 80;

        if (passengers >= 0 && passengers <60) {
            System.out.println("В вагоне есть сидячие места.");
        }

        if (passengers >= 60 && passengers <102) {
            System.out.println("Сидячие места заняты, но есть стоячие места.");
        }

        if (passengers >= 102) {
            System.out.println("Мест в вагоне нет.");
        }






        // ELSE


        int age3 = 16;

        if (age3 >= 18) {
            System.out.println("#2 Поздравляем с совершеннолетием!");
        } else {
            System.out.println("#2 Возраст совершеннолетия ещё не наступил, нужно немного подождать.");
        }



        int age4 = 16;

        if (age4 >= 0 && age4 <18) {
            System.out.println("#2 Ребенок ходит в школу.");
        } else if (age4 >= 18 && age4 <24) {
            System.out.println("#2 Человек уже закончил школу и может отправляться в университет.");
        } else {
            System.out.println("#2 Человек окончил университет и ему пора искать первую работу.");
        }


        int passengers2 = 80;

        if (passengers2 >= 0 && passengers2 <60) {
            System.out.println("#2 В вагоне есть сидячие места.");
        } else if (passengers2 >= 60 && passengers2 <102) {
            System.out.println("#2 Сидячие места заняты, но есть стоячие места.");
        } else {
            System.out.println("#2 Мест в вагоне нет.");
        }



        // ELSE

        int age5 = 12;

        if (age5 >= 0 && age5 <=6) {
            System.out.println("#3 Если возраст человека равен " + age5 + " то ему нужно ходить в детский сад.");
        } else if (age5 >= 7 && age5 <=18) {
            System.out.println("#3 Если возраст человека равен " + age5 + " то ему нужно ходить в школу.");
        } else if (age5 >18 && age5 <24) {
            System.out.println("#3 Если возраст человека равен " + age5 + " то ему нужно ходить в университет.");
        } else {
            System.out.println("#3 Если возраст человека равен " + age5 + " то ему нужно ходить на работу.");
        }



        int age6 = 4;

        if (age6 >= 0 && age6 <5) {
            System.out.println("#3 Ребенок не может кататься на аттракционе.");
        } else if (age6 >= 5 && age6 <14) {
            System.out.println("#3 Ребенок может кататься только в сопровождении взрослого.");
        } else {
            System.out.println("#3 Ребенок может кататься без сопровождения взрослого.");
        }



        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println("Значение переменной one самое большое.");
        } else if (two > one && two > three) {
            System.out.println("Значение переменной two самое большое.");
        } else {
            System.out.println("Значение переменной three самое большое.");
        }






    }
}