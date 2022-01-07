package ChapterSixMain;

import java.util.Scanner;

public class MinimumMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter three floating point number");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double num3 = scanner.nextDouble();

        double result = minimum3(num3, num2, num1);

        System.out.println("minimum number is " + result);

    }


    public static double minimum3(double a, double b, double c){

       double minimumNumber = a;

       if (b < minimumNumber) {
           minimumNumber = b;
       }

       if(c < minimumNumber) {
           minimumNumber = c;

       }
   return minimumNumber;
    }

}
