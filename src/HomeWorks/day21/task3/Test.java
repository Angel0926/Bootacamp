package HomeWorks.day21.task3;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        animal.setAge(2);
        System.out.println(animal.getAge());
        animal.setName("dog");
        System.out.println(animal.getName());
        System.out.println();

        Animal animal1 = new Cat();
        animal1.sound();
        animal1.setAge(5);
        System.out.println(animal1.getAge());
        animal1.setName("crocodile");
        System.out.println(animal1.getName());
        System.out.println();

        Cat cat = new Cat();
        cat.sound();
        cat.setAge(8);
        System.out.println(cat.getAge());
        cat.setName("monkey");
        System.out.println(cat.getName());

    }
}
