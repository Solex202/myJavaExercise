package ChapterFourMain;

import java.util.Scanner;

public class TaxCalculatorDriver {

    public static void main(String[] args) {
        TaxCalculator taxCalculator = new TaxCalculator("adeola", 5600.00,840.00);
        Scanner scan = new Scanner(System.in);

        String name;
        double earning;

        int count = 0;
       while (count < 3){
            System.out.println("Enter name of citizen:");
            name = scan.nextLine();

            System.out.println("enter amount earned :");
             earning = scan.nextDouble();
             scan.nextLine();



        taxCalculator.setName(name);
        taxCalculator.setEarning(earning);
        taxCalculator.setTotalTax(earning);


            System.out.printf("The name of citizen is: %s%n", taxCalculator.getName());
            System.out.printf("amount earned is: %.2f%n ", taxCalculator.getEarning());

            System.out.printf("therefore,total tax is %.2f%n%n",taxCalculator.getTotalTax());

           count++;
        }
    }
}
