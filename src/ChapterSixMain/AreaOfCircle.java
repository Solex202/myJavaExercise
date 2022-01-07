package ChapterSixMain;

import java.util.Scanner;

public class AreaOfCircle {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter radius ");
        int radius = scan.nextInt();
        System.out.println(circleArea(radius ) + "cm");
    }


    public static int circleArea(int radius){
        int area = 0;

        area = (int) (Math.PI * (int)(Math.pow(radius,2.0)));

   return area;
    }
}
