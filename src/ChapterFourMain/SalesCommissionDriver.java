package ChapterFourMain;

import java.util.Scanner;

public class SalesCommissionDriver {

    public static void main(String[] args) {
        SalesCommissionCalculator salesCommissionCalculator = new SalesCommissionCalculator(1, 239.99);

        Scanner scan = new Scanner(System.in);

        //System.out.println("Enter number of item(s):");
        int items = 0;

        //System.out.println("Enter value of each item(s) sold:");
        double value =0;

      //  for (int counter = 0; counter < 4; counter++) {

            int count =0;
            while(count < 4) {

                System.out.println("Enter number of item(s):");
                items = scan.nextInt();

                System.out.println("Enter value of each item(s) sold:");
                value = scan.nextDouble();
                // System.out.println(counter);
                salesCommissionCalculator.setItems(items);
                salesCommissionCalculator.setValues(value);


                System.out.printf("Number of item(s) is/are  is %d%n", salesCommissionCalculator.getItems());

                System.out.printf("Value of item(s) is/are %.2f%n", salesCommissionCalculator.getValues());

                System.out.printf("sales person's  earning is %.2f%n", salesCommissionCalculator.getSalesPersonsEarning());

                System.out.printf("Therefore sales person's weekly earning is %.2f%n", salesCommissionCalculator.getWeeklyEarning());



                count++;
            }
        }


}