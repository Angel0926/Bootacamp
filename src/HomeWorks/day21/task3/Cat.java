package HomeWorks.day21.task3;

public class Cat extends Animal {
   protected int age;
   protected String name;

    public Cat() {
    }

    public void sound() {
        System.out.println("Cat");
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
