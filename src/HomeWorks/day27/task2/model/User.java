package HomeWorks.day27.task2.model;

import java.io.Serializable;
import java.util.Objects;

/**
 * Write a small program to register Users in the file and obtain their information from the file.
 * You will need
 * - User class with name, surname and age
 * - - A method save Users(File filename)
 * - - A method getUsers From File(File filename)
 * - Extra assignment ( optional = ըստ ցանկության )
 * You can have ADD, REMOVE, LIST, EXIT commands for the command line I/O
 * operations and short method validators for names and age.
 * For the clarification - “List” command will print all the existing users, the “Exit”
 * command will close the application (saving data), the Add and Remove are trivial
 */
public class User implements Serializable {
    private  String name;
    private  String surname;
    private  int age;

    public User(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public User() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(surname, user.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
