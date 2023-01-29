package Tasks;

public enum Type {
    WORK("Рабочая"),
    PERSONAL("Личная");

    private final String type;

    Type(String type)
    {
        this.type = type;
    }

    public String getTypeEnum()
    {
        return type;
    }
}