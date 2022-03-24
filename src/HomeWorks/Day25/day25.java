package HomeWorks.Day25;

public class day25 {

    /**
     * 1.Write a recursive function
     * - to find the sum of a given array.
     * - - to find the factorial of a given natural Number.
     */


    public static int sumOfArray(int[] arr, int size) {

        if (size == 0) {
            return arr[0];
        }
        return (arr[size] + sumOfArray(arr, size - 1));
    }

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }


    /**
     * 2.Write a fib(int) function which returns n-th fibonacci number.
     */

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

    /**
     * 3.We have triangles made of blocks. The topmost row has 1 block, the
     * next
     * row down has 2 blocks, the next row has 3 blocks, and so on. Compute
     * recursively (no loops or multiplication) the total number of blocks in
     * such a triangle with the given number of rows.
     * Example` triangle(0) -&gt; 0
     * triangle(1) -&gt; 1
     * triangle(2) -&gt; 3
     */

    public static int modeOfBlocks(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return n + modeOfBlocks(n - 1);
    }

    /**
     * 4.Given a non-negative int n, return the sum of its digits recursively (no
     * loops).
     */

    public static int sumOfDigits(int n) {
        if (n > 0 && n < 10) {
            return n;
        }
        return n % 10 + sumOfDigits(n / 10);
    }


    /**
     * 5.Given a non-negative int n, return the count of the occurrences of 7 as
     * a digit, so for example 717 yields 2.
     */

    public static int countOf7Digit(int n) {
        if (n == 0) {
            return 0;
        }

        if (n % 10 == 7) {
            return 1 + countOf7Digit(n / 10);
        }
        return countOf7Digit(n / 10);
    }


    /**
     * 6.Given a string, compute recursively (no loops) the number of
     * lowercase &#39;x&#39; chars in the string.
     * Example`
     * countX(&quot;xxhixx&quot;) → 4
     * countX(&quot;xhixhix&quot;) → 3
     * countX(&quot;hi&quot;) → 0
     */

    public static int numOfLowCase(String text, int size) {
        if (size < 0) {
            return 0;
        }
        if (text.charAt(size) == 'x') {
            return 1 + numOfLowCase(text, size - 1);
        }
        return numOfLowCase(text, size - 1);
    }

    /**
     * 7.Given a string, compute recursively a new string where all the &#39;x&#39; chars
     * have been removed.
     * Use` str.substring()
     */

    public static StringBuilder removeChar(StringBuilder text, int size) {
        StringBuilder s = new StringBuilder(text);
        if (size < 0) {
            return s;
        }
        if (text.charAt(size) == 'x') {
            s.deleteCharAt(size);
        }
        return removeChar(s, size - 1);
    }

    /**
     * 8.Write recursive function that reverses the given String.
     * Example` HELLO -&gt; OLLEH
     */

    public static String reverseChar(String text, int size) {
        if (size < 0) {
            return "";
        }

        return text.charAt(size) + reverseChar(text, size - 1);
    }

    /**
     * 9.Given a string, compute recursively a new string where all the
     * lowercase &#39;x&#39; chars have been moved to the end of the string.
     * EXample`
     * endX(&quot;xxre&quot;) → &quot;rexx&quot;
     * endX(&quot;xxhixx&quot;) → &quot;hixxxx&quot;
     *
     * @return
     */

    public static String theEndOfString(String text, int size) {
        if (size < 0) {
            return "";
        }
        if (text.charAt(size) != 'x') {
            return text.charAt(size) + theEndOfString(text, size - 1);
        }
        return theEndOfString(text, size - 1) + text.charAt(size);

    }

    /**
     * 10.Given a string, return recursively a &quot;cleaned&quot; string where adjacent
     * chars that are the same have been reduced to a single char. So &quot;yyzzza&quot;
     * yields &quot;yza&quot;.
     * EXample`
     * stringClean(&quot;yyzzza&quot;) → &quot;yza&quot;
     * stringClean(&quot;abbbcdd&quot;) → &quot;abcd&quot;
     *
     * @return
     */

    public static String singleChar(String text, int size) {
        if (size == text.length() - 1) {
            return String.valueOf(text.charAt(size));
        }
        if (text.charAt(size) != text.charAt(size + 1)) {
            return text.charAt(size) + singleChar(text, size + 1);

        }
        return singleChar(text, size + 1);
    }

    /**
     * 11.Write a function to determine if a number is prime or not.
     *
     * @return
     */

    public static boolean isprime(int num, int div) {
        if (div == 1) {
            return true;
        }
        if (num % div != 0) {
            return isprime(num, div - 1);
        }
        return false;
    }

    /**
     * 12.Given a string containing only decimal digits. Find and display the
     * largest digit.
     */


    public static char largestDigit(String text, int size, char large) {
        if (text.charAt(size) > large) {
            large = text.charAt(size);
        }
        if (size == 0) {
            return large;
        }
        return largestDigit(text, size - 1, large);
    }

    /**
     * 13.You are given a string containing numbers and English letters
     * (uppercase and lowercase). Find and display the number of digits.
     */

    public static String numOfDigits(String text, int size) {
        if (size == text.length()) {
            return " ";
        }
        if (text.charAt(size) >= '0' && text.charAt(size) <= '9') {
            return text.charAt(size) + numOfDigits(text, size + 1);
        }

        return numOfDigits(text, size + 1);
    }

    /**
     * 14.Given a string containing only English letters (uppercase and
     * lowercase). Add the ‘*’ (asterisk) character between letters (you don’t
     * need to add ‘*’ before the first letter and after the last).
     * Example ` LItBeoFLcSGBOFQxMHoIuDDWcqcVgkcRoAeocXO
     * L*I*t*B*e*o*F*L*c*S*G*B*O*F*Q*x*M*H*o*I*u*D*D*W*c*q*c*V*g*k*c*
     * R*o*A*e*o*c*X*O
     **/

    public static String astericsChar(String text, int size) {
        if (size == text.length() - 1) {
            return text.charAt(size) + " ";
        }
        return text.charAt(size) + "*" + astericsChar(text, size + 1);
    }

    /**
     * 15.Given a string containing only English letters (uppercase and
     * lowercase). Add opening and closing parentheses according to the
     * following pattern: &quot;example&quot; -&gt; &quot;(e (x (a (m) p) l) e)&quot; (Added opening
     * parentheses to the middle, closing parentheses after the middle. In case
     * the string length is even there must be 2 characters in the brackets in the
     * middle. (&quot;card -&gt; (c (ar) d)&quot; but not &quot;(c (a () r) d)&quot;).
     * Example`
     * LItBeoFLcSGBOFQxMHoIuDDWcqcVgkcRoAeocXO
     * (L(I(t(B(e(o(F(L(c(S(G(B(O(F(Q(x(M(H(o(I)u)D)D)W)c)q)
     * c)V)g)k)c)R)o)A)e)o)c)X)O)
     */


    public static String brackets(String text, int size) {
        if (size == text.length() - 1) {
            return text.charAt(size) + "";

        }
        if (size < text.length() / 2) {
            return text.charAt(size) + "(" + brackets(text, size + 1);
        }
        return text.charAt(size) + ")" + brackets(text, size + 1);
    }


    /**
     * *
     * 16.Given a string containing only English letters (uppercase and
     * lowercase) and opening brackets. Form a new line by adding a
     * &quot;mirrored&quot; line with closing brackets to the right.
     * &quot;(abc (def (g &quot; -&gt; &quot;(abc (def (gg) fed) cba)&quot;
     */

    public static String mirror(String text, int size) {

        if (size == text.length()) {
            return text;
        }
        if (text.charAt(size) == '(') {
            return mirror(text, size + 1) + ")";
        }

        return mirror(text, size + 1) + "" + text.charAt(size);
    }


    /**
     * 17 .Given a string containing only small English letters. Form a new line
     * by &quot;cutting&quot; identical letters located at symmetrical places (that is, if there
     * are 2 identical letters at the same distance from the center of the line,
     * then they must be removed from the line). If the length of the string is
     * odd, then the middle letter does not need to be shortened.
     */
    public static String identicalLetter(String text, int size, int start) {
        if (size == 0) {
            return text.charAt(size) + "";
        }
        if (text.charAt(size) != text.charAt(start) || size == start) {
            return identicalLetter(text, size - 1, start + 1) + text.charAt(size);
        }
        return identicalLetter(text, size - 1, start + 1);
    }


}

















/*
///////////////////////////////////////////////
    static boolean checkPalindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        } else if (str.charAt(0) == str.charAt(str.length() - 1)) {
            return checkPalindrome(str.substring(1, str.length() - 1));
        }
        return false;
    }
//////////////////////////////
        if (s == e)
            return true;
        if ((str.charAt(s)) != (str.charAt(e)))
            return false;
        if (s < e + 1)
            return checkPalindrome(str, s + 1, e - 1);
        return true;
    }
    ///////////////////////////////////////
    static boolean isPalindrome(String str)
    {
        int n = str.length();
        if (n == 0)
            return true;
        return checkPalindrome(str, 0, n - 1);
    }

    ///////////////////////////////////////////

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



