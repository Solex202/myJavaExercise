package ChapterSeven;

import java.util.ArrayList;
import java.util.Scanner;
public class EvenPrint {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
        ArrayList<Integer> storage = new ArrayList<>();


       int count = 0;
       int userInput = 0;
       int maximumNumber = Integer.MIN_VALUE;
         do  {
               System.out.println("Enter a number or -1 to break ");
                userInput = scan.nextInt();
     if (userInput % 2 == 0) {
     if (userInput > maximumNumber) {
        maximumNumber = userInput;
    }
     storage.add(userInput);

        count++;
    }
         }
         while (userInput != -1);

        //for (int i = 0; i < 100; i++) {
         //   System.out.println(i);
       // }
        System.out.println("-".repeat(20));
        System.out.println(" total of even number is: "  + count);
        System.out.println("-".repeat(20));
        System.out.println("maximum even number is: "  + maximumNumber);
        System.out.println("-".repeat(20));
    }

}
