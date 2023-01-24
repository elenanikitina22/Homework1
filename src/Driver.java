public abstract class Driver {
    private String name;
    private String driversLicenseType;
    private int experience;

    public Driver(String name, String driversLicenseType, int experience) {

        this.setName(name);
        this.setDriversLicenseType(driversLicenseType);
        this.setExperience(experience);
    }

    // Геттеры

    public String getName() {
        return name;
    }

    public String getDriversLicenseType() throws MyExcep {
        if (driversLicenseType.equals("неизвестен"))
            throw new MyExcep("Необходимо указать тип прав!");
        else
            return driversLicenseType;
    }

    public int getExperience() {
        return experience;
    }

    // Сеттеры

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "неизвестно";
        } else {
            this.name = name;
        }
    }

    public void setDriversLicenseType(String driversLicenseType) {
        if (driversLicenseType == null || driversLicenseType.isEmpty() || driversLicenseType.isBlank()) {
            this.driversLicenseType = "неизвестен";
        } else {
            this.driversLicenseType = driversLicenseType;
        }
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = 4;
        } else {
            this.experience = experience;
        }
    }

    // Прочие методы

    public abstract String startMoving();

    public abstract String stopMoving();

    public abstract String refuelCar();

    @Override
    public String toString() {
        return "Водитель " +
                "ФИО " + name +
                ", Тип водительских прав " + driversLicenseType +
                ", Стаж " + experience;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null)
            return false;

        var driver = (Driver)obj;
        if (this.getName().equals(driver.getName()))
            return true;

        return false;
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }
}