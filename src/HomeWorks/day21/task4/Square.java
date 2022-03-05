package HomeWorks.day21.task4;

public class Square implements  Shape{
    private  double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        System.out.println("Square area");
        return squareArea();
    }

    @Override
    public double calculatePerimeter() {
        System.out.println("Square perimeter");
        return squarePerimeter();
    }

    public double squareArea() {
        return (side * side);
    }

    public  double squarePerimeter() {
        return 4 * side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }
}
