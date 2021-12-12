package chapterSix;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class TicTacToe {

    public static void main(String[] args) {
     char[][] ticTacToe = {{'x', 'o', 'o',}, {'x', 'x', 'x'}, {'o', 'x', 'o'}};
           for (int i = 0; i < ticTacToe.length; i++) {

            for (int j = 0; j < ticTacToe[i].length; j++) {

                System.out.print(ticTacToe[i][j] + " ");
            }
             System.out.println();
            // System.out.println(ticTacToe + " ");
        }
       Date now = new Date();

               System.out.print(now);

            }

    }




