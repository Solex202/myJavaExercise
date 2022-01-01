package ChapterFourMain;

import java.util.Scanner;

public class Cryptography {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a valid number: ");
        int digit = scan.nextInt();
        String stringDigit = "" + digit;
//        System.out.println(stringDigit.length());

       while (stringDigit.length() != 4){
           System.out.println("invalid digit");
           System.out.println("Enter a valid number:");
           digit = scan.nextInt();
           stringDigit = "" + digit;
       }
           int firstDigits = digit / 1000;
           //System.out.println(firstDigits);
           int firstDigits2 = (firstDigits + 7) % 10;

           int secondDigit = (digit % 1000) / 100;
           // System.out.println(secondDigit);
           int secondDigit2 = (secondDigit + 7) % 10;

           int thirdDigit = (digit % 100) / 10;
           //System.out.println(thirdDigit);
           int thirdDigit2 = (thirdDigit + 7) % 10;

           int fourthDigit = digit % 10;
           //System.out.println(fourthDigit);
           int fourthDigit2 = (fourthDigit + 7) % 10;


            int tempFirst = firstDigits2;
            firstDigits2 = thirdDigit2;
            thirdDigit2 = tempFirst;

            int tempSecond = secondDigit2;
            secondDigit2 = fourthDigit2;
            fourthDigit2 = tempSecond;


            System.out.printf(" %d  %d  %d  %d  ",
                    firstDigits2, secondDigit2, thirdDigit2, fourthDigit2);

        }







}
