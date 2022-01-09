package ChapterSixMain;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {
        System.out.println("Enter number between 1 and 1000");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        isPerfect(number);
    }


    public static int isPerfect(int number){
        int perfect = 0;
        for (int i = 1;i  < number ;  i++) {
        if(number % i == 0) {
            perfect += i;
        }
        }
        if(perfect == number){
            System.out.println("this is a perfect number");
        }

        else {
            System.out.println("this is not a perfect number");
        }

   return perfect;
    }
}
