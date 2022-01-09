package ChapterSixMain;

import java.util.Scanner;

public class QualifyPoint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        try{
            System.out.println("enter a number");
            int average = scan.nextInt();
            System.out.println(qualifyPoint(average));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: average score exceeded");
        }
    }

    public static int qualifyPoint(int average){

        int n = -4;
        if (average > 0) {
            if (average < 60) {
                n = 0;
            }
            else
                if (average <= 69) {
                n = 1;
            }
            else
                if (average <= 79) {
                n = 2;
            }
            else
                if (average <= 89) {
                n = 3;
            }
            else
                if (average <= 100) {
                n = 4;

            }
        }
        throw new IllegalArgumentException();

    }

}
