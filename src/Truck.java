public class Truck<T extends DriverTypeC> extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume, T driver) {
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
