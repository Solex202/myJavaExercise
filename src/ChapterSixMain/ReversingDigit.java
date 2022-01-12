package ChapterSixMain;

import java.util.Scanner;

public class ReversingDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        reversingDigits(number);

    }

    public static void reversingDigits(int number){
        String num = number + "";
        String reverse = "";
        for (int i = num.length()-1; i >= 0 ; i--) {
            reverse += num.charAt(i);

        }
        System.out.println(reverse);
    }
}
