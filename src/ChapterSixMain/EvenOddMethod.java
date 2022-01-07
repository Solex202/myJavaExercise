package ChapterSixMain;

import java.util.Scanner;

public class EvenOddMethod {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = scan.nextInt();
        System.out.println(isEven(number));

    }


        public static boolean isEven(int number){

        //boolean value = true;

        if(number % 2 == 0){
            return true;
           // System.out.println("This is even number");
        }

        else {
            return false;
        }
//       if(number % 2 == 1){
//           System.out.println("This is odd number");
//
//       }
//
//       return value;
      }
}
