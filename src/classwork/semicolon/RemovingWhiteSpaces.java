package classwork.semicolon;

import java.util.Scanner;

public class RemovingWhiteSpaces {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string");

        String input = scan.nextLine();
        System.out.println("Original String: " + input);

        input = input.replaceAll("\\s", "");
        System.out.println("Final String: " + input);
        scan.close();
    }
}
