package ChapterSeven;

import java.util.Scanner;

public class SevenSegmentDisplaySession {
    private static final int[][] array = {{0, 0, 0, 0},
                                          {0, 0, 0, 0},
                                          {0, 0, 0, 0},
                                          {0, 0, 0, 0},
                                          {0, 0, 0, 0}};
    public static void main(String[] args) {
        inputMethod();
        checkDisplay(array);
    }

    public static void inputMethod(){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter numbers between 0's and 1's:");
        String digit = input.nextLine();
        Integer.parseInt(digit);
        if(digit.length() == 8 ){

            int firstDigit = (Integer.parseInt(digit) / 10000000);
            int secondDigit = (Integer.parseInt(digit) % 10000000) /1000000;
            int thirdDigit = (Integer.parseInt(digit) % 1000000) /100000;
            int fourthDigit = (Integer.parseInt(digit) % 100000) /10000;
            int fifthDigit = (Integer.parseInt(digit) % 10000) /1000;
            int sixthDigit = (Integer.parseInt(digit) % 1000) /100;
            int seventhDigit = (Integer.parseInt(digit) % 100) /10;
            int eightDigit = (Integer.parseInt(digit) % 10);


            if (eightDigit == 1){
                if(firstDigit == 1){
                    displayA();
                }
           if(secondDigit == 1){
               displayB();
           }
           if(thirdDigit == 1){
               displayC();
           }
           if(fourthDigit == 1){
               displayD();
           }
            if(fifthDigit == 1){
                displayE();
            }
           if(sixthDigit == 1){
               displayF();
           }
           if(seventhDigit == 1){
               displayG();
           }else System.out.println(" ");
            }else System.exit(0);

        }
    else {
            System.out.println("invalid digit");
            inputMethod();
        }
    }



        public static void checkDisplay(int [][]array){

            for (int row = 0; row < array.length; row++) {
                for (int column = 0; column < array[row].length; column++) {
                    if (array[row][column] == 0) {
                        System.out.print(" ");
                    } else
                        if (array[row][column] == 1) {
                        System.out.print("#");
                    }


                }
                System.out.println();
            }
        }
        public static void displayA(){
//            array [0][0] = 1;
//            array [0][1] = 1;
//            array [0][2] = 1;
//            array [0][3] = 1;

            for(int i = 0; i < 1 ;i++){
                for (int j = 0; j <= 3; j++){
                    array[i][j] = 1;
                }
            }

            }
        public static void displayB(){
            // array [0][3] = 1;
            // array [1][3] = 1;
            // array [2][3] = 1;
            for(int i = 0;i <= 2;i++){
                for (int j = 3;j < 4;j++){
                  array[i][j] = 1;
                }
            }
                }
        public static void displayC(){
            //array [2][3] = 1;
            //array [3][3] = 1;
            //array [4][3] = 1;
            for(int i = 0;i <= 4;i++){
                for(int j = 3;j < 4;j++){
                    array[i][j] = 1;
                }
            }

            }
        public static void displayD() {
          //  array[4][3] = 1;
           // array[4][2] = 1;
           // array[4][1] = 1;
           // array[4][0] = 1;
            for(int i = 4;i < 5;i++){
                for(int j = 0;j <= 3;j++){
                    array[i][j] = 1;
                }
            }

        }
        public static void displayE(){
            //array [4][0] = 1;
            //array [3][0] = 1;
           // array [2][0] = 1;
            for (int i = 2; i < 5 ; i++) {
                for (int j = 0; j < 1; j++) {
                    array[i][j] = 1;
                }
            }

            }
        public static void displayF(){
           // array [2][0] = 1;
            //array [1][0] = 1;
            //array [0][0] = 1;
            for (int i = 0; i <= 2 ; i++) {
                for (int j = 0; j < 1; j++) {
                array[i][j] = 1;
                }
            }

            }
        public static void displayG(){
          //array [2][0] = 1;
            //array [2][1] = 1;
            //array [2][2] = 1;
           // array [2][3] = 1;
            for (int i = 2; i < 3; i++) {
                for (int j = 0; j <= 3 ; j++) {
            array[i][j] = 1;
                }
            }
            }


    }


