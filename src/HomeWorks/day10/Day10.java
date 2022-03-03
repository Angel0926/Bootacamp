package HomeWorks.day10;

import java.util.Random;
import java.util.Scanner;

public class Day10 {
    Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    public static void main(String[] args) {
        Day10 d = new Day10();

    }

    /**
     * 1.Print all integer numbers from 1 to 10.
     * 2.Print all even integer numbers from 1 to 20.
     * 3.Print all exact squares of natural numbers that are not
     * exceeding a given positive integer N. Input N from console.
     */
/*
    public static void exeWhile1(int i, int j) {

        int i = 1;
        while (i > 0) {

            System.out.println("i = " + i);
            i++;

            if (i == 11) break;
        }
    }
    public static void exeWhile2(int i, int j) {

        System.out.println("Even numbers:");
        int i = 1;
        while (true) {

            i++;
            if (i % 2 == 0) {
                System.out.println("i = " + i);

            }
            if (i == 21) break;
        }}

*//*
    public static void exeWhile3(int j) {
         int num = 1;
        while (num * num <= n) {

            System.out.println(num * num);
            num++;

        }
        }

*/

    /**
     * Given an integer number, greater than 2.Find and print the
     * smallest natural divisor other than 1 for a given number.Input
     * number from console.Example ` Input` 15
     * Output ` 3
     */
/*
    public  static  void smallestDivisor(int num) {
        int i = 1;
        if (num > 2) {
            while (i <= num) {
                i++;
                if (num % i == 0) {
                    System.out.println(i);
                    break;
                }
            }
    }else System.out.println("invalid number");}
*/


    /**
     * 5.Print all integer powers of two not exceeding N in ascending
     * order.Input N from console. Example ` Input 50(You can not use
     * Math.pow())
     * Output ` 1 2 4 8 16 32
     */
/*
    public static void allINTpowers(int num) {
        int b = 1;
        while (b <= num) {
            b = b << 1;
            if (b < num) {
                System.out.println(b);
            }
        }
    }
*/
    /*
     int power = 2;

        if (power >= n) {

            return;
        }

        System.out.println(power);

        while (power < n) {
            power = power * 2;
            if (power < n) {
                System.out.println(power);
            }

        }*/

    /**
     * 6.For a given integer number N,print all integers in descending
     * order.
     */
/*
    public  static void desendingInt(int num){
        int a=0;
while(a<num){
    a++;
    System.out.println(num-a);

}
    }*/


/**
 * 7.For a given integer number N,print all integers that are multiple of
 * 2 in descending order.
 */
/*
    public static void integersMultipleOf2DescendingOrder(int n) {

       /* while (n > 0) {
            if (n % 2 == 0) {
                System.out.print(" " + n);
                n -= 2;
            } else {
                n = n - 1;
                System.out.print(" " + n);
                n -= 2;
            }
        }
        if (n % 2 != 0) {

        n--;
    }
        while (n >= 2) {

        System.out.print(" " + n);
        n -= 2;
    }

}
*/

/**
 *8Input N natural number till N would be the exact power of 2.If N is
 * the exact power of 2 .
 * - Print N
 * - Print count of input integers
 * - break loop
 *
 */

/*
int count=1;
public void exactPower(){
    System.out.println("num");
    int b=scanner.nextInt();

    int n=b;
        while (n != 1)
        {
            if (n % 2 != 0){
                count++; exactPower();}
          else   n = n / 2;
        }
    System.out.println(b +" "+count);
    }
    */

    /**
     * 9.For a given natural N print the smallest integer k that`
     * Math.pow(2,k)≥N.(You can not use Math.pow())
     * Example` Input 7
     * Output 3
     */
/*

    public static void power(int n) {
        int num= 1;
        int count = 0;
        while(num<n){
          num+=2;
            count++;
        }
                System.out.println(count);
            }
/*int count = 0;
        int num = 1;
        while (n > num) {
            num = num << 1;
            count++;
            if (num >= n) {
                System.out.println(count);
                break;
            }
        }*/



