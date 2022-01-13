package ChapterSixMain;

import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of a");
        int a = scan.nextInt();
        System.out.println("Enter value of b");
        int b = scan.nextInt();

        int result = gcd(a,b);
        System.out.printf("The greatest common of %d and %d is : %d", a,b , result);

    }


        public static int gcd(int a ,int b){

        int greatestCommonDivisor = 0;

        for(int i = 1;i < a;i++){
            for (int j = 1; j < b ; j++) {
                if (a % i == 0 && b % i == 0) {
                    greatestCommonDivisor = i;
                    break;
                }

            }
        }
       return greatestCommonDivisor;
        }

}
