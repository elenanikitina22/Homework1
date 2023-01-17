public class Truck<T extends DriverTypeC> extends Transport implements Competing {

    public enum LoadCapacity {
        N1 (0, 3.5f), // до 3,5 тонн
        N2 (3.5f, 12f), // от 3,5 до 12 тонн
        N3 (12f, 15f); // свыше 12 тонн

        private float min;
        private float max;

        LoadCapacity(float min, float max) {
            this.min = min;
            this.max = max;
        }

        public float getMax() {
            return max;
        }

        @Override
        public String toString()
        {
            return "Грузоподъемность: от " + min + " тонн до " + max + " тонн";
        }
    }

    private LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, LoadCapacity loadCapacity, DriverTypeC driver) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity = loadCapacity;
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
    public String startMoving() {
        return "Начало движения";
    }

    @Override
    public String stopMoving() {
        return "Остановиться";
    }

    @Override
    public void printType()
    {
        if (loadCapacity.getMax() > 0f)
        {
            System.out.println(loadCapacity.toString());
        }
        else
        {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }

    // Методы из интерфейса

    @Override
    public String passDiagnostics(){
        try {
            if (getDriver().getDriversLicenseType() == "неизвестен")
                throw new Exception("Необходимо указать тип прав!");
            else return "Пройдена диагностика";
        }
        catch (Exception ex)
        {
            return ex.getMessage();
        }
    }

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
