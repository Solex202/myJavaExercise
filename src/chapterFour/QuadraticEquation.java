package chapterFour;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.println("enter A");
         a = scan.nextDouble();
        System.out.println("enter B");
         b = scan.nextDouble();
        System.out.println("enter C");
         c = scan.nextDouble();


        double root1 = (-(b)+Math.sqrt((b * b) - (4 * a * c))) / 2 * a;
        double root2 = (-(b)-Math.sqrt((b * b) - (4 * a * c))) / 2 * a;


        System.out.printf("the positive root is %f and the negative root is %f" , root1, root2);


    }









}
