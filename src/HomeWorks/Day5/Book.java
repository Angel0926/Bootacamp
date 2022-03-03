package HomeWorks.Day5;

/**
 * Class and Object
 * Define Book class
 */
public class Book {
    /**
     Class which
     * Has  fields name, author, price
     * define all argument constructor
     * write method which will print all information about Book
     * write methods which will print name and email of the author
     * create 2 instances of Book, which has same author
     * print all info about books
     */

    /**
     * Has  fields name, author, price
     */
    String name;
    Author author;
    int price;

    /**
     * define all argument constructor
     */
    public Book(String name, Author author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    /**
     * write method which will print all information about Book
     */
    public void allInfo() {
        System.out.println("name-  " + name + "\n" + "author-  " + author.name + "\n" + "price- " + price);

    }

    /**
     * write methods which will print name and email of the author
     */
    public void info() {
        System.out.println("author-  " + author.name + "\n" + "email- " + author.email);

    }

}
