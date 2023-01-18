public class Mechanic {

    private String name;
    private String company;
    private String car;

    public Mechanic (String name, String company, String car) {
        this.name = name;
        this.company = company;
        this.car = car;
    }

    // Сеттеры

    public void setCompany(String company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCar(String car) {
        this.car = car;
    }

    // Геттеры

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }

    public String getCar() {
        return car;
    }

    // Методы

    public void doMaintenance()
    {
        System.out.println("Проведено техобслуживание");
    }

    public void fixCar()
    {
        System.out.println("Машина починена");
    }
}
