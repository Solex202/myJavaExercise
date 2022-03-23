package chapterFourteen;

import java.util.Scanner;

public class ComparingString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string");
        String input = scanner.nextLine();
        System.out.println("Enter  a string");
        String input2 = scanner.nextLine();

        int output = input.compareTo(input2);

        System.out.println(output);
        if(output > 0){
            System.out.println("first string is greater");
        }
        else{
            System.out.println("second string is greater");
        }
    }
}
