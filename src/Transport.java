import java.util.*;

public abstract class Transport<T extends Driver> {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Map<Transport<?>, Mechanic<?>> Mechanic = new HashMap<Transport<?>, Mechanic<?>>();
    private Set<Driver> hashSetDrivers = new HashSet<Driver>();

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

    public void addDriver(Driver driver)
    {
        hashSetDrivers.add(driver);
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

        for (Map.Entry<Transport<?>, Mechanic<?>> item : Mechanic.entrySet())
        {
            if (item.getValue().equals(obj) == false)
            {
                System.out.println("Механик - " + item.getValue().getName());
                obj = item.getValue();
            }
        }
    }

    public void getInfoDrivers()
    {
        System.out.println("Список водителей:");

        Iterator<Driver> item = hashSetDrivers.iterator();

        while (item.hasNext())
        {
            System.out.println(item.next().getName());
        }
    }
}
