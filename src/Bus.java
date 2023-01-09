public class Bus extends Transport {

    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
    }

    // Прочие методы

    @Override
    public String toString() {
        return "Автобус " +
                "Марка " + getBrand() +
                ", Модель " + getModel() +
                ", Год выпуска " + getProductionYear() +
                ", Сборка " + getProductionCountry() +
                ", Цвет " + getColor() +
                ", Максимальная скорость " + getMaxSpeed();
    }

}
