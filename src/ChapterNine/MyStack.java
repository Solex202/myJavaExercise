package ChapterNine;

public class MyStack {
    private boolean isEmpty = true;
    public boolean isEmpty() {
        return isEmpty;
    }

    public void push(int element) {
    isEmpty = false;
    }

    public class Underflow extends RuntimeException {
    }
}
