package ChapterSevenMain;

import java.util.Arrays;
import java.util.Scanner;

public class DuplicateEliminationB
{
    public static void main(String[] args) {
//        System.out.println("enter a number");
//        Scanner scanner = new Scanner(System.in);
//        int [] array = new int[5];
//        for (int i = 0; i < array.length; i++){
//            int number = scanner.nextInt();
//            if(number >= 10 || number <= 100){
//                System.out.println(number);
//            }else{
//                System.out.println("not allowed");
//            }
//            System.out.println("enter a number");
////            Arrays.stream(array).toArray()
//        }

        Scanner input = new Scanner(System.in);
        int sid[] = new int[5];

        int count = 0;
        int x = 0;
        int num = 0;

        while (x < sid.length)
        {
            System.out.println("Enter number: ");
            num = input.nextInt();

            if ((num >= 10) && (num <= 100)) {
                boolean digit = false;
                x++;

                for (int i = 0; i < sid.length; i++)
                {   if (sid[i] == num)
                    digit = true;
                }

                if (!digit) {

                    sid[count] = num;

                    count++;

                }

                else

                    System.out.printf("the number was entered before \n");

            }

            else
                System.out.println("number must be between 10 and 100");


            for (int i =0;  i < x; i++) {
                System.out.print(sid[i] +" ");

            }

            System.out.println();
        }

    }
}
