package HomeWorks.day21.task4;

public class Main {
    public static void main(String[] args) {
        Shape sq = new Square(25);
        Shape c=new Circle(17);
        Shape re=new Rectangle(24,14);

        Shape[] f=new Shape[3];
        f[0]=sq;
        f[1]=c;
        f[2]=re;
        for (Shape s:f) {
            System.out.println(s.calculateArea());

            System.out.println(s.calculatePerimeter());
            System.out.println();
        }
    }
}
