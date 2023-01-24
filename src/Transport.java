import java.util.*;

public abstract class Transport<T extends Driver> {
    private final String brand;
    private final String model;
    private double engineVolume;

    private Map<Transport<?>, Mechanic<?>> mechanic = new HashMap<Transport<?>, Mechanic<?>>();

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

    public void addMechanic(Transport<?> car, Mechanic<?> mechanic)
    {
        this.mechanic.put(car, mechanic);
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

        Object obj = null;

        for (Map.Entry<Transport<?>, Mechanic<?>> item : mechanic.entrySet())
        {
            if (item.getValue().equals(obj) == false)
            {
                System.out.println("Механик - " + item.getValue().getName());
                obj = item.getValue();
            }
        }
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj == null)
            return false;

        var car = (Transport)obj;
        if (this.getBrand().equals(car.getBrand()) && this.getModel().equals(car.getModel()))
            return true;

        return false;
    }

    @Override
    public int hashCode()
    {
        return this.getBrand().hashCode() + this.getModel().hashCode();
    }
}
