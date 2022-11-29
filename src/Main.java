public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println(dog);

        var cat = 3.6;
        System.out.println(cat);

        var paper = 763789;
        System.out.println(paper);

        dog = dog + 4;
        System.out.println(dog);

        cat = cat + 4;
        System.out.println(cat);

        paper = paper + 4;
        System.out.println(paper);

        dog = dog - 3.5;
        System.out.println(dog);

        cat = cat - 1.6;
        System.out.println(cat);

        paper = paper - 7639;
        System.out.println(paper);


        var friend = 19;
        System.out.println(friend);

        friend = friend + 2;
        System.out.println(friend);

        friend = friend / 7;
        System.out.println(friend);


        var frog = 3.5;
        System.out.println(frog);

        frog = frog * 10;
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println(frog);

        frog = frog + 4;
        System.out.println(frog);


        var boxerWeight = 78.2;
        var boxerWeight2 = 82.7;

        var totalWeight = boxerWeight + boxerWeight2;
        System.out.println("Общий вес: " + totalWeight + " кг");


        var weightDifference = boxerWeight2 - boxerWeight;
        System.out.println("Разница в весе (вычитание): " + weightDifference + " кг");

        var weightDifference2 = boxerWeight2 % boxerWeight;
        System.out.println("Разница в весе (остаток от деления): " + weightDifference2 + " кг");


        var numberOfHours = 640;
        var employeeWorksHours = 8;
        var numberOfEmployees = numberOfHours / employeeWorksHours;
        System.out.println("Всего работников в компании – " + numberOfEmployees + " человек.");

        var additionalStaff = 94;
        var sumOfAllEmployees = numberOfEmployees + additionalStaff;
        var newNumberOfHours = numberOfHours / sumOfAllEmployees;
        System.out.println("Если в компании работает " + sumOfAllEmployees + " человека, то всего " + newNumberOfHours + " часа работы может быть поделено между сотрудниками.");


    }
}