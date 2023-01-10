public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private Boolean isSummerTires;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, double engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats, Boolean isSummerTires) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);

        this.setEngineVolume(engineVolume);
        this.setTransmission(transmission);
        this.setBodyType(bodyType);
        this.setRegistrationNumber(registrationNumber);
        this.setNumberOfSeats(numberOfSeats);
        this.setSummerTires(isSummerTires);

    }

    // Геттеры

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Boolean getSummerTires() {
        return isSummerTires;
    }

    // Сеттеры

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "неизвестна";
        } else {
            this.transmission = transmission;
        }
    }

    public void setBodyType(String bodyType) {
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "неизвестен";
        } else {
            this.bodyType = bodyType;
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "неизвестен";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }

    public void setNumberOfSeats(int numberOfSeats) {
        if (numberOfSeats <= 0) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
    }

    public void setSummerTires(Boolean summerTires) {
        if (isSummerTires == null) {
            this.isSummerTires = false;
        } else {
            this.isSummerTires = isSummerTires;
        }
    }

    // Прочие методы

    @Override
    public String toString() {
        return "Машина " +
                "Марка " + getBrand() +
                ", Модель " + getModel() +
                ", Год выпуска " + getProductionYear() +
                ", Сборка " + getProductionCountry() +
                ", Цвет " + getColor() +
                ", Максимальная скорость " + getMaxSpeed() +
                ", Объем двигателя " + engineVolume +
                ", Коробка передач " + transmission +
                ", Тип кузова " + bodyType +
                ", Регистрационный номер " + registrationNumber +
                ", Количество мест " + numberOfSeats +
                ", Резина летняя " + isSummerTires;
    }

}
