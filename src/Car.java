public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private Boolean isSummerTires;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed, double engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats, Boolean isSummerTires) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        this.engineVolume = engineVolume;
        this.transmission = transmission;
        this.bodyType = bodyType;
        this.registrationNumber = registrationNumber;
        this.numberOfSeats = numberOfSeats;
        this.isSummerTires = isSummerTires;

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
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

}
