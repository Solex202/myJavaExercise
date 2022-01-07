package ChapterSixMain;

import java.util.Scanner;

public class DisplayingSquareOfAsterisks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of square");
        int i = scan.nextInt();
        squareOfAsterisks(i);
    }



    public static void squareOfAsterisks(int i){

        for (int row = 1; row <= i ; row++) {
            for (int column = 1; column <= i  ; column++) {
                System.out.print(" *");
            }
            System.out.println();
        }
//      return row;
    }

}
