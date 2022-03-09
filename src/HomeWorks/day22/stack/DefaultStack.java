package HomeWorks.day22.stack;

import java.util.Scanner;

public class DefaultStack implements Stack {
    Scanner scanner = new Scanner(System.in);
    int index;
    int MAX_SIZE = 5;
    int[] num = new int[MAX_SIZE];

    @Override
    public void push(int val) {
        try {
            for (int i = index; i < MAX_SIZE; i++) {
                num[index] = val;
            }
            System.out.println(num[index]);
            index++;
            if (index > MAX_SIZE) {
                throw new ArrayIndexOutOfBoundsException();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("StackIndexOutOfBoundsException");
        }
    }

    @Override
    public int pop() {
        try {
            index--;
            if (index < 0) {
                throw new EmptyStackException();
            }
            return num[index];
        } catch (EmptyStackException e) {
            System.out.print("Stack is Empty");
            return -1;
        }
    }
}
