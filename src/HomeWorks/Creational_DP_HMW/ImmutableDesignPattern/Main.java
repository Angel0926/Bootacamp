package HomeWorks.Creational_DP_HMW.ImmutableDesignPattern;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Author author = new Author("ccc", "ddd", 32);
        System.out.println(author);

        Book book = new Book("1232", "hhh", "hhh", author, LocalDate.of(2002, 02, 15), "jjjhj");
        System.out.println(book);
        Author author2 = book.getAuthor();
        author2.setAge(5);
        Book book1 = new Book("1232", "hhh", "hhh", author, LocalDate.of(2002, 02, 15), "jjjhj");
        System.out.println(book);
        System.out.println(author);


        Book book3 = new BookBuilder().setCode("gfhgf").setTitle("dfhfgj").setGenre("fdh").build();
        System.out.println(book3);
    }

}
