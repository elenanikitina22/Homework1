public class Main {
    public static void main(String[] args) {
        task();
    }

    // Создание записей о 5 машинах

    private static final Car[] CARS = {
            new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия"),
            new Car("Audi ", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия"),
            new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия"),
            new Car("Kia", "Sportage", 2.4, "Красный", 2018, "Южная Корея"),
            new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея"),
    };

    // Список всех машин

    public static void task() {
        for (Car car : CARS) {
            System.out.println(car);
        }
    }

}
