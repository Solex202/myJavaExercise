package chapterFour;

import java.util.Scanner;
    public class TestDriller{

        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            int demand = input.nextInt();
            if (demand >= 1){
                if (demand <= 4){
                    int price = demand * 2000;
                    System.out.printf("the total price per copy is %d%n", price);
                }
            }



            if (demand >= 5){
                if (demand <= 9){
                    int price = demand * 1800;
                    System.out.printf("the total price per copy is %d%n", price);
                }
            }


            if (demand >= 10){
                if (demand <= 29){
                    int price = demand * 1600;
                    System.out.printf("the total price per copy is %d%n", price);
                }
            }

            if (demand >= 30){
                if (demand <= 49){
                    int price = demand * 1500;
                    System.out.printf("the total price per copy is %d%n", price);
                }
            }

            if (demand >= 50){
                if (demand <= 99){
                    int price = demand * 1300;
                    System.out.printf("the total price per copy is %d%n", price);
                }
            }


            if (demand >= 100){
                if (demand <= 199){
                    int price = demand * 1200;
                    System.out.printf("the total price per copy is %d%n", price);
                }
            }

            if (demand >= 200){
                if (demand <= 499){
                    int price = demand * 1100;
                    System.out.printf("the total price per copy is %d%n", price);
                }
            }

            if (demand > 500){
                int price = demand * 1000;
                System.out.printf("the total price per copy is %d%n", price);
            }

















        }









































    }
