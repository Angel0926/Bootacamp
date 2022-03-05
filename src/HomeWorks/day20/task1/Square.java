package HomeWorks.day20.task1;




public class Square extends Shape {

    protected double getArea(double radius) {
        return radius * radius;
    }

    protected double getPerimeter(double radius) {
        return 4*radius ;
    }
}
