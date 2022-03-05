package HomeWorks.day21.task4;

public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        System.out.println("Rectangle area");
        return rectangleArea();
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Rectangle perimeter");
        return rectanglePerimeter();
    }

    public double rectangleArea() {

        return 2*(length+width);
    }
    public double rectanglePerimeter() {
        return length*width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
