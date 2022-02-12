package ChapterSixMain;

import java.util.*;

public class GuessNumber {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        int randomGenerator = getRandomGenerator();
        System.out.println(randomGenerator);
        int guessCount = 0;
        checkLoop(randomGenerator, guessCount);
    }

    private static int getRandomGenerator() {
        Random random = new Random();

        return random.nextInt(1000) + 1;
    }

    private static void checkLoop(int randomGenerator, int guessCount) {
//        while(true) {
            display("Guess a number between 1 and 1000:");
            int userInput = scanner.nextInt();
            guessCount++;
            checkGuess(randomGenerator, guessCount, userInput);
//        }
    }

    private static boolean checkGuess(int randomGenerator, int guessCount, int userInput) {
        if (userInput > randomGenerator) {
            display("too high,try again");
        } else if (userInput < randomGenerator){
            display("too low,try again");
        }
        else if(randomGenerator == userInput) {
            while(true) {
                display("yo! congrats,you win!!!");
//            display("You had " + guessCount + " guesses");
//            display("!!!!!!!!!!!!!!");
                display("Do you wish to continue?\nyes\nno");
                String userChoice = scanner.nextLine().toUpperCase();
                if (userChoice.equals("yes")) start();
//            else System.exit(0);
            }
        }
        return true;
    }

    public static void display(String message) {
        System.out.println(message);
    }
}