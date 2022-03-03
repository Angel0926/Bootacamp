package HomeWorks.Day9;

import java.util.Scanner;

public class Day9 {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Day9 init = new Day9();
        //init.compareStr();
        //System.out.println(init.strComp());
        //init.tern();
        //init.mathMax();
        //init.tern();
        //init.max();
        //init.mathAbs();
        // init.question();
        // init.vowelOrConst();
        //init.numKeys();
       // init.evenOdd();
        //init.operator();
        //init.week();
        //init.grade();
    }
/**
 * Write a java program, which has 2 String variables, initialize them from console.
 * - - Compare them with == assignment
 * - - Compare them with equals to
 */

/*
    public void compareStr() {
        System.out.println("Please input text1");
        String text1 = scanner.nextLine();
        System.out.println("Please input text2");
        String text2 = scanner.nextLine();
        if (text1 == text2) {
            System.out.println(text1 == text2);
        } else {
            System.out.println(false);
        }
        if (text1.equals(text2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
*/

    /**
     * Write a java program, which has 2 String variables, initialize them, One with literal,
     * another using new keyword
     * - - Compare them with == assignment
     * - - Compare them with equals to
     */
/*
    public boolean strComp(){
        String text1 = "java";
        String text2=new String("java");
        boolean str=false;
        if(text1 == text2){
            str=true;
            return str;
        }
        else return str;
    }
*/

    /**
     * Input integer value from console, if value greater than 0 print n positive, else
     * print negative.
     */
    /*
public void tern(){

    System.out.println("Please input number");
    int num  = scanner.nextInt();
    /*String pozNeg=num>0? "num is positive": "negative";
    System.out.println(pozNeg);
    String result = num>0?"Positive":num==0?"0":"Negative";
            System.out.println(result);
}
*/
    /**
     * Using ternary operator`
     * - - achieve Math.max(a,b) function
     * - - achieve Math.abs(a) function
     */
    /*
public void mathMax(){
    System.out.println("Please input a");
    int a = scanner.nextInt();
    System.out.println("Please input b");
    int b  = scanner.nextInt();
    int max= a>b?a:b;
    System.out.println(max);

}*/
      /*
public void mathAbs(){
    System.out.println("Please input a");
    int a = scanner.nextInt();
    int abs=a>=0? a:-a;
    System.out.println(abs);
}*/

    /**
     * Using ternary operator check if the given String
     * - - is a null so return -1
     * - - if given String is “ ” return 0
     * - - else return 1
     */
/*
    public  void tern(){
        System.out.println("Please input a");
        String a = scanner.nextLine();
        int tern= a.equals("null")? -1:a.equals(" ")?0:1;
        System.out.println(tern);
    }
*/
    /**
     * Write a java program to find maximum from a given 3 integer numbers using ternary
     * operator.Input numbers from console
     */
/*
    public void max(){
        System.out.println("Please input a");
        int a = scanner.nextInt();
        System.out.println("Please input b");
        int b  = scanner.nextInt();
        System.out.println("Please input c");
        int c  = scanner.nextInt();
        int max= (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println(max);

    }*/

    /**
     * 9.Write a Java program that allows the user to choose the correct answer of a question.If
     * he choose correct answer Print “Congratulation”,
     * in case of illegal choice print “Invalide choice”.
     * Example`
     * What is the correct way to declare a variable to store an integer value in Java?
     * a. int 1x=10;
     * b. int x=10;
     * c. float x=10.0f;
     * d. string x=10;;
     * Enter your choice: c
     */
/*
    public  void question(){
        System.out.println("What\tis\tthe\tcorrect\tcharacter\tfor\tterminating\ta\tstatement\tin\tJava?\n" +
                "1.\t A\tcolon\t(:)\n" +
                "2.\t An\tend-of-line\tcharacter\n" +
                "3.\t A\ttab\tcharacter\n" +
                "4.\t A\tsemicolon(;)");
        System.out.println("\nPlease input answer's number");
        int i= scanner.nextInt();
        switch (i){
            case 1:
            case 2:
            case 3:{
                    System.out.println("Invalide choice");
                break;}
            case 4:{
                    System.out.println("Congratulation");
                break;
            }
            default:
                System.out.println("Invalid answer");
        }
    }
*/
    /**
     * Write Java Program to check Vowel or Consonant using Switch Case.
     * Example`
     *
     * Enter a character :
     * A
     * A is a Vowel
     */
