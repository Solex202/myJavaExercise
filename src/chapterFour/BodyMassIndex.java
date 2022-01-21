package chapterFour;

import java.util.Scanner;

public class BodyMassIndex {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("enter the weight in kilogram: ");

        double weight = scan.nextDouble();

        System.out.println("enter the height in meters: ");
        double height = scan.nextDouble();
        double bmi = weight/(height*height);

        if (bmi < 18.5){
            System.out.println("underweight");
        }

        if (bmi >= 18.5){
            if (bmi <= 24.9){
                System.out.println("normal");
            }
        }
        if (bmi >= 25){
            if (bmi <=29.9){
                System.out.println("overweight");
            }
        }
        if (bmi > 30){
            System.out.println("obese");
        }


    }
}
