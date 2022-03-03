package HomeWorks.Day8;

import java.util.Random;
import java.util.Scanner;

public class Operators {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args) {
        Operators op = new Operators();
        // op.vote();
        // op.evenNumber();
        // op.randomnum();
        //op.multiplyOfFive();
        //op.greatestNumber();
        //op.numWeekDay();
        // op.iceCream();
        // op.leapYear();
        //op.randomValue();
        //op.aAndb();
        //op.aAndbMulti();
        // op.point();
        //op.triangle();
        //op.equalsCount();
       // op.discrim();
      //  op.decreasing();
    }


/*
    /**1
     * Write a Java program to allow the user to input his/her age. Then the
     * program will show if the person is eligible to vote. A person who is
     * eligible to vote must be older than or equal to 18 years old.
     */
/*
    void vote() {
        System.out.println("Please input your age");
        int age = scanner.nextInt();
        if (age >= 18)
            System.out.println("You are eligible to vote");
        else if (age < 18) System.out.println("You are not eligible to vote");
        else System.out.println("Invalid number");
    }
*/

    /**2
     * Write a Java program to determine whether an input number is an
     * even number.
     */
/*
    public void evenNumber() {
        System.out.println("Please input number");
        int num = scanner.nextInt();
        if (num % 2 == 0)
            System.out.println("Number is an even");
        else if (num % 2 != 0) System.out.println("Number is not an even");
        else System.out.println("Invalid number");
    }
*/
    /**3
     * Generate and print random integer number between 2 to 7(not using bound)
     */
/*
     public void randomnum(){
    int low = 2;
    int high = 7;

    double x = Math.random();
 int result = (int)(Math.random()*(high-low)+1)+ low;
    System.out.println("Random value " + result);
}
*/

    /**4
     * Write a Java program to determine whether an input number is a
     * multiple of a 5.
     */
    /*
    public void multiplyOfFive() {
        System.out.println("Please input number");
        int num = scanner.nextInt();
        if (num % 5 == 0)
            System.out.println("The number is a multiply of a 5");
        else if (num % 5 != 0)
            System.out.println("The number is not a multiply of a 5");
        else System.out.println("Inmvalid number");
    }
*/

    /**5
     *Take three numbers from the user and print the greatest number.
     */
    /*
    public void greatestNumber() {
        System.out.println("Please input number1");
        int number1 = scanner.nextInt();
        System.out.println("Please input number2");
        int number2 = scanner.nextInt();
        System.out.println("Please input number3");
        int number3 = scanner.nextInt();
        System.out.println("The greatest number");
        if(number1>number2 && number1>number3)
            System.out.println(number1);
        else if(number2>number1 && number2>number3)
            System.out.println(number2);
        else
            System.out.println(number3);
    }
*/


/** 6
 *Write a Java program that reads a floating-point number and prints
 *zero; if the number is zero. Otherwise, print positive or negative;.
 * Add small if the absolute value of the number is less than 1, or
 * large if it exceeds 1,000,000
 * (use Math.abs() for absolute value)
 */

/*
public void pozitivNegativ() {
    System.out.println("Please input number");
    float number = scanner.nextInt();
    if (number == 0)
        System.out.println("Zero");
    if (number > 0) {
        if (number < 1)
            System.out.println("Positive" + "small");
        else if (number > 1000000)
            System.out.println("Positive" + "large");
    }
    if (number < 0) {
        if (Math.abs(number) < 1)
            System.out.println("Negative" + "small");
        if (Math.abs(number) < 1000000)
            System.out.println("Negative" + "large");
    }
}
*/


/**
 * 7 Write a Java program that keeps a number from the user and generates
 * an integer between 1 and 7 and displays the name of the weekday.
 */
/*
public void numWeekDay() {
    System.out.println("Please input number");
    int number = scanner.nextInt();
    int weekday = (number % 7) + 1;
    if (weekday == 1)
        System.out.println("Sunday");
    if (weekday == 2)
        System.out.println("Monday");
    if (weekday == 3)
        System.out.println("Tuesday");
    if (weekday == 4)
        System.out.println("Wednesday");
    if (weekday == 5)
        System.out.println("Thursday");
    if (weekday == 6)
        System.out.println("Friday");
    if (weekday == 7)
        System.out.println("Saturday");
    System.out.println(weekday);
}


*/
/**8
 *The ice cream parlor sells three balls and five balls. Can you buy
 * exactly k balls of ice cream?
 * In the cafe they sell an ice-cream with 3 balls and 5 balls.Input K integer
 * value from console, check if you can buy exactly K balls ice-cream.
 */
