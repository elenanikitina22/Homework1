public class Main {
    public static void main(String[] args) {

        // Создание объектов

        Author author1 = new Author("Иван", " Иванов");
        Author author2 = new Author("Петр", " Петров");

        Book book1 = new Book("Новый год", author1, 1990);
        Book book2 = new Book("Старый новый год", author2, 2000);

        System.out.println(book1);

        // Установка другого года в объекте

        System.out.println("book1.getYear() = " + book1.getYear());
        book1.setYear(1991);
        System.out.println("book1.getYear() = " + book1.getYear());

        // Проверка значений новых методов

        // toString

        System.out.println("book1.toString() = " + book1.toString());
        System.out.println("book2.toString() = " + book2.toString());
        System.out.println("author1.toString() = " + author1.toString());
        System.out.println("author2.toString() = " + author2.toString());

        // hashCode

        System.out.println("book1.hashCode() = " + book1.hashCode());
        System.out.println("book2.hashCode() = " + book2.hashCode());
        System.out.println("author1.hashCode() = " + author1.hashCode());
        System.out.println("author2.hashCode() = " + author2.hashCode());

        // equals

        System.out.println("book1.equals(book1) = " + book1.equals(book1));
        System.out.println("book1.equals(book1) = " + book1.equals(book2));
        System.out.println("author1.equals(book1) = " + author1.equals(book1));
        System.out.println("author2.equals(author2) = " + author2.equals(author2));

    }
}