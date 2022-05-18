package classwork.semicolon;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num = scanner.nextInt();

//        int num = 28;
        boolean isPrime = true;

        for (int i = 2; i <= num/2; ++i){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println(num + " is a prime number");
        }
        else{
            System.out.println(num + " is not a prime number");
        }
    }
}
