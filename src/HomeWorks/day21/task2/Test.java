package HomeWorks.day21.task2;

public class Test {
    public static void main(String[] args) {

        Person person=new Person();
        person.setAge(150);
        System.out.println(person.id());
        Student student=new Student();
        System.out.println(student.id(240,7));
    }
}
