public class Main {
    public static void main(String[] args) {
        task();
    }

    // Создание записей о 3 автобусах

    public static Bus[] buses = {
            new Bus("Lada", "Granta", 2015, "Россия", "Желтый", 120),
            new Bus("Audi", "A8 50 L TDI quattro", 2020, "Германия", "Черный", 200),
            new Bus("BMW", "Z8", 2021, "Германия", "Черный", 150),
    };

    // Список всех автобусов

    public static void task() {
        for (Bus bus : buses) {
            System.out.println(bus);
        }
    }

}