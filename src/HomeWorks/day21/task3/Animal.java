package HomeWorks.day21.task3;

public class Animal {
  protected int age;
    protected String name;

    public Animal() {
    }

    public void sound() {
        System.out.println("Animal");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
