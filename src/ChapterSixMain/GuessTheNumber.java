package ChapterSixMain;

import java.util.Scanner;

public class GuessTheNumber {
        private static final Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

//        int min = 1;
//        int max = 1000;
//        int guessNumber;
//        guessNumber = (int)(Math.random() * (max - min + 1) + 1);
//        System.out.println(  guessNumber);
        System.out.println(randomGenerator());
        System.out.println("Guess the number: ");
        int number = scan.nextInt();

        while (number != -1){
            int random = randomGenerator();

            numberGuessing(number, random);
        }


    }
    public static void  numberGuessing(int number, int guessNumber) {

//        while (number != -1) {
//          if (number >= 1 && number <= 1000) {
//              System.out.println("number out of bound");
//              System.out.println("Guess a number");
//
//          }
            if (number > guessNumber) {
              System.out.println("Too high.Try again");
              System.out.println("Guess the number: ");
              number = scan.nextInt();
          } else
              if (number < guessNumber) {
              System.out.println("Too low.Try again");
              System.out.println("Guess the number: ");
              number = scan.nextInt();
          } else {
              System.out.println("Congratulations.You guessed right!!!");


          }
            System.out.println("Do you wish to continue\nyes \nno?");
            String userInput = scan.nextLine();
            if (userInput == "yes") randomGenerator();
            else System.exit(0);


    }
    public static int randomGenerator(){
        int min = 1;
        int max = 1000;
        int guessNumber;
        guessNumber = (int)(Math.random() * (max - min + 1) + 1);
        System.out.println(guessNumber);


        return guessNumber;
    }

    }






