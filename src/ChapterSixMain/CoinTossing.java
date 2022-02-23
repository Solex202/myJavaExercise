package ChapterSixMain;

import java.security.SecureRandom;
import java.util.Scanner;

public class CoinTossing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                MENU:
                Press 1 to to toss a coin
                Press other keys to exit program""");

        int choice = scanner.nextInt();
        int count = 0;
        while (choice == 1){
            Coin coinFace = flip();
            System.out.println("You got a "+ coinFace);
            count++;
            System.out.println("""
                MENU:
                Press 1 to to toss a coin
                Press 2 to exit program
                """);

            choice = scanner.nextInt();
        }

        System.out.println("The coin was tossed "+ count + " times");

    }

    private static Coin flip() {
        SecureRandom random = new SecureRandom();
        int randomValue = random.nextInt(2);
        if (randomValue == 0){
            return Coin.HEADS;
        }
        else{
            return Coin.TAILS;
        }
    }

}
