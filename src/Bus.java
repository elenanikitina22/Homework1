public class Bus extends Transport implements Competing {

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    // Прочие методы

    @Override
    public String toString() {
        return "Автобус " +
                "Марка " + getBrand() +
                ", Модель " + getModel() +
                ", Объем двигателя " + getEngineVolume();
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
