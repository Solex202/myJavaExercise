package ChapterFourMain;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Factors {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();
        factorFinding(number);
    }

    public static void factorFinding(int number) {
    List<Integer> factors = new ArrayList<Integer>();
        System.out.println("factors of " + number + " is");
        for (int counter = 1; counter <= number; counter++) {
         if(number % counter == 0){
             factors.add(counter);
             System.out.println(factors);
//             System.out.print(counter + "\t");
         }
        }
        System.out.println();
    }

    public int returnFactor(int number){
        int count = 2;

        for (int i = 2; i <= number/2; i++) {
           if(number % i == 0 && number/i > i){
               count += 2;
           }
        }
        return count;
    }
}
