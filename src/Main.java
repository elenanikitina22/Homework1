public class Main {
    public static void main(String[] args) {

        // Задание 1

        Author author1 = new Author("Иван", " Иванов");
        Author author2 = new Author("Петр", " Петров");

        Book book1 = new Book("Новый год", author1, 1990);
        Book book2 = new Book("Старый новый год", author2, 2000);

        System.out.println("book1.getYear() = " + book1.getYear());

        book1.setYear(1991);

        System.out.println("book1.getYear() = " + book1.getYear());

        // Проверка

        System.out.println(book1);
        System.out.println(book2);

    }
}