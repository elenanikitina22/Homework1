public class Truck<T extends DriverTypeC> extends Transport implements Competing {

    public enum LoadCapacity {
        N1 (3.5), // до 3,5 тонн
        N2 (12), // от 3,5 до 12 тонн
        N3 (15); // свыше 12 тонн

        private double title;

        LoadCapacity(double title) {
            this.title = title;
        }

        public double getTitle() {
            return title;
        }

    }

    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, double loadCapacity, DriverTypeC driver) {
        super(brand, model, engineVolume, driver);
    }

    // Прочие методы

    @Override
    public String toString() {
        return "Грузовой автомобиль " +
                "Марка " + getBrand() +
                ", Модель " + getModel() +
                ", Объем двигателя " + getEngineVolume();
    }

    // Методы из класса

    @Override
    public String startMoving() {
        return "Начало движения";
    }

    @Override
    public String stopMoving() {
        return "Остановиться";
    }

    // Методы из интерфейса

    @Override
    public void pitStop() {
        for (Truck truck : Main.trucks) {
            System.out.println(truck);
        }
    }

    @Override
    public void bestLapTime() {
        for (Truck truck : Main.trucks) {
            System.out.println(truck);
        }
    }

    @Override
    public void maxSpeed() {
        for (Truck truck : Main.trucks) {
            System.out.println(truck);
        }
    }

}
