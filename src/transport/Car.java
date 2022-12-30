package transport;

public class Car {
    private final String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int productionYear;
    private final String productionCountry;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private Boolean isSummerTires;

    public static class Key {
        private final Boolean remoteEngineStart;
        private final Boolean keylessEntry;

        public Key(Boolean remoteEngineStart, Boolean keylessEntry) {

            if (remoteEngineStart == null) {
                this.remoteEngineStart = false;
            } else {
                this.remoteEngineStart = remoteEngineStart;
            }

            if (keylessEntry == null) {
                this.keylessEntry = false;
            } else {
                this.keylessEntry = keylessEntry;
            }

        }

    }

    public Car(String brand,
               String model,
               double engineVolume,
               String color,
               int productionYear,
               String productionCountry,
               String transmission,
               String bodyType,
               String registrationNumber,
               int numberOfSeats,
               Boolean isSummerTires) {

        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "неизвестна";
        } else {
            this.productionCountry = productionCountry;
        }

        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "неизвестна";
        } else {
            this.transmission = transmission;
        }

        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "неизвестен";
        } else {
            this.bodyType = bodyType;
        }

        if (registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()) {
            this.registrationNumber = "неизвестен";
        } else {
            this.registrationNumber = registrationNumber;
        }

        if (numberOfSeats <= 0) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }

        if (isSummerTires == null) {
            this.isSummerTires = false;
        } else {
            this.isSummerTires = isSummerTires;
        }

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

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
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

    public Boolean isSummerTires() {
        return isSummerTires;
    }


    // Сеттеры

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setSummerTires(Boolean summerTires) {
        isSummerTires = summerTires;
    }


    // Прочие методы

    @Override
    public String toString() {
        return "Машина " +
                "Бренд " + brand +
                ", Модель " + model +
                ", Объем двигателя " + engineVolume +
                ", Цвет " + color +
                ", Год выпуска " + productionYear +
                ", Сборка " + productionCountry +
                ", Коробка передач " + transmission +
                ", Тип кузова " + bodyType +
                ", Регистрационный номер " + registrationNumber +
                ", Количество мест " + numberOfSeats +
                ", Резина летняя " + isSummerTires;

    }

}
