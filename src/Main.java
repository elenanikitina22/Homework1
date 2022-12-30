import org.w3c.dom.ls.LSOutput;
import transport.Car;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task();
        changeTires();
        result();
    }

    // Создание записей о 5 машинах

    public static Car[] cars = {
            new Car("Lada", "Granta", 1.7, "Желтый", 2015, "Россия", "Ручная", "Седан", "A100РТ", 5, true),
            new Car("Audi ", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия", "Ручная", "Седан", "В301СП", 5, false),
            new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия", "Ручная", "Седан", "Д702КВ", 5, true),
            new Car("Kia", "Sportage", 2.4, "Красный", 2018, "Южная Корея", "Ручная", "Седан", "Л514КД", 5, false),
            new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея", "Ручная", "Седан", "Т812УГ", 5, true),
    };

    // Список всех машин

    public static void task() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }

    // Метод «сменить шины на сезонные»

    public static int currentMonth = 12;
    public static int selectedCar = 0;

    public static void changeTires() {

        if (currentMonth >= 3 && currentMonth <= 11) {
            cars[selectedCar].setSummerTires(true);
        } else {
            cars[selectedCar].setSummerTires(false);
        }

    }

    public static void result() {
        System.out.println("Машина " + cars[selectedCar].getBrand() + ", летние шины стали " + cars[selectedCar].isSummerTires());
    }

}
