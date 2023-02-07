package homework.elena.homework1.model;

public class Ingredient {
    private String name;
    private int amount;
    private String measureUnit;


    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public String getMeasureUnit() {
        return measureUnit;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setMeasureUnit(String measureUnit) {
        this.measureUnit = measureUnit;
    }
}