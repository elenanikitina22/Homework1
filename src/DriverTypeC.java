public class DriverTypeC extends Driver {

    public DriverTypeC(String name, String driversLicenseType, int experience) {
        super(name, driversLicenseType, experience);
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

    @Override
    public String refuelCar() {
        return "Заправить авто";
    }

}
