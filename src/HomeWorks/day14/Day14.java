package HomeWorks.day14;

public class Day14 {


    public static void main(String[] args) {
    }

    /**
     * 1.Write a function which returns the length of a given String.
     */
    public static int stringLenght(String text) {
        return text.length();
    }

    /**
     * 2.Write a function which returns a character of a given index,from a given String. Pass as a
     * parameters String str, int index
     */
    public static char characterOfIndex(String text, int n) {
        return text.charAt(n);
    }

    /**
     *
     * 3.Write a function which checks if the given String contains a given character.Pass as parameters
     * String str, char ch
     */

    public static void containsChar(String text, char m) {
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch == m) {
                System.out.println(m);
            }
        }
    }

    /**
     * 4.Write a function which returns the count of vowels of a given String
     * - - write also an overloaded function which returns count of constants.
     */


    static void vowelsOfString(String str) {
        int vowels = 0;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u')
                    vowels++;
            }

        }
        System.out.println("Vowels: " + vowels);
    }


    /**
     * 5.Write a function called reverseString, which prompts the user for a String, and prints the
     * reverse of the String by extracting and processing each character. The output shall look like:
     * Enter a String: abcdef
     * The reverse of the String &quot;abcdef&quot; is &quot;fedcba&quot;
     */

    public static void reverseString(String text) {
StringBuilder s=new StringBuilder(text);
        for (int i = text.length() - 1; i >= 0; i--) {
            char ch = text.charAt(i);
            System.out.print(ch);
        }
    }

    /**
     * 6.Write a program called countVowelsDigits, which get as parameter a String, counts the
     * number of vowels (a, e, i, o, u, A, E, I, O, U) and digits (0-9) contained in the string, and prints
     * the counts and the percentages (rounded to 2 decimal places). For example`
     */

    static void percentages(String str) {
        double lenght = str.length();
        double vowels = 0;
        double digits = 0;
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') ||
                    (ch >= 'A' && ch <= 'Z')) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                        ch == 'o' || ch == 'u')
                    vowels++;
            }
            if (ch >= '0' && ch <= '9') {
                digits++;

            }
        }
        double f = (vowels / lenght) * 100;
        double k = (digits / lenght) * 100;
        System.out.printf("%.2f", f);
        System.out.printf("\n" + "%.2f", k);
    }
    public static boolean isVowel(char ch) {
        return ("aeoiu".indexOf(Character.toLowerCase(ch)) != -1);
    }
    /**
     * 7.Caesar&#39;s Code is one of the simplest encryption techniques. Each letter in the plaintext is
     * replaced by a letter with some fixed number of positions (n) down the alphabet cyclically. In this
     * exercise, we shall pick n=3. That is, &#39;A&#39; is replaced by &#39;D&#39;, &#39;B&#39; by &#39;E&#39;, &#39;C&#39; by &#39;F&#39;, ..., &#39;X&#39; by
     * &#39;A&#39;, ..., &#39;Z&#39; by &#39;C&#39;.
     */

    static void caesar(String text, int n) {
        String str = text.toUpperCase();
        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            ch = ch + 3;
            if (ch + 3 > 'z' || ch + 3 > 'Z') {
                ch = ch - 26;
            }

            System.out.print((char) ch);
        }
    }


    /**
     * 8.Write a function to check if the passed String palindrome or not
     * Print “xxx” is|is not a Palindrome.
     * A word that reads the same backward as forward is called a palindrome, e.g., &quot;mom&quot;, &quot;dad&quot;,
     * &quot;racecar&quot;, &quot;madam&quot;, and &quot;Radar&quot; (case-insensitive).
     */

    static boolean isPalindrome(String text) {
        int i = 0, j = text.length() - 1;
        while (i < j) {
            if (text.charAt(i) != text.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }


    /**
     * 9.The binary number system uses 2 symbols, 0 and 1. Write a function called checkBinStr to
     * verify a binary string. The program shall prompt the user for a binary string; and decide if the input
     * string is a valid binary string.
     */

    static boolean checkString(String s) {
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if (ch == '0' || ch == '1') {
                return true;
            }
        }
        return false;
    }

    /**
     * 10.The hexadecimal (hex) number system uses 16 symbols, 0-9 and A-F (or a-f). Write a
     * program to verify a hex string. The function gets a hex string; and decides if the input string is a
     * valid hex string. For examples,
     */

    static boolean hexaDecimal(String s) {
        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i);
            if ((ch >= '0' && ch <= '9') || (ch >= 'A' && ch <= 'F')) {
                return true;
            }
        }
        return false;
    }
    public static boolean isLetter(char ch) {
        char temp = Character.toLowerCase(ch);

        return (temp >= 'a' && temp <= 'z');
    }

    /**
     * 11.Write a function called bin2Dec to convert an input binary string into its equivalent decimal
     * number. Your output shall look like:
     */


    static int binaryToDecimal(int n) {
        int num = n;
        int dec = 0;
        int base = 1;
        int temp = num;
        while (temp > 0) {
            int last = temp % 10;
            temp = temp / 10;
            dec += last * base;
            base = base << 1;
        }
        return dec;
    }
    public static boolean isHexadecimal(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!isHexadecimal(str.charAt(i))) {
                return false;
            }
        }

        return true;
    }
    public static boolean isHexadecimal(char ch) {
        char temp = Character.toLowerCase(ch);
        return (isDigit(temp) ||
                (temp >= 'a' && temp <= 'f'));
    }
    public static boolean isBinary(String str) {
        for (char ch : str.toCharArray()) {
            if (ch != '0' && ch != '1') {
                return false;
            }
        }

        return true;
    }

    public static boolean isDigit(char ch) {
        return (ch >= '0' && ch <= '9');
    }
    /**
     * 12.Write a function that counts duplicate characters from a given string.
     */

    static void removeDuplicate(String str) {
        int index;
        int line = 0;
        for (int i = 0; i < str.length(); i++) {
            index = 0;
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    index++;
                }
            }
            if (index > 2) {
                line++;

            }
        }
        System.out.println(line);
    }
    public static int countDuplicates(String str) {
        int res = 0;
        int dupCount;
        int len = str.length();
        for (int i = 0; i < len - 1; i++) {
            dupCount = 0;
            for (int j = i + 1; j < len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    dupCount++;
                }
            }

            if (dupCount == 1) {
                res++;
            }
        }

        return res;
    }
    /**
     * 13.Write a function that returns the first non-repeated character from a given string.
     */

    static void nonRepeat(String str) {
        int index;
        for (int i = 0; i < str.length(); i++) {
            index = 0;
            for (int j = str.length() - 1; j >= 0; j--) {
                if (str.charAt(i) == str.charAt(j)) {
                    index++;
                }
            }
            if (index == 1) {
                System.out.println(str.charAt(i));

            }
        }
    }

    public static char firstUniqueChar(String str) {
        int len = str.length();
        char ch;
        boolean hasDuplicate;
        for (int i = 0; i < len - 1; i++) {
            hasDuplicate = false;
            for (int j = i + 1; j < len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    hasDuplicate = true;
                    break;
                }
            }

            if (!hasDuplicate) {
                return str.charAt(i);
            }
        }

        return ' ';
    }


    /**
     * 14.Write a function that counts occurrences of a certain character in a given string.
     * Pass as a argument (String str, char ch)
     */

    public static int count(String s, char c) {
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                res++;
        }
        return res;
    }
}
