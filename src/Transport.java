import java.util.ArrayList;
import java.util.List;

public abstract class Transport<T extends Driver> {
    private final String brand;
    private final String model;
    private double engineVolume;

    public List<Mechanic<Transport>> mechanic = new ArrayList<Mechanic<Transport>>();

    private T driver;

    public Transport(String brand, String model, double engineVolume, T driver) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "неизвестен";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "неизвестна";
        } else {
            this.model = model;
        }

        this.setEngineVolume(engineVolume);

        this.driver = driver;
    }

    // Геттеры

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public T getDriver() { return driver; }

    // Сеттеры

    public void setEngineVolume(double engineVolume) {

        if (engineVolume <= 0) {
            this.engineVolume = 4;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    // Прочие методы

    public abstract String passDiagnostics();

    public abstract String startMoving();

    public abstract String stopMoving();

    public abstract void printType();

    public void getInfoCar()
    {
        System.out.println("Имя водителя: " + getDriver().getName());
        System.out.println("Список механиков:");

        for (Mechanic item : mechanic)
        {
            System.out.println(item.getName());
        }
    }
}
