package HomeWorks.Day5;

public class AuthorTest {
    public static void main(String[] args) {
        /**
         *create an instance of Author and print all info about him
         */
        Author author1 = new Author("Albanian A.", "THTWL@gmail.com", 'M');
        Author author2 = new Author("Semirjian A.", "BLCY@gmail.com", 'M');
        Author author3 = new Author("Albanian A.", "THTWL@gmail.com");

        author1.allInfo();
        author2.allInfo();
        author3.allInfo();
        author1.Info();
        author2.Info();
        author3.Info();
    }
}
