package chapterSix;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class PrintingArrays {

    public static void main(String[] args) {
        int  size = 30;
        int [] array = randomArray(size);

        printArray(array);
//        for (int i = 0; i < array.length; i++){
//            System.out.println(array[i]);
//        }
//        System.out.println();
    }

    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }

    public static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }




//    private int choice; // user's choice of which shape to draw
//        // constructor sets the user's choice
//         public TicTacToe(int userChoice) {
//         choice = userChoice;
//         }
//
//         // draws a cascade of shapes starting from the top-left corner
//         public void paintComponent(Graphics g){
//         super.paintComponent(g);
//
//         for (int i = 0; i < 10; i++) {
//             // pick the shape based on the user's choice
//             switch (choice) {
//                 case 1: // draw rectangles
//
//        g.drawRect(10 + i * 10, 10 + i * 10,
//        50 + i * 10, 50 + i * 10);
//
//                    break;
//                case 2: // draw ovals
//
//
//        g.drawOval(10 + i * 10, 10 + i * 10,
//        50 + i * 10, 50 + i * 10);
//                    break;
//                }
//             }
//         }
// } // end class Shapes


        // public static void main(String[] args) {
   /*  char[][] ticTacToe = {{'x', 'o', 'o',}, {'x', 'x', 'x'}, {'o', 'x', 'o'}};
           for (int i = 0; i < ticTacToe.length; i++) {

            for (int j = 0; j < ticTacToe[i].length; j++) {

                System.out.print(ticTacToe[i][j] + " ");
            }
             System.out.println();
            // System.out.println(ticTacToe + " ");
        }
       Date now = new Date();

               System.out.println(now);*/
        //int number = 0;
        //for (int i = 1; ; i*=2) {

       // System.out.println(i);
       // }

// interst calculation//
//        double amount; // amount on deposit at end of each year
//         double principal = 1000.0; // initial amount before interest
//         double rate = 0.05; // interest rate
//
//         // display headers
//         System.out.printf("%s%30s%n", "Year", "Amount on deposit");
//
//
//
//// calculate amount on deposit for each of ten years
//         for (int year = 1; year <= 10; ++year) {
//             // calculate new amount for specified year
//             amount = principal * Math.pow(1.0 + rate, year);
//
//             // display the year and the amount
//             System.out.printf("%4d%,20.2f%n", year, amount);
//         }
//
//    }
}