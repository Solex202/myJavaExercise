package chapterFour;

import java.util.Arrays;
import java.util.Scanner;
public class Palindrome{


    public static void main(String... args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a valid number: ");
        int digit = scan.nextInt();

        int firstDigit = digit / 1000;
        System.out.println(firstDigit);

        int secondDigit = (digit % 1000) / 100;
        System.out.println(secondDigit);

        int thirdDigit = (digit % 100) / 10;
        System.out.println(thirdDigit);

        int fourthDigit = (digit % 10) ;
        System.out.println(fourthDigit);

        //int fifthDigit = (digit % 10) / 1;
        //System.out.println("fifthDigit");

        if (firstDigit == fourthDigit) {
            if (secondDigit == thirdDigit) {
                System.out.println("This is a palindrome");
            }
        }
        else{
                System.out.println("This is not a palindrome");
            }
        }

    }

