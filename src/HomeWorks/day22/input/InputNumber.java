package HomeWorks.day22.input;

import java.util.Scanner;

public class InputNumber {
    Scanner sc = new Scanner(System.in);

    public int inputLine() {
        String input;
        int number;
        while (true) {
            System.out.println("Input line");
            input = sc.nextLine();
            try {
                number = Integer.parseInt(input);
                return number;
            } catch (NumberFormatException ex) {
                System.out.println("invalid number");
            }
        }
    }

}
