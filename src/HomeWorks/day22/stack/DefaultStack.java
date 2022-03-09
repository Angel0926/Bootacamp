package HomeWorks.day22.stack;

public class DefaultStack implements Stack {
    int index=0;
    int MAX_SIZE = 5;
    int[] num = new int[MAX_SIZE];

    @Override
    public void push(int val) {

        if (index >= MAX_SIZE) {
            throw new StackIndexOutOfBoundsException();
        }
        index++;
    }

    @Override
    public int pop() {

            if (index == 0) {
                throw new EmptyStackException();
            }index--;
            return num[index];
    }
}
