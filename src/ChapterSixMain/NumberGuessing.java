package ChapterSixMain;

import java.security.SecureRandom;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        int tryCount = 0;
        do {

            randomCheck(getRandomNumbers(), tryCount);
            System.out.println("Do you want to continue: ");
            String userInput = scanner.next();
            if(Objects.equals(userInput, "yes")){
                randomCheck(getRandomNumbers(),tryCount);
            }
            else {
                System.exit(0);
            }
        }
        while(true);
    }

    private static void randomCheck(int randomNumbers, int tryCount) {
        while(true){
            display("guess a number");
        int userInput = scanner.nextInt();
        tryCount++;


        if(userInput > randomNumbers){
                display("too high,try again!");
            }
        else if(userInput < randomNumbers){
                display("too low,try again!");
            }
        else {
                display("yo,you won");
                display("you had " + tryCount + " tries");
                break;
            }
        }
    }

    private static int getRandomNumbers() {
        Random rand = new Random();
        return rand.nextInt(1000) + 1;
    }

    public static void display(String message) {
        System.out.println(message);
    }
}
