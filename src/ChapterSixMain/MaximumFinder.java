package ChapterSixMain;

import java.util.Scanner;

public class MaximumFinder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter three floating-point values separated by spaces: ");
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        // determine the maximum value
        double result = maximum(number1, number2, number3);
        System.out.println("Maximum is: " + result);

    }



public static double maximum(double x, double y, double z)
        {
        double maximumValue = x; // assume x is the largest to start

        // determine whether y is greater than maximumValue
        if (y > maximumValue)
        maximumValue = y;

        // determine whether z is greater than maximumValue
        if (z > maximumValue)
        maximumValue = z;

        return maximumValue;
}


     }