/*
public void iceCream() {
    System.out.println("Please input number");
    int num = scanner.nextInt();
    if (!(num<3 || num==4 || num==7 ))
        System.out.println("you can buy ice-cream");
    else System.out.println("Invalid number");
}
*/

    /**9
     * Write a Java program that takes a year from the user and print whether
     * that year is a leap year or not.
     */
/*
    public void leapYear() {
        System.out.print("Input the year ");
        int year = scanner.nextInt();
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }*/

    /**
     * 8.Generate random integer value, print true if random value
     * corresponds these conditions, else print false(use boolean primitive
     * type)
     * -input number is greater than -1000 and less than 1000
     * -input number is multiple of 3 or input number is multiple
     */
   /* public void randomValue() {
        int num = 0;
        boolean k = true;
        System.out.print("the number is:");
        num = random.nextInt();
        System.out.println(num);
        if (num < 1000 && num > -1000) {
            System.out.println("number is greater than -1000 and less than 1000-" + k);
        } else {
            System.out.println("number is greater than -1000 and less than 1000-" + !k);
        }
        if (num % 5 == 0 || num % 3 == 0) {
            System.out.println("number is multiple of 3 or input number is multiple-" + k);
        } else {
            System.out.println("number is multiple of 3 or input number is multiple-" + !k);
        }
    }*/

    /**
     * Input from console int a and int b, if a and b corresponds for following
     * requirements print “Both a and b legal”, if any of them does not
     * correspond print about it like this “a is legal b is illegal. or vice versa
     * - a ; 10 and b is not equal to 10
     * - both a and b is positive
     * - both a and b is negative
     * - a ; 10 b ; 1 both of them are odd
     * - a is a multiple of 5 OR b is a multiple of 5
     * - a is not a multiple of 5 but b is a multiple of 5
     */
  /*  public void aAndb() {
        System.out.println("Please input a");
        int a = scanner.nextInt();
        System.out.println("Please input b");
        int b = scanner.nextInt();
        if (a > 10 && b != 10) {
            System.out.println("Both a and b legal");
        } else System.out.println("Both a and b illegal");
         if (a > 10 || b == 10) {
            System.out.println("a is legal b is illegal");
        } else if (a < 10 || b != 10) {
            System.out.println("b is legal a is illegal");
        }
        if (a > 0 && b > 0) {
            System.out.println("Both a and b legal");
        } else System.out.println("Both a and b illegal");
        if (a < 0 && b > 0) {
            System.out.println("a is legal b is illegal");
        } else if (a > 0 && b < 0) {
            System.out.println("b is legal a is illegal");
        }
        if (a < 0 && b < 0) {
            System.out.println("Both a and b legal");
        } else {System.out.println("Both a and b illegal");}
        if (a < 0 && b > 0) {
            System.out.println("a is legal b is illegal");
        } else if (a > 0 && b < 0) {
            System.out.println("b is legal a is illegal");
        }
        if (a % 2 == 0 && b % 2 == 0) {
            System.out.println("Both a and b legal");
        } else System.out.println("Both a and b illegal");
        if (a % 2 == 0 && b % 2 != 0) {
            System.out.println("a is legal b is illegal");
        } else if (a % 2 != 0 && b % 2 == 0) {
            System.out.println("b is legal a is illegal");
        }
        if (a % 5 == 0 && b % 5 == 0) {
            System.out.println("Both a and b legal");
        } else System.out.println("Both a and b illegal");
        if (a % 5 == 0 && b % 5 != 0) {
            System.out.println("a is legal b is illegal");
        } else if (a % 5 != 0 && b % 5 == 0) {
            System.out.println("b is legal a is illegal");
        }
        if (a % 5 == 0 && b % 5 != 0) {
            System.out.println("Both a and b legal");
        }else System.out.println("Both a and b illegal");
        if (a % 5 == 0 && b % 5 == 0) {
            System.out.println("a is legal b is illegal");
        } else if (a % 5 != 0 && b % 5 != 0) {
            System.out.println("b is legal a is illegal");
        }}
*/

    /** 10
     * Input int values a and b from console
     * - if one of them is multiple of 7, and both positive, and a
     * greater than b, print all odd values between them
     * - else print all even values between them
     */

/*
    public void aAndbMulti() {
        System.out.println("Please input a");
        int a = scanner.nextInt();
        System.out.println("Please input b");
        int b = scanner.nextInt();
        if(a%7==0 || b%7==0){
            if(a>0 && b>0){
                if(a>b){
                    for (int i = b; b <= a-1; b++) {
                   if(b%2!=0){
                    System.out.println(b+2);}
                }}
                if(b>a){
                    for (int i = a; a < b-1 ; a++) {
                    if( a%2==0){
                        System.out.println(a+1);}
                }
            }
        }else System.out.println("invalid numbers");
    }
}*/

    /** 11
     * Given coordinates of two points in the coordinate plane.Write
     * java program to check if the points lie in the same plane?(quarter)
     * - Print In the same quarter , else print Not in the same quarter.
     * - Input 4 coordinates from console, all 4 coordinates != 0.
     */
