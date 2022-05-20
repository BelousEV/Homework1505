public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Стивен", "Кинг");
        Author author2 = new Author("Ирина", "Измайлова");

        Book book1 = new Book("Противостояние", author1, 2015);
        Book book2 = new Book("Собор", author2, 2010);

        System.out.println(book1.getTitle() + " " + book1.getYear() + " "+ book1.getAuthor().getFullName());
        System.out.println(book2.getTitle() + " " + book2.getYear() + " "+ book2.getAuthor().getFullName());

        book1.setYear(2020);
        System.out.println(book1.getTitle() + " " + book1.getYear() + " " + book1.getAuthor().getFullName());


    }

}