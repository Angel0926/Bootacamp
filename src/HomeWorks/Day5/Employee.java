package HomeWorks.Day5;

/**
 * Class and Object
 * Define Employee class
 */
public class Employee {
    /**
     Class which
     * Has  fields id, name, department, age, gender
     * define all argument constructor
     * write method which will print all information about employee
     * create 5 employee objects(3 male and 2 female)
     * 3 of them are working in same department
     *  print all info about them
     */

    /**
     * Has  fields id, name, department, age, gender
     */

    int id;
    String name;
    String department;
    int age;
    char gender;

    /**
     * define all argument constructor
     */


    public Employee(int id, String name, String department, int age, char gender) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
        this.gender = gender;
    }

    /**
     * write method which will print all information about employee
     */

    public void allInfo() {
        System.out.println("id-  " + id + "\n" + "name-  " + name + "\n" + "department-  " + department + "\n" + "age- " + age + "\n" + "gender- " + gender);

    }



}

