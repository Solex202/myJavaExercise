package ChapterSixMain;

import java.security.SecureRandom;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    private static final Scanner scanner = new Scanner(System.in);
    private static int tryCount = 0;

    public static void main(String[] args) {
        try {
            do {
                randomCheck(getRandomNumbers(), tryCount);
                System.out.println("Do you wish to continue: ");
                String userInput = scanner.next();
                if(Objects.equals(userInput, "yes")){
                    randomCheck(getRandomNumbers(),tryCount);
                }
                else if(Objects.equals(userInput, "no")){
                    System.out.println("goodbye!!!");
                    System.exit(0);
                }
            }
            while(true);
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }

    }

    private static void randomCheck(int randomNumbers, int tryCount) {
        while (true) {
            try {
                action(randomNumbers, tryCount);

            }
            catch (InputMismatchException e){
                System.out.println("Caught Exception");
                action(randomNumbers, tryCount);
            }
            tryCount++;
        }
    }

    private static void action(int randomNumbers, int tryCount) {
        Scanner scanner = new Scanner(System.in);
        display("guess a number: ");
        //System.out.println("TryCount --> " + tryCount);
        int userInput = scanner.nextInt();
        if (userInput >= 0 && userInput <= 1000) {
            // }
            // catch(InputMismatchException e){
            if (userInput > randomNumbers) {
                display("too high,try again!");
            } else if (userInput < randomNumbers) {
                display("too low,try again!");
            } else {
                display("yo,Congratulation you won");
                display("you had " + tryCount + " tries");
                countGuess(tryCount);
            }
        } else {
            throw new InputMismatchException("something went wrong\ninvalid digit");

        }
        System.out.println("TryCount --> " + tryCount);

    }

    private static void countGuess(int tryCount) {
        if(tryCount <= 10){
            display("either you know the secret or you got lucky");
        }
        else if(tryCount > 10){
            display("you should be able to do better,why should it take you more than 10 guesses?");
        }
        else {
            display("Aha! you know the secret");
        }
    }

    private static int getRandomNumbers() {
        SecureRandom rand = new SecureRandom();
        return rand.nextInt(1000) + 1;
    }

    public static void display(String message) {
        System.out.println(message);
    }
}
