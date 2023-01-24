public class Mechanic<T extends Transport> {

    private String name;
    private String company;

    public Mechanic (String name, String company) {
        this.name = name;
        this.company = company;
    }

    // Сеттеры

    public void setCompany(String company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Геттеры

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    // Методы

    public void doMaintenance()
    {
        System.out.println("Проведено техобслуживание");
    }

    public void fixCar(T car)
    {
        System.out.println("Машина " + car.getBrand() + " починена");
    }
}
