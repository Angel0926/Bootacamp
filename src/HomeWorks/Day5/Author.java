package HomeWorks.Day5;

/**
 * Class and Object
 * Define Author class
 */
public class Author {
/**
 Class which
 * Has  fields name, email, gender
 * define all argument constructor
 * write method which will print all information about  Author
 * create an instance of Author and print all info about him
 */

    /**
     * fields name, email, gender
     */
    String name;
    String email;
    char gender;

    /**
     * define all argument constructor
     */
    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    /**
     * write method which will print all information about  Author
     */

    public void allInfo() {
        System.out.println("name-  " + name + "\n" + "email- " + email + "\n" + "gender-  " + gender);
    }

    /**
     * write methods which will print name and email of the author
     */

    public void Info() {
        System.out.println("name-  " + name + "\n" + "email- " + email);

    }


}

