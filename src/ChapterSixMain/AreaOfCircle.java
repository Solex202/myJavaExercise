package ChapterSixMain;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius ");
        double radius = scan.nextInt();
        System.out.printf( "The area of a circle is %.2fcm " ,circleArea(radius ) );
    }


    public static double circleArea(double radius){
        double area = 0;

        area =  Math.PI * (Math.pow(radius,2.0));

   return area;
    }
}
