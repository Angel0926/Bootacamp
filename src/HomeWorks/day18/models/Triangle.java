package HomeWorks.day18.models;


/**
 * 3.Write a Triangle class which `
 * - - has a sideA, sideB, sideC
 * - - write getters and setters for that
 * all sides must be in range 1 - 20
 * - - define constructor
 * - - also your class must have an isTriangleValid() private method.
 * - - and also a public check() method which will get as a parameter triangle
 * object and will call isValidTriangle() method.
 * - - also add a method which will check if your triangle is right or not.
 * - - if the triangle count square else count perimeter.
 * - - use method overloading
 */
public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }


    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                '}';
    }
}
