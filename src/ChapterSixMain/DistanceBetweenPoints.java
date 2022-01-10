package ChapterSixMain;

import jdk.jshell.EvalException;

import java.util.Scanner;

public class DistanceBetweenPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter value of x2");
        int x2 = scan.nextInt();
        System.out.println("Enter value of x1");
        int x1 = scan.nextInt();
        System.out.println("Enter value of y2");
        int y2 = scan.nextInt();
        System.out.println("Enter value of y1");
        int y1 = scan.nextInt();

        double result = distance(x1,x2,y1,y2);
        System.out.printf("the distance from point 1 to point 2 is %.2f",result);

    }

    public static double distance(int x1,int x2,int y1,int y2){

        double value ;
         value = Math.sqrt((Math.pow(x2 - x1,2.0)) + Math.pow(y2-y1,2.0));


   return value;
    }
}
