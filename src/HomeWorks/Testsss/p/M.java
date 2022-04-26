package HomeWorks.Testsss.p;

import java.util.LinkedList;
import java.util.List;

public class M {
    public static void main(String[] args) {
        List<Person> a=new LinkedList<>();
        Person person=new Person("ani", 25);
        Person person1=new Person("anna", 30);
        Person person2=new Person("amina", 25);
        Person person3=new Person("anya", 85);
        a.add(person);
        a.add(person1);
        a.add(person2);
        a.add(person3);

  PersonList <List<Person>> personList=new PersonList<>(a);

        for (Person personAll : personList) {
            System.out.println(personAll);

        }



}}