/*
    public void point() {
        System.out.println("Please input x1");
        int x1 = scanner.nextInt();
        System.out.println("Please input y1");
        int y1 = scanner.nextInt();
        System.out.println("Please input x2");
        int x2 = scanner.nextInt();
        System.out.println("Please input y2");
        int y2 = scanner.nextInt();

        if((x1>0 && y1>0) && (x2>0 && y2>0) ){
            System.out.println("In the same quarter");
        }
        else if((x1<0 && y1<0) && (x2<0 && y2<0) ){
            System.out.println("In the same quarter");
        }
        else if((x1>0 && y1<0) && (x2>0 && y2<0) ){
            System.out.println("In the same quarter");
        }
        else if((x1<0 && y1>0) && (x2<0 && y2>0) ){
            System.out.println("In the same quarter");
        }
        else System.out.println("Not in the same quarter");
        }
*/
    /**12
     * Given 3 positive numbers different from 0, Determine if there is
     * a non-degenerate triangle with such sides.
     * - Input numbers from console
     */
    /*
public void triangle() {
    System.out.println("Please input side1");
    int side1 = scanner.nextInt();
    System.out.println("Please input side2");
    int side2 = scanner.nextInt();
    System.out.println("Please input side3");
    int side3 = scanner.nextInt();

    if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
        System.out.println("There is a non-degenerate triangle with such sides");
    } else
        System.out.println("There is not a non-degenerate triangle with such sides");
}
*/

    /**
     * 13.Given 3 numbers, print count of numbers that equals to each
     * other.(Input numbers from console)Example`
     * Input numbers` -3 -1 -3 output 2
     */

    public void equalsCount() {
        System.out.println("Please input num1");
        int num1 = scanner.nextInt();
        System.out.println("Please input num2");
        int num2 = scanner.nextInt();
        System.out.println("Please input num3");
        int num3 = scanner.nextInt();
        if (num1 != 0 && num2 != 0 && num3 != 0) {
            if (num1 == num2 && num1 == num3) {
                System.out.println("3");
            } else if (num1 == num2 && num1 < num3 || num1 == num3 && num1 < num2 || num3 == num2 && num3 < num1) {
                System.out.println("2");
            } else if (num1 != num2 && num1 != num3) {
                System.out.println("0");
            } else {

                System.out.println("1");
            }        }else System.out.println("3");}


/**
 *  14.Given 3 real numbers a , b , c .FInd all decisions for
 *     ax2 + bx + c = 0.Print all decisions, if there is not a
 *     decision ,print “Cant be”.
 */
   /*
/*
    public static void discrim(int a, int b, int c){
        double d=Math.pow(b,2)-4*a*c;
        if(d>0){
            double x1=(-b+Math.sqrt(d))/4;
            double x2=(-b-Math.sqrt(d))/4;
            System.out.println("Roots are "+x1+"\t"+x2);
        }
        else if (d==0){
            System.out.println("Roots are same "+(-b/(2*a)));

        }
        else
            System.out.println("Can't be");

    }*/
           /**
     * 15.Given 3 integer values arrange them in non-decreasing order.
     * a<= b<= c.
     */
       /*
    public void decreasing() {
        System.out.println("Please input num1");
        int num1 = scanner.nextInt();
        System.out.println("Please input num2");
        int num2 = scanner.nextInt();
        System.out.println("Please input num3");
        int num3 = scanner.nextInt();
        int k = 0;
        if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
            System.out.println(num1 + " " + num2 + " " + num3);
        }
        if (num1 <= num2 && num1 <= num3 && num2 >= num3) {
            k = num2;
            num2 = num3;
            num3 = k;
            System.out.println(num1 + " " + num2 + " " + num3);
        }
        if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
            k = num1;
            num1 = num2;
            num2 = k;
            System.out.println(num1 + " " + num2 + " " + num3);
        }
        if (num2 <= num1 && num2 <= num3 && num1 >= num3) {
            k = num1;
            num1 = num2;
            num2 = num3;
            num3=num1;
            System.out.println(num1 + " " + num2 + " " + num3);
        }
        if (num3 <= num1 && num3 <= num2 && num1 >= num2) {
            k = num1;
            num1 = num3;
            num3=k;
            System.out.println(num1 + " " + num2 + " " + num3);
        }
        if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
            k = num1;
            num1 = num3;
            num3=num2;
            num2=k;
            System.out.println(num1 + " " + num2 + " " + num3);
        }
    }*/
}





