package ChapterSixMain;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of a");
        int num1 = scan.nextInt();
        System.out.println("Enter value of b");
        int num2 = scan.nextInt();

        int result = gcd(num1,num2);
        System.out.printf("The greatest common of %d and %d is : %d", num1,num2, result);

    }


        public static int gcd(int num1 ,int num2){

        int greatestCommonDivisor = 0;

        for(int i = 1;i < num1;i++){
            for (int j = 1; j < num2 ; j++) {
                if (num1 % i == 0 && num2 % i == 0) {
                    greatestCommonDivisor = i;
                    break;
                }

            }
        }
       return greatestCommonDivisor;
        }

}
