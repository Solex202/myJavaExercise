package ChapterSixMain;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int randomNumbers = getRandomNumbers();
        System.out.println(randomNumbers);
        int tryCount = 0;
        while(true){

        System.out.println("guess a number");
        int userInput = scanner.nextInt();
        tryCount++;

        if(userInput > randomNumbers){
                System.out.println("too high,try again!");
            }
        else if(userInput < randomNumbers){
                System.out.println("too low,try again!");
            }
        while(userInput == randomNumbers){
                System.out.println("yo,you won");
            System.out.println("you had " + tryCount + " tries");
            getRandomNumbers();
                //break;
            }
                //System.out.println("do you wish to continue?");
        }


    }

    private static int getRandomNumbers() {
        Random rand = new Random();

        int randomNumbers = rand.nextInt(1000) + 1;
        return randomNumbers;
    }
}
