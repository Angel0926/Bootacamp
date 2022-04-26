package HomeWorks.day22.stack;

import java.util.Arrays;
import java.util.Objects;

public class DefaultStack implements Stack {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DefaultStack that = (DefaultStack) o;
        return index == that.index && MAX_SIZE == that.MAX_SIZE && Arrays.equals(num, that.num);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(index, MAX_SIZE);
        result = 31 * result + Arrays.hashCode(num);
        return result;
    }

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
