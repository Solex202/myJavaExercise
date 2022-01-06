package ChapterFourMain;

import java.util.Scanner;

public class SquareOfAsterisk {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter size of the size of the square ");
        int size = scan.nextInt();
        for (int i = 1; i <= size ; i++) {
            for (int j = 1; j <= size  ; j++) {
                if (j == 1 || j == size)
               // if(i == 1 || j == 1 || i == size || j == size)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }

        System.out.println();
        }


    }



}
