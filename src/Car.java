public class Car<T extends DriverTypeB> extends Transport implements Competing {

    public enum BodyType {
        SEDAN ("Седан"),
        HATCHBACK ("Хетчбек"),
        COUPE ("Купе"),
        UNIVERSAL ("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String title;

        BodyType(String title) { this.title = title; }

        public String getTitle() {
            return title;
        }

        @Override
        public String toString()
        {
            return "Тип кузова: " + getTitle();
        }
    }

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, BodyType bodyType, T driver) {
        super(brand, model, engineVolume, driver);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    // Прочие методы

    @Override
    public String toString() {
        return "Легковой автомобиль " +
                "Марка " + getBrand() +
                ", Модель " + getModel() +
                ", Объем двигателя " + getEngineVolume() +
                ", Тип кузова " + getBodyType();
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
        if (bodyType != null)
        {
            return bodyType.toString();
        }
        else
        {
            return "Данных по транспортному средству недостаточно";
        }
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
