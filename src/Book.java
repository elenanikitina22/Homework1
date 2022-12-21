public class Book {
    private String name;
    private Author author;
    private int year;

    public Book(String name, Author author, int year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }

    // Сеттеры

    public void setYear(int year) {
        this.year = year;
    }

    // Геттеры

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    // Прочие методы

    @Override
    public String toString() {
        return "Имя " + this.name + ", Автор " + this.author + ", Год " + this.year;
    }

    @Override
    public boolean equals(Object obj) {
        return (this == obj);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, author, year);
    }

}
