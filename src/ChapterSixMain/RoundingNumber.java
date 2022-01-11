package ChapterSixMain;

import java.util.Scanner;

public class RoundingNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of x");
        double x = scan.nextDouble();
        int result = rounding(x);
        System.out.printf("Original number is: %.2f  ", x);
        System.out.println();
        System.out.printf("After being rounded value of y is %d ",result);
    }

    public static int rounding(double x){
        int y;

        y = (int) Math.floor(x + 0.5);

   return y;
    }

}
