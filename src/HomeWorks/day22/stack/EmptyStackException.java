package HomeWorks.day22.stack;

public class EmptyStackException extends RuntimeException {
    public EmptyStackException() {
        super();
    }

    public EmptyStackException(String mes) {
        super(mes);
    }

    public EmptyStackException(int index) {
        super("Index out of range: " + index);
    }
}


