package chapterSix;
//ask user to enter 10 scores
//print the score
//find the total of scores
//find the minimum and maximum`
//find the average

import java.util.Scanner;
public class ArrayScore {


    public static void main(String[] args) {

        int [] scores = new int [10];
        Scanner scan = new Scanner(System.in);

        for(int i = 0;i < 10;i++){

            System.out.println("Enter a number" );
           scores [i]   = scan.nextInt();
        }
        //display
        for(int i = 0;i < scores.length;i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println();

        //maximum
        int maximumNumber = scores[0];
        for (int i =0;i < scores.length;i++){
            maximumNumber = Math.max(maximumNumber,scores[i]);
        }

        System.out.println("maximum is" + maximumNumber);


        //minimum
        int minimumNumber = scores[0];
        for (int i =0;i < scores.length;i++){
            minimumNumber = Math.min(minimumNumber,scores[i]);
        }

        System.out.println("minimum is" + minimumNumber);



        //addition
            int totalScores = 0;
        //assign elements value to total
        for (int i = 0;i < scores.length;i++) {
            totalScores += scores[i];
        }
        System.out.printf("total of score %d%n",totalScores);

        //average
        double average;
         average = totalScores/scores.length *1.0;
        System.out.printf("average is %f%n", average);





    }


    }
