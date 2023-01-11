public class Car<T extends DriverTypeB> extends Transport implements Competing {

    public Car(String brand, String model, double engineVolume, T driver) {
        super(brand, model, engineVolume, driver);
    }

    // Прочие методы

    @Override
    public String toString() {
        return "Легковой автомобиль " +
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
        for (Car car : Main.cars) {
            System.out.println(car);
        }
    }

    @Override
    public void bestLapTime() {
        for (Car car : Main.cars) {
            System.out.println(car);
        }
    }

    @Override
    public void maxSpeed() {
        for (Car car : Main.cars) {
            System.out.println(car);
        }
    }

}
