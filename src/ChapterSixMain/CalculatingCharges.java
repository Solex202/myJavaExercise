package ChapterSixMain;

import java.util.Scanner;

public class CalculatingCharges {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of hours");
        int hour = scan.nextInt();
        double total = 0.00;

        while (hour != -1){
            if (hour < 1) {
                System.out.println("invalid, enter valid input");
                hour = scan.nextInt();
            }else {
                total += calculateCharges(hour);
                System.out.println("charges is  " + calculateCharges(hour));
                System.out.println("enter number of hours");
                hour = scan.nextInt();
            }


        }
        System.out.printf("total of yesterday receipt %.2f", total);

    }




    public static double calculateCharges(int hour){

        double charges = 0.00;

            if(hour <= 3){
                charges = 2.00;
            }
            if(hour > 3){
                int extraHours = hour - 3;
           charges = (0.5 * extraHours) + 2;
            }
            if(hour == 24){
              charges = 10;
            }
       return charges;
        }


    }


