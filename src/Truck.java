public class Truck extends Transport implements Competing {

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
    public void startMoving() {

    }

    @Override
    public void stopMoving() {

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
