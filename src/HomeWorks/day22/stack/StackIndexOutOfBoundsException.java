package HomeWorks.day22.stack;

public class StackIndexOutOfBoundsException extends RuntimeException {
          public StackIndexOutOfBoundsException() {
            super();
        }

    public StackIndexOutOfBoundsException(String mes) {
            super(mes);
        }


    public StackIndexOutOfBoundsException(int index) {
            super("Index out of range: " + index);
        }
}
