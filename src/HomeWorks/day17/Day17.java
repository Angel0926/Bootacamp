package HomeWorks.day17;

import java.util.Arrays;

public class Day17 {


    public static void main(String[] args) {
    }

    /**
     * 1.Write a function add with these 3 types of overloading.
     * static void add();
     * Which prints which method is called and result
     */

/*
    public static void add(int i) {
        System.out.println("int");

    }

    public static void add(int i, float j) {
        System.out.println("Int, float");
    }

    public static void add(float i, int j) {
        System.out.println("float, int");
    }
*/

    /**
     * 2.Write 2 functions where first returns float second returns int,
     * and they have the same parameters for input.
     */

    public static int add(int i) {
        System.out.println("int");
        return i;
    }

    public static double add(float i) {
        System.out.println("float");
        return i;
    }

    /**
     * 4.Write a method called print(), which takes an array and print its contents in the form of
     * [a1, a2, ..., an]. Take note that there is no comma after the last element. The method&#39;s
     * signature is as follows:
     * We need to overload this method for int[ ], float[ ], double[ ] arrays.
     *
     * @return
     */


    public static String print(int arr[]) {


        return Arrays.toString(arr);
    }

    public static String print(double arr[]) {

        return Arrays.toString(arr);
    }

    public static String print(float arr[]) {
        return Arrays.toString(arr);

    }

    /**
     * 5.Write a search function, which
     * - - get as an argument int[ ] array, (returns the size of array)
     * public static int search(int[ ] array)
     * - - get as an argument int[ ] array , also int a, and returns an index of that argument
     * public static int search(int[ ] array, int a)
     * - - get as an argument int[ ] array, int argument, int index
     * returns true if that element is in that place in array,otherwise false
     * <p>
     * public static boolean search(int[] array, int argument, int index)
     *
     * @return int[] array = {2, 5, 8, 9, 14};
     */
    public static int search1(int[] arr) {
        return arr.length;
    }

    public static int search2(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                return i;
            }
        }

        return -1;
    }

    public static boolean search3(int[] arr, int x, int index) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i] && i == index) {
                return true;
            }
        }

        return false;
    }


    /**
     * 6. Write a square() method, which
     * - - if get one int parameter returns the square of cirqle
     * - - if get one float parameter returns the square of square
     * - - if get 2 parameters returns the square of rectangle
     */

    public static double area(double a) {

        return Math.PI * a * a;
    }

    public static float area(float a) {

        return a * a;
    }

    public static int area(int a, int b) {
        return a * b;
    }

    /**
     * 7.Write a max() function which
     * - - max(int a, int b)
     * - - max(int a, int b, int c)
     * - - max(int a , int b, int c, int d)
     */



    public static int max(int a, int b) {

        int twoMax= Math.max(a, b);
        return  twoMax;
    }


    public static int max(int a, int b, int c) {
        return Math.max(max(a, b), c);
    }

    public static int max(int a, int b, int c, int d) {
        return (max(a, b, c) >= d) ? max(a, b, c) : d;
    }

    /**
     * 8.Write a distance() function which
     * - - return distance from (0.0 , 0.0) to (a)
     * distance(int x1 , int x2, int x3, int x4) where (x1, x2) are the coordinates of a
     * distance(int, int)
     * - - return the distance from a to be, if method distance get 4 int parameters
     */

    public static double calculateDistanceBetweenPoints(
            int x1,
            int y1,
            int x2,
            int y2) {
        return Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
    }

    /**
     * 9.Write a fahrenheitCelsius() function which
     * - - prints fahrenheit value when pass (float celsius, int choice), where choice is the type of
     * fahrenheit`
     * 1 , print fahrenheit as int value
     * 2 , print fare fahrenheit asa double value
     * , if pass another value print illegal argument
     * - - prints celsius when pass (int choice, float fahrenheit)
     * Example` fahrenheitCelsius(32.0, 1);
     * Output` 32 fahrenheit is 0 celsius ;
     */
    public static int fahrenheitCelsius1(double fahrenheit) {
        return (int) ((5 * (fahrenheit - 32.0)) / 9.0);
    }
    public static int fahrenheitCelsius1(float celsius, int choice) {
        return (int) (celsius * 1.8 + 32);
    }

    public static double fahrenheitCelsius1(int choice, float celsius) {
        return celsius * 1.8 + 32;
    }
    public static void fahrenheitCelsius(float celsius, int choice) {
        if (choice == 1) {
            int fahrenheit = (int) ((celsius * 9) / 5) + 32;
            System.out.println(fahrenheit);
        } else if (choice == 2) {
            double fahrenheit = (double) ((celsius * 9) / 5) + 32;
            System.out.println(Math.round(fahrenheit));
            System.out.println("Invalid argument");
        }
    }

    public static void fahrenheitCelsius(int choice, float fahrenheit) {
        if (choice == 1) {
            int celsius = (int) ((fahrenheit - 32) * 5 / 9);
            System.out.println(celsius);
        } else if (choice == 2) {
            double celsius = (double) ((fahrenheit - 32) * 5 / 9);
            System.out.println(Math.round(celsius));
        } else {
            System.out.println("Invalid argument");
        }
    }


    /**
     * 10.Write a function` remainder() which
     * - - when pass one int value, return sum of digits for that value remainder(int)
     * - - when pass one int value and one natural int, return reminder from sum of digits divided to
     * second parameter(reminder(int 331, int 5) {
     * return (3 + 3 + 1) % 5
     */
    public static int reminder(int num) {
        int i = 0;
        int sum = 0;
        while (num > 0) {
            i = num % 10;
            sum = sum + i;
            num = num / 10;
        }
        return sum;
    }

    public static int reminder(int value, int dif) {

        if (dif != 0) {
            return reminder(value) % dif;
        }

        return -1;

    }




}