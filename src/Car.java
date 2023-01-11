public class Car extends Transport implements Competing {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
    public void startMoving() {

    }

    @Override
    public void stopMoving() {

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
