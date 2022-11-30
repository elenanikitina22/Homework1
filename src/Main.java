public class Main {
    public static void main(String[] args) {

        byte aCat = 100;
        System.out.println("Значение переменной aCat с типом byte равно " + aCat);

        short bCat = 1000;
        System.out.println("Значение переменной bCat с типом short равно " + bCat);

        int cCat = 2000;
        System.out.println("Значение переменной cCat с типом int равно " + cCat);

        long dCat = 3000L;
        System.out.println("Значение переменной dCat с типом long равно " + dCat);

        float eCat = 4.5f;
        System.out.println("Значение переменной eCat с типом float равно " + eCat);

        double fCat = 9.5;
        System.out.println("Значение переменной fCat с типом double равно " + fCat);



        byte aDog = 67;
        short bDog = 569;
        short cDog = -159;
        int dDog = 27897;
        long eDog = 987678965549L;
        float fDog = 27.12f;
        double gDog = 2.786;
        boolean hDog = false;

        byte lyudmilaPavlovnaPupils = 23;
        byte annaSergeevnaPupils = 27;
        byte ekaterinaAndreevnaPupils = 30;
        short sheetsOfPaper = 480;
        int sumOfPupils = lyudmilaPavlovnaPupils + annaSergeevnaPupils + ekaterinaAndreevnaPupils;

        int paperToEachPupil = sheetsOfPaper / sumOfPupils;
        System.out.println("На каждого ученика рассчитано " + paperToEachPupil + " листов бумаги");


        byte bottlesPerMinute = 8;

        int in20Minutes = bottlesPerMinute * 20;
        int inOneDay = bottlesPerMinute * 1440;
        int inThreeDays = bottlesPerMinute * 4320;
        int inOneMonth = bottlesPerMinute * 43200;

        System.out.println("За 20 минут машина произвела " + in20Minutes + " штук");
        System.out.println("За 1 день машина произвела " + inOneDay + " штук");
        System.out.println("За 3 дня машина произвела " + inThreeDays + " штук");
        System.out.println("За 1 месяц машина произвела " + inOneMonth + " штук");


        byte allCans = 120;

        byte whiteCanPerClass = 2;
        byte brownCanPerClass = 4;

        int cansPerClass = whiteCanPerClass + brownCanPerClass;

        int numberOfClasses = allCans / cansPerClass;

        int numberOfWhiteCans = numberOfClasses * whiteCanPerClass;
        int numberOfBrownCans = numberOfClasses * brownCanPerClass;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberOfWhiteCans + " банок белой краски " + numberOfBrownCans + " банок коричневой краски");


        short bananaWeight = 80 * 5;
        short milkWeight = 105 * 2;
        short iceCreamWeight = 100 * 2;
        short eggsWeight = 70 * 4;

        int totalWeight = bananaWeight + milkWeight + iceCreamWeight + eggsWeight;

        System.out.println("Общий вес: " + totalWeight + " грамм");

        short weightToLose = 7000;

        int daysToLoseWeight250 = weightToLose / 250;
        int daysToLoseWeight500 = weightToLose / 500;

        int averageDaysToLoseWeight = (daysToLoseWeight250 + daysToLoseWeight500) / 2;

        System.out.println("При потере веса 250 грамм в день спортсмен потеряет вес за " + daysToLoseWeight250 + " дней");
        System.out.println("При потере веса 500 грамм в день спортсмен потеряет вес за " + daysToLoseWeight500 + " дней");

        System.out.println("В среднем спортсмену может потребоваться " + averageDaysToLoseWeight + " дней");


        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        int mashaSalary10Percent = mashaSalary / 10;
        int denisSalary10Percent = denisSalary / 10;
        int kristinaSalary10Percent = kristinaSalary / 10;

        int mashaNewSalary = mashaSalary + mashaSalary10Percent;
        int denisNewSalary = denisSalary + denisSalary10Percent;
        int kristinaNewSalary = kristinaSalary + kristinaSalary10Percent;

        int mashaYearSalary = mashaSalary * 12;
        int denisYearSalary = denisSalary * 12;
        int kristinaYearSalary = kristinaSalary * 12;

        int mashaYearNewSalary = mashaNewSalary * 12;
        int denisYearNewSalary = denisNewSalary * 12;
        int kristinaYearNewSalary = kristinaNewSalary *12;

        int mashaSalaryYearDifference = mashaYearNewSalary - mashaYearSalary;
        int denisSalaryYearDifference = denisYearNewSalary - denisYearSalary;
        int kristinaSalaryYearDifference = kristinaYearNewSalary - kristinaYearSalary;

        System.out.println("Маша, зарплата: " + mashaSalary + " рублей, повышение на 10%: " + mashaSalary10Percent + " рублей. Маша теперь получает: " + mashaNewSalary + " рублей");
        System.out.println("Денис, зарплата: " + denisSalary + " рублей, повышение на 10%: " + denisSalary10Percent + " рублей. Денис теперь получает: " + denisNewSalary + " рублей");
        System.out.println("Кристина, зарплата: " + kristinaSalary + " рублей, повышение на 10%: " + kristinaSalary10Percent + " рублей. Кристина теперь получает: " + kristinaNewSalary + " рублей");

        System.out.println("Маша, годовая зарплата до повышения: " + mashaYearSalary + " рублей. Годовая зарплата после повышения: " + mashaYearNewSalary + " рублей");
        System.out.println("Денис, годовая зарплата до повышения: " + denisYearSalary + " рублей. Годовая зарплата после повышения: " + denisYearNewSalary + " рублей");
        System.out.println("Кристина, годовая зарплата до повышения: " + kristinaYearSalary + " рублей. Годовая зарплата после повышения: " + kristinaYearNewSalary + " рублей");

        System.out.println("Маша теперь получает: " + mashaNewSalary + " рублей. Годовой доход вырос на: " + mashaSalaryYearDifference + " рублей" );
        System.out.println("Денис теперь получает: " + denisNewSalary + " рублей. Годовой доход вырос на: " + denisSalaryYearDifference + " рублей" );
        System.out.println("Кристина теперь получает: " + kristinaNewSalary + " рублей. Годовой доход вырос на: " + kristinaSalaryYearDifference + " рублей" );


    }
}