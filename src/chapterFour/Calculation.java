package chapterFour;

import java.util.Scanner;

public class Calculation {


        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            System.out.println("enter first number");
            int number1 = scan.nextInt();

            System.out.println("enter second number");
            int number2 = scan.nextInt();

            System.out.println("enter third number");
            int number3 = scan.nextInt();

            int sum = number1 + number2 + number3;
            System.out.printf("Sum is %d%n", sum);

            double average = (number1 + number2 + number3) / 3.0;
            System.out.printf("Average is %f%n", average);

            int product = number1 * number2 * number3;
            System.out.printf("Product is %d%n", product);

            if (number1 > number2){
                if (number1 > number3){
                    System.out.printf("the largest number is %d%n", number1);
                }
            }

            if (number2 > number1){
                if (number2 > number3){
                    System.out.printf("the largest number is %d%n", number2);
                }
            }

            if (number3 > number1){
                if (number3 > number2){
                    System.out.printf("the largest number is %d%n", number3);
                }
            }

            if (number1 < number2){
                if (number1 < number3){
                    System.out.printf("the smallest number is %d", number1);
                }
            }

            if (number2 < number1){
                if (number2 < number3){
                        System.out.printf(" the smallest number is %d%n", number2);

                }

            }
            System.out.println();
            if (number3 < number1){
                if (number3 < number2){

                    System.out.printf("the smallest number is %d", number3);
                }
            }

        }

    }





