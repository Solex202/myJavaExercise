package ChapterFourMain;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("enter a valid number: ");
        int digit = scan.nextInt();

        int firstDigits = digit / 10000;
        System.out.println(firstDigits);

        int secondDigit = (digit % 10000) / 1000;
        System.out.println(secondDigit);

        int thirdDigit = (digit % 1000) / 100;
        System.out.println(thirdDigit);

        int fourthDigit = (digit % 100) / 10;
        System.out.println(fourthDigit);

        int fifthDigit = (digit % 10) ;
        System.out.println(fifthDigit);

        System.out.printf(" %d  %d  %d  %d  %d",
                firstDigits, secondDigit, thirdDigit, fourthDigit, fifthDigit);


    }






}
