public class Main {
    public static void main(String[] args) {
        task1();
    }

    // Создание записей о 4 легковых автомобилях

    public static Car[] cars = {
            new Car("Lada", "Granta", 1.7, Car.BodyType.SEDAN, new DriverTypeB("Горелов Дмитрий Арсентьевич", "B", 10)),
            new Car("Audi ", "A8 50 L TDI quattro", 3.0, Car.BodyType.HATCHBACK, new DriverTypeB("Калугина Маргарита Андреевна", "B", 5)),
            new Car("BMW", "Z8", 3.0, Car.BodyType.CROSSOVER, new DriverTypeB("Кузьмин Роман Георгиевич", "B", 7)),
            new Car("Kia", "Sportage", 2.4, Car.BodyType.UNIVERSAL, new DriverTypeB("Смирнова Екатерина Ивановна", "B", 12))
    };

    // Создание записей о 4 грузовых автомобилях

    public static Truck[] trucks = {
            new Truck("Lada", "Granta", 1.7, 3.5, new DriverTypeC("Кузнецов Фёдор Фёдорович", "C", 7)),
            new Truck("Audi ", "A8 50 L TDI quattro", 3.0, 3.6, new DriverTypeC("Косарева Ангелина Савельевна", "C", 4)),
            new Truck("BMW", "Z8", 3.0, 3.7, new DriverTypeC("Егорова Дарья Леонидовна", "C", 11)),
            new Truck("Kia", "Sportage", 2.4, 3.8, new DriverTypeC("Зверева София Алиевна", "C", 9))
    };

    // Создание записей о 4 автобусах

    public static Bus[] buses = {
            new Bus("Lada", "Granta", 1.7, Bus.Capacity.SMALL, new DriverTypeD("Павлов Константин Иванович", "D", 1)),
            new Bus("Audi ", "A8 50 L TDI quattro", 3.0, Bus.Capacity.MEDIUM, new DriverTypeD("Трофимова София Данииловна", "D", 6)),
            new Bus("BMW", "Z8", 3.0, Bus.Capacity.LARGE, new DriverTypeD("Федорова Анна Андреевна", "D", 9)),
            new Bus("Kia", "Sportage", 2.4, Bus.Capacity.ESPECIALLY_LARGE, new DriverTypeD("Дмитриев Николай Григорьевич", "D", 14))
    };

    // Участие 4 водителей

    public static void task1() {

        for (int i = 0; i < cars.length; i++)
        {
            System.out.println("Водитель " + cars[i].getDriver().getName() + " управляет легковым автомобилем " + cars[i].getBrand() + " и будет участвовать в заезде.");

        }

    }

}