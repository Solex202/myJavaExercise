package classwork.semicolon;

public class FibonacciSeries {

    public static void main(String[] args) {

        int count = 10;
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;

        System.out.println("fibonacci series for" + count + "series");

        for (int i = 0; i <= count; i++) {
            System.out.print(firstTerm + ",");

            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}
