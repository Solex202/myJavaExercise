package chapterFour;

import java.util.Scanner;

public class Seperation {

    public static void main(String[] args) {

        Scanner malik = new Scanner(System.in);
        System.out.println("enter a valid number: ");
        int judith = malik.nextInt();

        int firstDigits = judith / 10000;
        System.out.println(firstDigits);

        int secondDigit = (judith % 10000) / 1000;
        System.out.println(secondDigit);

        int thirdDigit = (judith % 1000) / 100;
        System.out.println(thirdDigit);

        int fourthDigit = (judith % 100) / 10;
        System.out.println(fourthDigit);

        int fifthDigit = (judith % 10) / 1;
        System.out.println(fifthDigit);

        System.out.printf(" %d  %d  %d  %d  %d",
                firstDigits, secondDigit, thirdDigit, fourthDigit, fifthDigit);


    }







    }
