package ChapterSixMain;

import java.util.Scanner;

public class HypotenuseCalculation {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for(int i = 1; i <= 3; i++) {
            System.out.println("Enter side A");
            double sideA = scan.nextDouble();

            System.out.println("Enter side B");
            double sideB = scan.nextDouble();

            double result = hypotenuse(sideA, sideB);

            System.out.printf("Hypotenuse of the triangle is %.2f", result);
            System.out.println("\n");

        }

    }


    public static double hypotenuse(double sideA, double sideB){

        double c ;

        c = Math.sqrt(Math.pow(sideA,2.0) + Math.pow(sideB,2.0));

       // c = Math.hypot(sideA,sideB);

   return c;
    }

}
