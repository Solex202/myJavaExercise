package chapterFour;

import java.util.Scanner;

public class StaticClass {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println(
                "Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble(); // read first double
        double number2 = input.nextDouble(); // read second double
        double number3 = input.nextDouble(); // read third double

        // determine the maximum value
        double result = maximum(number1, number2, number3);

        System.out.println("Maximum is: " + result);

    }
    public static double maximum(double x, double y, double z) {
        double maximumValue = x; // assume x is the largest to start

        // determine whether y is greater than maximumValue
        if (y > maximumValue)
            maximumValue = y;

        // determine whether z is greater than maximumValue
        if (z > maximumValue)
            maximumValue = z;

        return maximumValue;
    }
         // display maximum value


       /* int count = 1;

        while (count <= 10)
        {
             System.out.println(count % 2 == 1 ? "****" : "++++++++");
             ++count;
            }*/
//
//        int row = 10;
//
//         while (row >= 1)
//             {
//             int column = 1;
//
//            while (column <= 10)
//                    {
//                 System.out.print(row % 2 == 1 ? "<" : ">");
//                 ++column;
//                 }
//
//             --row;
//             System.out.println();
//             }
//        for (int i = 1; i <= 10; i++) {
//            for (int j = 1; j <= 5; j++)
//                System.out.print('@');
//
//        }
//            System.out.println();
  //  }
}




