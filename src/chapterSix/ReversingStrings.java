package chapterSix;

import java.util.Scanner;

public class ReversingStrings {


    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter a String");
//        String number = scan.nextLine();
        reversingDigits("BAALOON");

    }

    public static void reversingDigits(String letter){

        String reverse = "";
        for (int i = letter.length()-1; i >= 0 ; i--) {
            reverse += letter.charAt(i);



        }
            System.out.println(reverse);
    }
}
