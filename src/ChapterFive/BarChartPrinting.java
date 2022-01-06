package ChapterFive;

import java.util.Scanner;

public class BarChartPrinting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0;
        System.out.println("Enter a number");
        num1 = scan.nextInt();
        System.out.println("Enter a number");
        num2 = scan.nextInt();
        System.out.println("Enter a number");
        num3 = scan.nextInt();
        System.out.println("Enter a number");
        num4 = scan.nextInt();
        System.out.println("Enter a number");
        num5 = scan.nextInt();

        for (int i = 0; i < num1; i++) {
            if (num1 > 0 && num1 <= 30)
            System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < num2; i++) {
            if(num2 > 0 && num2 <= 30)
            System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < num3; i++) {

            if(num3 > 0 && num3 <= 30)
            System.out.print("*");
            else
                System.out.print(" ");
        }
            System.out.println();
        for (int i = 0; i < num4; i++) {
            if(num4 > 0 && num4 <= 30)

            System.out.print("*");
            else
                System.out.print(" ");
        }
            System.out.println();
        for (int i = 0; i < num5; i++) {
            if(num5 > 0 && num5 <=30)
            System.out.print("*");
            else
                System.out.print(" ");

        }
       System.out.println();
    }
}