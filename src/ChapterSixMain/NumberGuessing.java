package ChapterSixMain;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int randomNumbers = getRandomNumbers();
        System.out.println(randomNumbers);
        int tryCount = 0;
        randomCheck(randomNumbers, tryCount);
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
