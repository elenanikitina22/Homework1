import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        task1();

        Car car = new Car("Lada", "Granta", 1.7, Car.BodyType.SEDAN, new DriverTypeB("Горелов Дмитрий Арсентьевич", "B", 10));
        Car carTwo = new Car("Audi ", "A8 50 L TDI quattro", 3.0, Car.BodyType.HATCHBACK, new DriverTypeB("Калугина Маргарита Андреевна", "B", 5));
        Car carThree = new Car("Kia", "Sportage", 2.4, Car.BodyType.UNIVERSAL, new DriverTypeB("Смирнова Екатерина Ивановна", "B", 12));
        System.out.println(car.passDiagnostics());

        List<Transport<?>> transports = new ArrayList<Transport<?>>();
        List<Driver> drivers = new ArrayList<Driver>();

        transports.add(new Car("Lada", "Granta", 1.7, Car.BodyType.SEDAN, new DriverTypeB("Горелов Дмитрий Арсентьевич", "B", 10)));
        transports.add(new Truck("Audi ", "A8 50 L TDI quattro", 3.0, Truck.LoadCapacity.N1, new DriverTypeC("Косарева Ангелина Савельевна", "C", 4)));
        transports.add(new Bus("Audi ", "A8 50 L TDI quattro", 3.0, Bus.Capacity.MEDIUM, new DriverTypeD("Трофимова София Данииловна", "D", 6)));

        drivers.add(new DriverTypeB("Горелов Дмитрий Арсентьевич", "B", 10));
        drivers.add(new DriverTypeC("Кузьмин Роман Георгиевич", "C", 7));
        drivers.add(new DriverTypeD("Смирнова Екатерина Ивановна", "Д", 12));

        Mechanic<Car> mechanicOne = new Mechanic<Car>("Артемов Михаил", "Компания-1");
        Mechanic<Car> mechanicTwo = new Mechanic<Car>("Романов Николай", "Компания-2");

        car.AddMechanic(car, mechanicOne);
        car.AddMechanic(carTwo, mechanicTwo);
        car.AddMechanic(carThree, mechanicOne);
        car.getInfoCar();
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
            new Truck("Lada", "Granta", 1.7, Truck.LoadCapacity.N1, new DriverTypeC("Кузнецов Фёдор Фёдорович", "C", 7)),
            new Truck("Audi ", "A8 50 L TDI quattro", 3.0, Truck.LoadCapacity.N1, new DriverTypeC("Косарева Ангелина Савельевна", "C", 4)),
            new Truck("BMW", "Z8", 3.0, Truck.LoadCapacity.N2, new DriverTypeC("Егорова Дарья Леонидовна", "C", 11)),
            new Truck("Kia", "Sportage", 2.4, Truck.LoadCapacity.N3, new DriverTypeC("Зверева София Алиевна", "C", 9))
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