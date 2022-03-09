package HomeWorks.day22.stack;

public class DefaultStack implements Stack {

    private int index=0;
  private final   int MAX_SIZE=5;
    private int[] num;
    public DefaultStack() {
        this.num = new int[MAX_SIZE];
    }



    @Override
    public void push(int val) {

        if (index >= MAX_SIZE) {
            throw new StackIndexOutOfBoundsException();
        }
        num[index++] = val;
    }

    @Override
    public int pop() {

            if (index == 0) {
                throw new EmptyStackException();
            }index--;
            return 0;
    }
}
