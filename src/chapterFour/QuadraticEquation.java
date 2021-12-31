package chapterFour;

import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("enter A");
        double a = scan.nextDouble();
        System.out.println("enter B");
        double b = scan.nextDouble();
        System.out.println("enter C");
        double c = scan.nextDouble();

        double root1 = (-(b)+Math.sqrt((b*b)-(4*a*c)))/2*a;
        double root2 = (-(b)-Math.sqrt((b*b)-(4*a*c)))/2*a;


        System.out.printf("the positive root is %f and the negative root is %f" , root1, root2);


    }









}
