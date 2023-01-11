public abstract class Transport {
    private final String brand;
    private final String model;
    private double engineVolume;

    public Transport(String brand, String model, double engineVolume) {

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

    // Сеттеры

    public void setEngineVolume(double engineVolume) {

        if (engineVolume <= 0) {
            this.engineVolume = 4;
        } else {
            this.engineVolume = engineVolume;
        }

    }

    // Прочие методы

    public void startMoving() {

    }

    public void stopMoving() {

    }

}
