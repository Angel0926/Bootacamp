package HomeWorks;

import java.util.Scanner;

public class Recursia {
    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static int fibonachi(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fibonachi(n - 1) + fibonachi(n - 2);
        }
    }

 static boolean checkPalindrome(String str){
            if (str.length() == 0 || str.length() == 1) {
                return true;
            } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
                return checkPalindrome(str.substring(1, str.length() - 1));
            }
            return false;
        }

    /*{
        if (s == e)
            return true;
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
        if (s < e + 1)
            return checkPalindrome(str, s + 1, e - 1);
        return true;
    }
    static boolean isPalindrome(String str)
    {
        int n = str.length();
        if (n == 0)
            return true;
        return checkPalindrome(str, 0, n - 1);
    }

        String a;
        StringBuilder b = new StringBuilder();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the string");
        a = in.nextLine();
        int length = a.length();
        for (int i = length - 1; i >= 0; i--)
            b.append(a.charAt(i));
        if(a.equals(b.toString()))
           return  true;
        else
            return false;
    }*/


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Factorial of  n: " + factorial(n));
        System.out.println("Fibonachi of  n: " + fibonachi(n));
        System.out.println(checkPalindrome("sdhjhds"));
    }


}


