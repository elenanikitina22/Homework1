public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }

    // Создание записей о 5 машинах

    public static Car[] cars = {
            new Car("Lada", "Granta", 2015, "Россия", "Желтый", 200, 1.7, "Ручная", "Седан", "A100РТ", 5, true),
            new Car("Audi ", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 100, 3.0, "Ручная", "Седан", "В301СП", 5, false),
            new Car("BMW", "Z8", 2021, "Германия", "Черный", 100, 3.0, "Ручная", "Седан", "Д702КВ", 5, true),
            new Car("Kia", "Sportage", 2018, "Южная Корея", "Красный", 100, 2.4, "Ручная", "Седан", "Л514КД", 5, false),
            new Car("Hyundai", "Avante", 2016, "Южная Корея", "Оранжевый", 100, 1.6, "Ручная", "Седан", "Т812УГ", 5, true),
    };

    // Список всех машин

    public static void task1() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    // Создание записей о 3 автобусах

    public static Bus[] buses = {
            new Bus("Lada", "Granta", 2015, "Россия", "Желтый", 120),
            new Bus("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 200),
            new Bus("BMW", "Z8", 2021, "Германия", "Черный", 150),
    };

    // Список всех автобусов

    public static void task2() {
        for (Bus bus : buses) {
            System.out.println(bus);
        }
    }

}