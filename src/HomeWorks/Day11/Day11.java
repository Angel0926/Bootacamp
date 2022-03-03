package HomeWorks.Day11;

import java.util.Scanner;

public class Day11 {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Day11 d = new Day11();

    }

    /**
     * 1. Write a java program to print all even numbers from a given
     * range, from a to b. Input a and b from console.Example`
     * Input ` 2 Output ` 2 4
     * 5
     */
/*
    public static void fromAtoB(int a, int b) {
        for (int i = a; i < b; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = b; i < a; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
*/

    /**
     * 2.Print all numbers on the segment from a to b that give the
     * remainder of c when divided by d. If such numbers do not exist,
     * then you do not need to display anything.
     * Example ` Input` Output`
     * a 2 2 4
     * b 5
     * c 0
     * d 2
     */
/*
    public static void cDivd(int a, int b, int c, int d) {
        for (int i = a; i < b; i++) {
            if (i % d == c) {
                System.out.println(i);
            }
        }
        for (int i = b; i < a; i++) {
            if (i % d == c) {
                System.out.println(i);
            }
        }
    }
*/

    /**
     * 3.Integers a and b are entered. It is guaranteed that a does not
     * exceed b.
     * Print all numbers on the segment from a to b that are exact
     * squares. If there are no such numbers, then you do not need to
     * display anything.
     * Example`
     * <p>
     * Input` 2 Output ` 4
     * 8
     */


 /*   public static void square(int a, int b) {

        for (int i = 0; i <= b; i++) {
            if ((i*i) < b && (i*i)>a) {
                System.out.println(i*i);

            }
        }*/
/*
        for (int i = a; i <= b; i++) {
            if (Math.sqrt(i)==(int)Math.sqrt(i)) {
                System.out.println(i + " ");
            }
        }*/
/*if (a > b) {
    System.out.println("a can't be > b");
    return;
}
for (int i = a; i <= b; i++) {
    for (int j = 1; j < i; j++) {
        if (j == (double) i / j) {
            System.out.print(i+" ");
        }
    }
}*/

    }


    /**
     * 4.Enters 2 integer numbers : x and d from console
     * Count and print one number - how many times the digit d occurs in
     * the representation of a natural number x.
     */

    /*
    public static void digitD(int x, int d) {
        int count = 0;
        for (int i = x; i != 0; i = i / 10) {
            if (i % 10 == d) {
                count++;
            }
        }
        System.out.println(count);
    }
*/

    /**
     * 5
     * Given an integer number x
     * Print the number consisting of the digits of the given number x in reverse
     * order. You do not need to output leading zeros.
     */

    /*
    public static void reverse(int x) {
        int rev = 0;
        for (; x != 0; ) {
            rev = rev * 10;
            rev = rev + x % 10;
            x = x / 10;
        }
        System.out.println(rev);
    }
*/

    /**
     * 6.Given an integer number x
     * Find the smallest natural divisor of x other than 1.
     * Example`
     * Input` 6 Output` 2
     */

    /*
    public static void smallestDiv(int n) {
        if (n % 2 == 0) {
            System.out.println(2);
        }

        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                System.out.println(i);
        }
    }
*/

    /**
     * 7.Given an integer number x
     * Print all natural divisors of the number x in ascending order (including 1
     * and the number itself).
     * Example` Input ` 32 Output ` 1 2 4 8 16 32
     */

    /*

    public static void printDivisor(int n) {
        for (int i = 1; i <= n/2; i++)
            if (n % i == 0)
                System.out.print(i + " ");
    }
    System.out.print(n);
    }

*/

    /**
     * 8
     * Given an integer x
     * Count the number of natural divisors of x (including 1 and the number
     * itself; x≤2 ∗ 109).
     */

/*
    public static int naturalDivisors(int x) {
        int count = 2;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) {
                count += 2;
                if (x / i == i) {
                    count--;
                }
            }
        }
        return count;
    }
*/

        /**
         * 9
         * 9.Calculate the sum of the given 10 natural numbers.
         * Input integers from console
         */

    /*
    public void sumNaturalNumber() {
        int sum = 0;
        for (int i = 0; i < 10; i += 1) {
            System.out.println("please input 10 numbers");
            sum += scanner.nextInt();
        }
        System.out.println("Numbers Sum:"sum);
    }*/


        /**
         * 10. Convert a natural number from binary to decimal (no more than 10
         * digits in a binary number).
         * Example` Input ` 1001 Output` 9
         * 111 Output` 7
         */
/*
        public static int binaryToDecimal ( int bin){

            int dec = 0;
            int pow = 1;
            for (int num = bin; num != 0; num = num / 10) {
                dec += (pow * num % 10);
                pow <<= 1;
            }
            return dec;
        }
*/

        /**11
         * 11.Enter the number N, followed by N integers.
         *
         * - Count how many zeros, positive numbers, negative numbers
         * among the given N numbers.
         *
         * - It is necessary to print first the number of zeros, then the number
         * of positive and negative numbers.
         */

    /**
     * Task 11
     * 11.Enter the number N, followed by N integers.
     * <p>
     * - Count how many zeros, positive numbers, negative numbers
     * among the given N numbers.
     * <p>
     * - It is necessary to print first the number of zeros, then the number
     * of positive and negative numbers.
     */
