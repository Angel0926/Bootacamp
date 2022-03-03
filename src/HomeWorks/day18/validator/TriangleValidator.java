package HomeWorks.day18.validator;

import HomeWorks.day18.models.Triangle;

public final class TriangleValidator {
    private TriangleValidator() {
    }

    public static boolean isValidSide(double side) {

        return !(side < 1) && !(side > 20);
    }


    public static boolean isTriangleValid(double sideA, double sideB, double sideC) {
        return !(sideA + sideB <= sideC) && !(sideA + sideC <= sideB) && !(sideB + sideC <= sideA);
    }

    public static boolean check(Triangle triangle) {
        return isTriangleValid(triangle.getSideA(), triangle.getSideB(), triangle.getSideC());
    }

    public static boolean isTriangleRight(double sideA, double sideB, double sideC) {
        double hyp = Math.max((Math.max(sideA, sideB)), sideC);
        if (hyp == sideA && (sideA * sideA) == (sideB * sideB) + (sideC * sideC)) {
            return true;
        } else if (hyp == sideB && (sideB * sideB) == (sideA * sideA) + (sideC * sideC)) {
            return true;
        } else if (hyp == sideC && (sideC * sideC) == (sideA * sideA) + (sideB * sideB)) {
            return true;
        }
        return false;
    }


    public static double countSquare(Triangle triangle) {
        if (isTriangleRight(triangle.getSideA(), triangle.getSideB(), triangle.getSideC())) {
            double max = Math.max((Math.max(triangle.getSideA(), triangle.getSideB())), triangle.getSideC());
            if (max == triangle.getSideA()) {
                return (triangle.getSideB() * triangle.getSideC()) / 2;
            } else if (max == triangle.getSideB()) {
                return (triangle.getSideA() * triangle.getSideC()) / 2;
            }
        }
        return (triangle.getSideA() * triangle.getSideB()) / 2;
    }

    public static double countPerimeter(Triangle triangle) {
        return triangle.getSideA() + triangle.getSideB() + triangle.getSideC();
    }

}