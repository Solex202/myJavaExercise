package ChapterSixMain;

import java.util.Scanner;

public class QualifyPoint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        try{
            System.out.println("enter a number");
            int average = scan.nextInt();
            System.out.println(qualifyPoint(average));
            //qualifyPoint(average);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: illegal argument");
        }
    }

    public static int qualifyPoint(int average){

        int n = -4;
        if (average > 0) {
            if (average < 60) {
                n = 0;
            }
            else if (average >= 60 && average <= 69) {
                n = 1;
            }
            else if (average > 69 && average <= 79) {
                n = 2;
            }
            else if (average >= 80 && average <= 89) {
                n = 3;
            }
            else if (average >= 90 && average <= 100) {
                n = 4;

            } else throw new IllegalArgumentException();
           // else{
            //        System.out.println("incorrect average score");
             //   }

        }
    return n;
    }

}
