package ChapterSixMain;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        display("Enter base");
        int base = scan.nextInt();
        display("Enter exponent");
        int exponent = scan.nextInt();

        int result = integerPower(base,exponent);
        display("value is " + result);
    }

    public static int integerPower(int base, int exponent){

        int value = 1;

        for (int i = 1; i <= exponent; i++) {
            value *= base;
        }

        //value = (int) Math.pow(base,exponent);

   return value;
    }
    public static void display(String message) {
        System.out.println(message);
    }
}
