package HomeWorks.day21.task4;

public class Circle implements Shape{
    private  double radius ;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        System.out.println("Circle area");
        return circleArea();
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Circle perimeter");
        return circlePerimeter();
    }

    public double circleArea() {

        return Math.PI * Math.pow(radius, 2);
    }

    public double circlePerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
