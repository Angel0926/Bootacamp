package HomeWorks;

import java.math.MathContext;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


/*2.
 System.out.println("Please input number");
        byte b = scanner.nextByte();
        short s =  b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println("Variable is " +b+" "+ s + " " + i + " " + l + " " + f + " " + d);*/

/*3
        System.out.println("Please input number");
        double d = scanner.nextDouble();
        float f = (float) d;
        long l = (long) f;
        int i = (int) l;
        short s = (short) i;
        byte b = (byte) s;
        System.out.println("Variable is " + d + " " + f + " " + l + " " + i + " " + s + " " + b);*/

       /* System.out.println("please input Fahrenheit");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
        System.out.println("Celsius= " + celsius);
        float f = (float) celsius;
        System.out.println(f);
        int i=(int) f;
        System.out.println(i);*/

/* 4.
        System.out.println("Input radius");
        double radius = scanner.nextDouble();
        double PI1 = 3.14159;
        double PI=Math.PI;
        double areaOfCircle=PI*radius*radius;
        System.out.println("Area of circle "+ areaOfCircle);
        double perimeterOfCircle=2*PI*radius;
        System.out.println("Perimeter of circle " + perimeterOfCircle);

 */

/*5.
      int a=1;
      int b=3;
        System.out.println(a/b);
        double d=(double) a/b;
        System.out.println(d);
        float f=(float) a/b;
        System.out.println(f);
*/

/*6.7.8.
        char a='A',b='n',c='j',d='e',e='l',f='a';
        int name= 1994;
        System.out.println(a+""+b+""+c+""+d+""+e+""+f+" "+name);

        int a1=(int) a;
        int b1=(int) b;
        int c1=(int) c;
        int d1=(int) d;
        int e1=(int) e;
        int f1=(int) f;
        System.out.println(a1+" "+b1+" "+c1+" "+d1+" "+e1+" "+f1);
    double avg=(a1+b1+c1+d1+e1+f1)/3;
        System.out.println(a+""+b+""+c+""+d+""+e+""+f+"--"+avg);
*/

/* 9
        int n=scanner.nextInt();
        System.out.println((char) n);
*/


 /*10       String name = "Ani";
        String surname = "Grigoryan";
        System.out.println(name + " " + surname);
*/

 /* 11
         int firstNum = 24;
        int secondNum = 111;
        System.out.println(firstNum + secondNum);
        String name = "125";
        System.out.println(name + " + " + firstNum + "=" + secondNum);
*/

        String txt = "We are the so-called\b + \"Vikings\" from the north.";
        String txt1 = "We are the so-called\r + \"Vikings\" from the north.";
        String txt2 = "We are the so-called\n + \"Vikings\" from the north.";
        String txt3 = "We are the so-called\t + \"Vikings\" from the north.";

        System.out.println(txt);
        System.out.println(txt1);
        System.out.println(txt2);
        System.out.println(txt3);
/*
        int one=125;
        int two=130;
        int three=one;
        one=two;
        two=three;
        System.out.println("one= "+one+"\n"+ "two="+ two);
*/
        /*
        1) Which data type would you use to represent the following values?
     a. Child age-byte
     b. Employee salary -long
     c .Whether somebody has children or not -boolean
     d. Apartment letter- char

2) Find the errors in the following Java sentences:
           a) int a, b, c a = 0   -> int a, b, c; a = 0
          b) System.out.println('ab');    ->  System.out.println("ab");
          c) System.out.println( (3 + 2) – 1) ); -> System.out.println( (3 + 2 – 1) );
           d) int a = 3.2; -> int a = 3;
         e) float a = 2.1; int c = a; -> int c = (int) a;
          f) int i = 10; float b; i = b; -> i = (int) b;
        g) int x; { x = 10; } System.out.println(x); -> int x;  x = 10; System.out.println(x);
           h) boolean a, b; a = false, b = true; -> a = false; b = true;
          i) int x; x = 1; r = x + 1; ->  int r = x + 1;
         j) String s = 'This is a string'; -> String s = "This is a string";

       3)What will be output
       int i = 10;
       int n = i++ % 5; -> result is 0


      4) Find the value of the variable result after executing the following sentences:
        int a;
        int b;
        int result;
     a) a = 4; b = 12; result = a + b / 3; 5
     b) a = 3; a = a + 3; b = 2; result = a – b; 4
     c) a = 2; b = a + 1; a = b + 2; result = a + b + a; result = -result; -13
     d) a = 3; b = 11; result = (b % a) + 1; 3
     e) a = 3; b = a++; result = 1; result += a – b; 2

         */
    }
}

