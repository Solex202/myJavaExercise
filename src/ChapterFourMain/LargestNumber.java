package ChapterFourMain;

import java.util.Scanner;

public class LargestNumber {

    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int number;
    int LargestNumber = Integer.MIN_VALUE;
    int smallestNumber = Integer.MAX_VALUE;

        for (int counter = 0; counter < 5; counter++) {
            System.out.println("Enter a number");
            number = scan.nextInt();

            if( number > LargestNumber) {
                LargestNumber = number;
            }
            if(number < smallestNumber) {
                smallestNumber = number;

            }
        }
        System.out.println("This largest number is " + LargestNumber);
        System.out.println("This smallest number is " + smallestNumber);
    }
}































//
//
//
//    Scanner scan = new Scanner(System.in);
//
//    int counter = 0;
//    //System.out.println("Enter a number:");
//    int number ;
//    int largestNumber = Integer.MIN_VALUE;
//
//        for (; counter < 5 ; counter++) {
//        System.out.println("Enter a number:");
//        number = scan.nextInt();
//        if(number > largestNumber){
//        largestNumber = number;
//        }
//
//
//        }
//        System.out.println(largestNumber);
