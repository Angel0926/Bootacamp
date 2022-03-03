package HomeWorks.day19.task1;

public class Dog extends Animal {
    @Override
    protected void voice() {
        System.out.println("voice");
    }

    @Override
    protected void eat() {
        System.out.println("Eat");
    }

}
