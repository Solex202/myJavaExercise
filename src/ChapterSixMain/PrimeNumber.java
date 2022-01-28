package ChapterSixMain;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        display("Enter a number");

        int number = scan.nextInt();
        int count = 0;
        for (int loopCounter = 1; loopCounter <= number; loopCounter++) {

            if (number % loopCounter == 0) {

                count++;
            }
        }

        if (count != 1 && count < 3) {
            display(number + " is a prime number");
        }
        else display(number + " is not a prime number");
    }

        public static  void display(String message) {
            System.out.println(message);
        }

}