    /**
     *10.Write Java program to print the table of characters that are
     * equivalent to the Ascii codes from 32 to 122.Print 10 characters
     * at each line.
     */
/*
    public static void charEquivalent(int i, int n){

int k=0;int t=k;
        while(i < n) {

            if (t%10==0 & i!=32){
                System.out.println("\n");
            }
            System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
         i++; t++;
        }}
*/
     /* int min = 32;
        int max = 122;
        while (min <= max) {
            char charac = (char) min;
            System.out.print(" "+charac+" ");
            if (min % 10 == 2&& min!=32) {
                System.out.print("\n");
            }
            min++;
        }*/

/**
 * 11.Print all integer numbers from 1 to N, except that are multiple of
 * 3(Input N from console)
 * System.out.println(i);
 * }
 */
/*
public static  void multiplyOfThree(int n){

    int i=0;
    while(i<n){
        i++;
        if(i%3==0){
            continue;
        }else System.out.println(i);
    }}}
*/


    /**
     * 12.Given integer number A &gt; 1,define what is the Fibonacci number
     * is A, i.e print such number n that φn=A.If A is not a Fibonacci
     * number print -1. Example
     * Input 8
     * Output 6
     * Input 10
     * Output -1
     */
    /*
    public static int fibonacciNumber(int input) {
        int a1 = 0;
        int a2 = 1;
        int next = a1 + a2;
        int index = 1;
        while (next != input) {
            if (next > input) {
                return -1;
            }
            next = a1 + a2;
            a1 = a2;
            a2 = next;
            index++;
        }
        return index;
    }*/
/*
    public int task12(int a) {
        int v = 0;
        int b = 1;
        int n = 3;
        while (!(v + b > a)) {
            if (v + b == a) {
                return n;
            }
            int g = b;
            b += v;
            v = g;
            n++;
        }
        return -1;
    }*/

    /**
     * 13.On the first day, the athlete ran x kilometers,and then every day
     * he increased the mileage by 10% from the previous value,Given the
     * number y, determine the number of the day for which the athlete&#39;s
     * mileage will be at least y kilometers.
     * Example` Input 10 Output 9
     * System.out.println(i);
     */


/*

    public static int mileage(double x, double y) {

        int days = 1;
        while (x < y) {
            x = x + x * 0.1;
            days++;
        }
        return days;
    }



    /**
     * 14.The deposit in the bank is x dollars. It increases annually by p
     * percent, after which the fractional part of cents is discarded.
     * Determine how many years the contribution(ներդրում) will be at
     * least y dollars.(Input x , p , y from console)
     */
    /*
    public static int bankDeposit(int x, int p, int y) {
        int years = 0;
        while (x < y) {
            x += 0.1 * x * p;
            years++;
        }
        return years;
    }
*/
    /**
     * 15.The sequence consists of different natural numbers and ends
     * with the number 0. Determine the value of the second largest
     * element in this sequence.
     * (A sequence of natural numbers is introduced, ending with the number 0 (the
     * number 0 itself is not included in the sequence, but serves as a sign of its
     * termination)).
     */
/*
    public static void DetermineValueOfSecondLargestElement() {

        int max = Integer.MIN_VALUE;
        int second = 0;
        int num;
        do {
            num = sc.nextInt();
            if (num > max) {
                second = max;
                max = num;
            } else if (num > second && num != max) {
                second = num;
            }
        } while (num != 0);
        System.out.println(second);
    }*/








    /**
     * 16.Write a program that generates a random number and asks the user
     * to guess what the number is. If the user’s guess is higher than the
     * random number, the program should display Too high, try again. If the
     * user’s guess is lower than the random number, the program should
     * display Too low, try again. If you find the number print Yes, you
     * guessed the number.The program should use a loop that repeats
     * until the user correctly guesses the random number.
     */
/*
    public  void  randMaxOrMin(int num) {
        System.out.println(num);
        int answer;

        answer = rand.nextInt(100);
        System.out.println(answer);
        while (num < answer) {
            System.out.println("Too high, try again");
            break;
        }


        while (num > answer) {
            System.out.println("Too low, try again");
            break;
        }
    }
*/
    /* public static void printRandomIsLowerOrHigher(){

        Random random = new Random();

        int secret = random.nextInt(100);

        System.out.println("Of number is 0,99:");
        System.out.println("try gues my number: ");

        int n = sc.nextInt();

        int count = 0;

        while (n!=secret){

            count++;

            if (n<secret){

                System.out.println("Is lower num: ");

            }else {System.out.println("My num is higher:");}

            n = sc.nextInt();
        }
        System.out.println("Super, my num is " + count);



    }*/


    /**
     * 17. Write a Java Program to Compute the Sum of Digits in a given
     * Integer.
     */
/*
    public static int sumOfDigits(int num) {
        int i = 0;
        int sum = 0;
        while (num > 0) {
            i = num % 10;
            sum = sum + i;
            num = num/ 10;
        }
        return sum;
    }*/
}











