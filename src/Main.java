public class Main {
    public static void main(String[] args) {
        task1();
    }

    // Создание записей о 4 легковых автомобилях - категория B

    public static Car[] cars = {
            new Car("Lada", "Granta", 1.7, new DriverTypeB("Горелов Дмитрий Арсентьевич", "C", 10)),
            new Car("Audi ", "A8 50 L TDI quattro", 3.0, new DriverTypeB("Калугина Маргарита Андреевна", "B", 5)),
            new Car("BMW", "Z8", 3.0, new DriverTypeB("Кузьмин Роман Георгиевич", "C", 7)),
            new Car("Kia", "Sportage", 2.4, new DriverTypeB("Смирнова Екатерина Ивановна", "D", 12))
    };

    // Создание записей о 4 грузовых автомобилях - категория C

    public static Truck[] trucks = {
            new Truck("Lada", "Granta", 1.7, new DriverTypeC("Кузнецов Фёдор Фёдорович", "B", 7)),
            new Truck("Audi ", "A8 50 L TDI quattro", 3.0, new DriverTypeC("Косарева Ангелина Савельевна", "C", 4)),
            new Truck("BMW", "Z8", 3.0, new DriverTypeC("Егорова Дарья Леонидовна", "D", 11)),
            new Truck("Kia", "Sportage", 2.4, new DriverTypeC("Зверева София Алиевна", "B", 9))
    };

    // Создание записей о 4 автобусах - категория D

    public static Bus[] buses = {
            new Bus("Lada", "Granta", 1.7, new DriverTypeD("Павлов Константин Иванович", "D", 1)),
            new Bus("Audi ", "A8 50 L TDI quattro", 3.0, new DriverTypeD("Трофимова София Данииловна", "C", 6)),
            new Bus("BMW", "Z8", 3.0, new DriverTypeD("Федорова Анна Андреевна", "B", 9)),
            new Bus("Kia", "Sportage", 2.4, new DriverTypeD("Дмитриев Николай Григорьевич", "C", 14))
    };

    // Участие 4 водителей

    public static void task1() {

        for (int i = 0; i < cars.length; i++)
        {
            System.out.println("Водитель " + cars[i].getDriver().getName() + " управляет легковым автомобилем " + cars[i].getBrand() + " и будет участвовать в заезде.");
        }

        for (int i = 0; i < trucks.length; i++)
        {
            System.out.println("Водитель " + trucks[i].getDriver().getName() + " управляет грузовым автомобилем " + trucks[i].getBrand() + " и будет участвовать в заезде.");
        }

        for (int i = 0; i < buses.length; i++)
        {
            System.out.println("Водитель " + buses[i].getDriver().getName() + " управляет автобусом " + buses[i].getBrand() + " и будет участвовать в заезде.");
        }

    }

}