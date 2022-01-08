package ChapterSixMain;

import java.util.Scanner;

public class Exponentiation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter base");
        int base = scan.nextInt();
        System.out.println("Enter exponent");
        int exponent = scan.nextInt();

        int result = integerPower(base,exponent);
        System.out.println("value is " + result);
    }

    public static int integerPower(int base, int exponent){

        int value = 1;

        for (int i = 1; i <= exponent; i++) {
            value *= base;
        }

        //value = (int) Math.pow(base,exponent);

   return value;
    }

}
