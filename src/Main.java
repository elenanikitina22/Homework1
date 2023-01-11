public class Main {
    public static void main(String[] args) {
        task1();
    }

    // Создание записей о 4 легковых автомобилях

    public static Car[] cars = {
            new Car("Lada", "Granta", 1.7),
            new Car("Audi ", "A8 50 L TDI quattro", 3.0),
            new Car("BMW", "Z8", 3.0),
            new Car("Kia", "Sportage", 2.4)
    };

    // Создание записей о 4 грузовых автомобилях

    public static Truck[] trucks = {
            new Truck("Lada", "Granta", 1.7),
            new Truck("Audi ", "A8 50 L TDI quattro", 3.0),
            new Truck("BMW", "Z8", 3.0),
            new Truck("Kia", "Sportage", 2.4)
    };

    // Создание записей о 4 автобусах

    public static Bus[] buses = {
            new Bus("Lada", "Granta", 1.7),
            new Bus("Audi ", "A8 50 L TDI quattro", 3.0),
            new Bus("BMW", "Z8", 3.0),
            new Bus("Kia", "Sportage", 2.4)
    };

    // Создание записей о 4 водителях

    public static Driver[] drivers = {
            new Driver("Денисов Тимофей Львович", "B", 2),
            new Driver("Иванов Мирон Фёдорович ", "C", 4),
            new Driver("Морозова Валерия Германовна", "D", 6),
            new Driver("Золотарев Михаил Дмитриевич", "B", 8)
    };

    // Список всех легковых автомобилей

    public static void task1() {

        System.out.println("Водитель" + " " + "управляет автомобилем Б и будет участвовать в заезде");

    }

}