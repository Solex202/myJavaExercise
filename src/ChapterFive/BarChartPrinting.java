package ChapterFive;

import java.util.Scanner;

public class BarChartPrinting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       
        System.out.println("Enter a number");
        int num1 = scan.nextInt();
        System.out.println("Enter a number");
        int num2 = scan.nextInt();
        System.out.println("Enter a number");
        int num3 = scan.nextInt();
        System.out.println("Enter a number");
        int num4 = scan.nextInt();
        System.out.println("Enter a number");
        int num5 = scan.nextInt();

        for (int i = 0; i < num1; i++) {
            if ( num1 <= 30)
            System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < num2; i++) {
            if( num2 <= 30)
            System.out.print("*");
            else
                System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < num3; i++) {

            if( num3 <= 30)
            System.out.print("*");
            else
                System.out.print(" ");
        }
            System.out.println();
        for (int i = 0; i < num4; i++) {
            if( num4 <= 30)

            System.out.print("*");
            else
                System.out.print(" ");
        }
            System.out.println();
        for (int i = 0; i < num5; i++) {
            if(num5 <=30)
            System.out.print("*");
            else
                System.out.print(" ");

        }
       System.out.println();
    }
}