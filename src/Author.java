public class Author {
    private String firstName;
    private String secondName;

    public Author(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    // Геттеры

    public String getFirstName() {
        return this.firstName;
    }

    public String getSecondName() {
        return this.secondName;
    }

    // Прочие методы

    @Override
    public String toString() {
        return this.firstName + this.secondName;
    }

    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, secondName);
    }

}
