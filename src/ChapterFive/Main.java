package ChapterFive;

import java.util.Scanner;

public class Main {
    public static void printLogarithm(double x) {
        if (x <= 0.0) {
            System.err.println("Error: x must be positive.");
           return;
        }
        double result = Math.log(x);
        System.out.println("The log of x is " + result);
}

    public static void scanDouble(Scanner in){
        System.out.println("Enter a number");
        if(!in.hasNextDouble()){
            String word = in.nextLine();
            System.err.println(word + " is not a number");
            return;
        }
   double x = in.nextDouble();
        printLogarithm(x);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanDouble(scanner);
    }
}
