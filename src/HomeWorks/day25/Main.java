package HomeWorks.day25;


import java.util.Scanner;

import static HomeWorks.day25.day25.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sumOfArray(new int[]{7, 5, 8, 4, 9}, 4));
        System.out.println("Factorial of  n: " + factorial(n));
        System.out.println("Fibonachi of  n: " + fibonachi(100));
        System.out.println(modeOfBlocks(2));
        System.out.println(sumOfDigits(524));
        System.out.println(countOf7Digit(5777874));
        System.out.println(numOfLowCase("xgxdexsedx", 9));
        System.out.println(removeChar(new StringBuilder("bxxdgxhsjdxshsx"), 0));
        System.out.println(reverseChar("hgfdg", 4));
        System.out.println(theEndOfString("xkdxlsmsldxx", 11));
        System.out.println(singleChar("aaabbbcccdd", 0));
        System.out.println(isprime(37, 9));
        System.out.println(largestDigit("1475", 3, '0'));
        System.out.println(numOfDigits("d1d4fd75dg4g5", 0));
        System.out.println(astericsChar("dnsnfsm", 0));
        System.out.println(brackets("LItBeoFLcSGBOFQxMHoIuDDWcqcVgkcRoAeocXO", 0));
        System.out.println(mirror("(abc(def(g", 0));
        System.out.println(identicalLetter("cabgbak", 0, 6));

    }
}
