package ChapterSeven;

import java.util.Arrays;

public class ArrayPower   {
    public static void main(String[] args) {
        double  [] value = {5.3, 4.3, 1.5, 7.3, 2.9,6.8, 4.9, 7.0};
        double  [] arr = powArray(value, 2);
        printArray(arr);
    }

    public static double [] powArray(double [] a, int power){
        for (int i = 0; i < a.length; i++) {
          a[i] = Math.pow(a[i],power);
        }
        return a;
    }

    public static void printArray(double [] a) {
        System.out.print("{");
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%.2f"+" ", a[i] );
        }
        System.out.println("}");
    }
}
