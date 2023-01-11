public class Bus<T extends DriverTypeD> extends Transport implements Competing {

    public Bus(String brand, String model, double engineVolume, T driver) {
        super(brand, model, engineVolume, driver);
    }

    // Прочие методы

    @Override
    public String toString() {
        return "Автобус " +
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
        for (Bus bus : Main.buses) {
            System.out.println(bus);
        }
    }

    @Override
    public void bestLapTime() {
        for (Bus bus : Main.buses) {
            System.out.println(bus);
        }
    }

    @Override
    public void maxSpeed() {
        for (Bus bus : Main.buses) {
            System.out.println(bus);
        }
    }

}
