package chapterFour;

import java.util.Scanner;

public class Separation {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter five digits: ");
        int digit = scan.nextInt();
        String userInput = digit + "";

            if (userInput.length() == 5) {
                int firstDigits = digit / 10000;
                int secondDigit = (digit % 10000) / 1000;
                int thirdDigit = (digit % 1000) / 100;
                int fourthDigit = (digit % 100) / 10;
                int fifthDigit = (digit % 10);


                System.out.printf(" %d  %d  %d  %d  %d",
                        firstDigits, secondDigit, thirdDigit, fourthDigit, fifthDigit);
            }
        else{
                System.out.println("digits out of bound");
            }

    }







    }
