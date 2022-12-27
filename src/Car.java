import java.util.Objects;

//hw

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {

        if (Objects.equals(brand, "") || Objects.equals(brand, "null")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }

        if (Objects.equals(model, "") || Objects.equals(model, "null")) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }

        if (Objects.equals(color, "") || Objects.equals(color, "null")) {
            this.color = "Белый";
        } else {
            this.color = color;
        }

        if (productionYear <= 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }

        this.productionCountry = productionCountry;
    }

    @Override
    public String toString() {
        return "Машина " +
                "Бренд " + brand +
                ", Модель " + model +
                ", Объем двигателя " + engineVolume +
                ", Цвет " + color +
                ", Год выпуска " + productionYear +
                ", Сборка " + productionCountry;
    }

    // hw

}