/*
    public void vowelOrConst() {
        System.out.println("input a character ");
        char ch = scanner.next().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }
    }*/

    /**
     * If the user pressed number keys( from 0 to 9), the program will tell the number that is
     * pressed, otherwise, the program will show Not allowed;
     */
/*
    public void numKeys() {
        System.out.println("input a number ");
        int n = scanner.nextInt();

        switch (n) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("pressed number: "+n);
                break;
            default:
                System.out.println(" Not allowed");

        }
    }*/

    /**
     * Using switch statements determine if the number is even or odd.
     * Input number from console
     */
/*
    public void evenOdd() {
        System.out.println("input a number ");
        int n = scanner.nextInt();
        if(n!=0){
            switch (n%2){
                case 0: {
                    System.out.println("pressed number is even");
                    break;
                }
                case 1: {
                    System.out.println("pressed number is odd");
                    break;
                }
                default:{
                    System.out.println("invalid number");
                    break;
            }
        }
    }else System.out.println("please input number other 0");}
*/

    /**
     *Program to make a calculator using switch case in Java
     * In this Program we are making a simple calculator that performs addition, subtraction, multiplication and
     * division based on the user input. The program takes the value of both the numbers (entered by user) and
     * then user is asked to enter the operation (+, -, * and /), based on the input program performs the selected
     * operation on the entered numbers using switch case.
     * Example`
     * Enter first number:40
     * Enter second number:4
     * Enter an operator (+, -, *, /): /
     * 40.0 / 4.0: 10.0
     *
     * /* If user enters any other operator or char apart from
     * * +, -, * and /, then display an error message to user
     */
/*
    public void operator() {
        System.out.println("enter first number");
        int first = scanner.nextInt();
        System.out.println("enter second number");
        int second = scanner.nextInt();
        System.out.println("enter an operator(+,-,*,/");
       char op=scanner.next().charAt(0);
        switch (op){
            case '+':{
                System.out.println(first +second);
                break;}
            case '-':{
                System.out.println(first-second);
                break;}
            case '*':{
                System.out.println(first*second);
                break;}
            case '/':{
            if(second!=0){
                System.out.println(first/second);
                break;}
            else System.out.println("second number can not be 0"); break;}
            default:
                System.out.println("Invalid operation");
        }
}*/


    /**
     * Given the String variable day holding the name of the weekday Sunday, Monday, etc., set an int variable to 1, 2,
     * etc.
     */
/*
    public void week() {
        System.out.print("Input number: ");
        int day = scanner.nextInt();
        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
        }
        System.out.println(dayName);
    }*/

    /**
     * The program will read three types of scores(quiz, mid-term, and final scores) and determine the
     * grade based on the following rules:
     * -if the average score = 80% =grade=A
     * -if the average score;= 60% and ;80% = grade=B
     * -if the average score=40% and  60% =grade=C
     * -else =grade=F
     * <p>
     * Input`
     * Quiz score: 80
     * Mid-term score: 68
     * Final score: 90
     * Output`
     * Your grade is B.
     * Use switch statement
     */
/*
    public void grade() {
        System.out.print("Quiz score: ");
        int qs = scanner.nextInt();
        System.out.print("Mid-term: ");
        int mt = scanner.nextInt();
        System.out.print("Final score: ");
        int fs = scanner.nextInt();
        double avg = (qs + mt + fs) / 3;
        int x = (int) avg / 10;
        switch (x) {
            case 10:
            case 9: {
                System.out.println("Your grade is A");
                break;
            }
            case 8:
            case 7: {
                System.out.println("Your grade is B");
                break;
            }
        case 6:
        case 5: {
                System.out.println("Your grade is C");
                break;
            }
        default: {
            System.out.println("Your grade is F");
            break;
        }
    }
}*/

            }

