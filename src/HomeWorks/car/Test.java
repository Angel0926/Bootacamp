package HomeWorks.car;

public class Test {
    public static void main(String[] args) {
        Engine engineBmw=new Engine(2500, 20000,580);

        Car BMW=new Car(2007,"BMW","a700", engineBmw);
BMW.getMark();

        System.out.println(BMW.toString());

        BMW.getEngin().setHorsePow(3000);
        System.out.println(BMW.toString());
    }

}
