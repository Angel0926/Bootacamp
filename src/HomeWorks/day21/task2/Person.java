package HomeWorks.day21.task2;

public class Person {
    protected int name;
    protected int age;

    public Person() {
    }

    public Person(int name, int age) {
        this.name = name;
        this.age = age;
    }

    public  int id(){
        return age*5/3;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
