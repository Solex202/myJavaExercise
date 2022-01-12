package ChapterSixMain;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = scan.nextInt();
        int count = 0;
        // scan.close();
        // System.out.println("Factors of " + number + " are:");
        for (int loopCounter = 1; loopCounter <= number; loopCounter++) {

            if (number % loopCounter == 0) {
                // System.out.print(loopCounter + " ");
                count++;
            }
        }

        if (count != 1 && count < 3) {
            System.out.println(number + " is a prime number");
        }
        else System.out.println(number + " is not a prime number");


    }
}
