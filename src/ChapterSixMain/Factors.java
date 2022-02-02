package ChapterSixMain;

import java.util.Scanner;

public class Factors {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");

        int number = scan.nextInt();
       // scan.close();
        System.out.println("Factors of " + number + " are:");
        for (int loopCounter = 1; loopCounter <= number; loopCounter++) {

            if (number % loopCounter == 0) {
                System.out.print(loopCounter + " ");
            }
        }

        System.out.println(System.out);
    }
}
