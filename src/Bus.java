public class Bus<T extends DriverTypeD> extends Transport implements Competing {

    public enum Capacity {
        EXTRA_SMALL (0, 10),
        SMALL (10, 25),
        MEDIUM (40, 50),
        LARGE (60, 80),
        ESPECIALLY_LARGE (100, 120);

        private int min;
        private int max;

        Capacity(int min, int max) {
            this.min = min;
            this.max = max;
        }

        @Override
        public String toString()
        {
            return "Вместимость: " + min + " - " + max;
        }
    }

    private Capacity capacity;

    public Bus(String brand, String model, double engineVolume, Capacity capacity, T driver) {
        super(brand, model, engineVolume, driver);
        this.capacity = capacity;
    }

    // Прочие методы

    @Override
    public String toString() {
        return "Автобус " +
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
    public String printType()
    {
        if (capacity != null)
        {
            return capacity.toString();
        }
        else
        {
            return "Данных по транспортному средству недостаточно";
        }
    }

    // Методы из интерфейса

    @Override
    public void pitStop() {
        for (Bus bus : Main.buses) {
            System.out.println(bus);
        }
    }

    @Override
    public void bestLapTime() {
        for (Bus bus : Main.buses) {
            System.out.println(bus);
        }
    }

    @Override
    public void maxSpeed() {
        for (Bus bus : Main.buses) {
            System.out.println(bus);
        }
    }

}
