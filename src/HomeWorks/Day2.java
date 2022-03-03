package HomeWorks;

import java.util.Random;
import java.util.Scanner;

public class Day2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

/*2.  System.out.println("Please input minutes");
        int minutes = scanner.nextInt();
        int hours;
        hours = minutes %60;
        System.out.println("Count of hours-"+hours + "\n" +"Count of minutes-"+  minutes);
*/

/* 3
        if(i%2==0)
               System.out.println(i+1);
                int a=1+3+5+7;
        int b=2+4+6+8;
        System.out.println(a + " " + b);

*/

/*3.1   int sumOdd = 0;int countOdd = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 2 == 0) {
                sumOdd += i;
                countOdd++;
            }
            if(countOdd == 4)break;}
            System.out.println(sumOdd);
*/

/*3.2
     int sumEven = 0;int countEven = 0;
        for (int i = 1; i < 1000; i++) {

            if (i % 2 != 0) {
                sumEven += i;
                countEven++;
            }if(countEven == 4)break;}
        System.out.println(sumEven);
*/

/*4.
        System.out.println("Please input first number");
        int num1 = scanner.nextInt();
        System.out.println("Please input second number");
        int num2= scanner.nextInt();
        System.out.println("product of two numbers-"+ " "+ (num1*num2));
*/


/*5      System.out.println("Please input first number");
        int num1 = scanner.nextInt();
        System.out.println("Please input second number");
        int num2= scanner.nextInt();
        System.out.println("Please input third number");
        int num3= scanner.nextInt();
        double avg=(num1+num2+num3)/3;
        System.out.println("The average of 3 numbers " + avg);
*/


 /*6.1   System.out.println("Please input triangle's base");
        double base = scanner.nextDouble();
        System.out.println("Please input triangle's height ");
        double height = scanner.nextDouble();
        double area =base * height* 0.5;
        System.out.println("Area of  right angled triangle " + area +  " square units");
*/

/*6.2    System.out.println("Please input square's side");
        double side = scanner.nextDouble();
        System.out.println("Area of square " + (side*side) +  " square units");
*/

/*6.3
        System.out.println("Please input rectangle's height");
        double height= scanner.nextDouble();
        System.out.println("Please input rectangle's width");
        double width= scanner.nextDouble();
        System.out.println("Area of  rectangle " + (height*width) +  " square units");
*/

/*7     System.out.println("Please input byte b");
        byte b = scanner.nextByte(); ;
        System.out.println("Please input short c");
        short c= scanner.nextShort();
        System.out.println("Please input int a");
        int a= scanner.nextInt();
        scanner.close();
        System.out.println((b*c*a)/3);
        System.out.println(b+c+a);
*/

/* 8.
       System.out.println("please input n");
        int n=scanner.nextInt();
        int Sn;
        Sn=(3*n*n)-(12*n);
        System.out.println(Sn);
*/

/*9
         int num=scanner.nextInt();
        int lastdig=num%10;
        System.out.println(lastdig);
 */


/*11.   System.out.println("input a");
        int a=scanner.nextInt();
        System.out.println("input b");
        int b=scanner.nextInt();
       if(a>b)
           System.out.println("Remainder " + (a-b));
       else
           System.out.println("Remainder " + (b-a));

*/

/*12
        int num = rand.nextInt();
        System.out.print(num);
*/


/*13
     int num1=rand.nextInt(16);
        System.out.println(num1);
*/

/*14
        int numBet=rand.nextInt(16)+15;
        System.out.println(numBet);
*/

/*15
    int a= scanner.nextInt();
    if(a%2!=0){
    System.out.println(a);
     }else System.out.println(false);

        int b= scanner.nextInt();
        if(b%2==0){
            System.out.println(false);
        }else System.out.println(b);
*/

/*16
      int num3= scanner.nextInt();
      int last=num3/10;
      int second=last%10;
        System.out.println(second);
*/

/*17
        int num3= scanner.nextInt();
        int last=num3/10;
        int first=last/10;
        System.out.println(second);
*/

/*18
        int num3= scanner.nextInt();
        int last=num3%10;
        int last1=num3/10;
        int second=last1%10;
        int sum1=second;
        int first=last1/10;
        int sum=last+first+second;
        System.out.println(sum) ;
*/

/*19    int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c=a;
        a=b;
        b=c;
        System.out.println("a-" + a +"\n" + "b-" + b);
*/

    }
}

