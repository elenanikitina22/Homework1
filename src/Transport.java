public class Transport {
    private final String brand;
    private final String model;
    private final int productionYear;
    private final String productionCountry;
    private String color;
    private int maxSpeed;

    public Transport(String brand,
                     String model,
                     int productionYear,
                     String productionCountry,
                     String color,
                     int maxSpeed) {

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

        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "неизвестен";
        } else {
            this.color = color;
        }

        if (maxSpeed <= 0) {
            this.maxSpeed = 4;
        } else {
            this.maxSpeed = maxSpeed;
        }

    }

    // Геттеры

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    // Сеттеры

    public void setColor(String color) {

        if (color == null || color.isEmpty() || color.isBlank()) {
            this.color = "неизвестен";
        } else {
            this.color = color;

        }
    }

    public void setMaxSpeed(int maxSpeed) {

        if (maxSpeed <= 0) {
            this.maxSpeed = 4;
        } else {
            this.maxSpeed = maxSpeed;
        }

    }
    
}