/*
    public void task11(int n) {
        int zero = 0;
        int positive = 0;
        int negative = 0;
        for (int i = 1; i <= n; i++) {
            int x = scanner.nextInt();
            if (x < 0) {
                negative++;
            } else if (x > 0) {
                positive++;
            } else {
                zero++;
            }
        }
        System.out.println("zero - " + zero + " , positive - " + positive + " , negative - " + negative);
    }

*/

/**12
 * &quot;GNCHE-1&quot; is a complex electronic device that issues every second
 * the next sequence number 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5 ... Due to the high
 * cost of electronic components, you have been instructed to develop an
 * emulator for these devices.
 * The number of seconds (from 1 to 1,000,000) is given that the generator
 * works after being turned on.
 * Example` Input` Output`
 * 2 1 2
 * 5 1 2 2 3 3
 * 7 1 2 2 3 3 3 4
 */

/*
public static void generateSequence(int second){
    int count = 0;
    for (int i = 1; i <=second && count<=second; i++) {
        for (int j = 0; j < i && count<second; j++) {
            System.out.println(i + " ");
            count++;
        }

    }
}*/


        /**
         * 13  Write a Java program by using two for loops to produce the output
         * shown below:
         * 1.Input N natural number, print picture like below in size N*N
         */

    /*
    public static void pic(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
*/

        /**
         * 14.Write a program that prompts the user for the size (a non-negative
         * integer in int); and prints the following checkerboard pattern.
         */

/*
    public static void checkboard(int n) {
        boolean odd = false;

        for (int y = 1; y < n; y++) {
            for (int x = 0; x < n; x++) {
                if (odd) {
                    System.out.print(" #");
                } else {
                    System.out.print("# ");
                }
            }
            if (odd) {
                odd = false;
            } else {
                odd = true;
            }

            System.out.println("");
        }
    }*/
/*
    public static void  printCheckerboardPattern(int n){
        String row=" ";
        for(int i=0; i<n; i++){
            row+= "#";
        }
        for (int i = 0; i < n; i++) {
            if((i&i)==1){
                System.out.println(" ");
            }
            System.out.println(row);
        }
    }*/

        /**
         * 15
         * Write a program that prompts user for the size (a positive integer in
         * int); and prints the multiplication table as shown:
         * * | 1 2 3 4 5 6 7 8 9 10
         * --------------------------------------------
         * 1 | 1 2 3 4 5 6 7 8 9 10
         * 2 | 2 4 6 8 10 12 14 16 18 20
         * 3 | 3 6 9 12 15 18 21 24 27 30
         * 4 | 4 8 12 16 20 24 28 32 36 40
         * 5 | 5 10 15 20 25 30 35 40 45 50
         * 6 | 6 12 18 24 30 36 42 48 54 60
         * 7 | 7 14 21 28 35 42 49 56 63 70
         * 8 | 8 16 24 32 40 48 56 64 72 80
         * 9 | 9 18 27 36 45 54 63 72 81 90
         * 10 | 10 20 30 40 50 60 70 80 90 100
         */


   /*     public void table () {
            int size = scanner.nextInt();
            int n = 1;
            System.out.println(" * |  1  2  3    4    5     6    7    8    9    10 \n --------------------------");
            for (int i = 1; i <= size; i++) {
                n = i;
                System.out.print("  " + n + " | ");
                for (int j = 1; j <= size; j++) {
                    System.out.print((j * i) + "   ");
                }
                System.out.println();

            }
        }*/

        /*
        public void task15(int n) {
            for (int i = 0; i <= n; i++) {
                if (i == 0) {
                    System.out.print(" * | ");
                } else {
                    System.out.print(i + "   ");
                }
            }

            System.out.print("\n____________________________________________\n");
            for (int i = 1; i <= n; i++) {
                if (i < 10) {
                    System.out.print(" " + i + " |");
                } else {
                    System.out.print(i + " |");
                }
                for (int j = 1; j <= n; j++) {
                    if (i * j < 10) {
                        System.out.printf("%2d  ", (i * j));
                    } else {
                        System.out.printf(" %2d ", (i * j));
                    }
                }
                System.out.println();
            }
        }
*/
        /**
         * 16
         * Write 4 programs (X = A, B, C, D) that prompts user for the
         * size (a non-negative integer in int); and prints each of the patterns as
         * shown:
         * Enter the size: 4
         * * **** **** *
         * ** *** *** **
         * *** ** ** ***
         * **** * * ****
         * a) b) c) d)
         */

/*
    public static void figure1() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void figure2() {
        for (int i = 0; i < 4; i++) {
            for (int j = i; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    public static void figure3() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void figure4() {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/


