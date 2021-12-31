package ChapterFourMain;

import java.util.Scanner;

public class GasMileageDriver {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        GasMileage gasMill = new GasMileage(50, 6);

        int miles;
        int gallons;
        double total;
        System.out.println("Enter the amount of miles driven:");
        miles = scan.nextInt();

        System.out.println("Enter number of gallons being used:");
        gallons = scan.nextInt();


        while(miles > 0 && gallons > 0){
            gasMill.setMiles(miles);

            gasMill.setGallons(gallons);

            System.out.printf("Miles recorded is %d%n ", gasMill.getMiles());
            System.out.printf("Number of gallons used is %d%n", gasMill.getGallons());
            System.out.printf("Therefore,miles per gallon is %.2f%n", gasMill.milesPerGallon());
            System.out.printf("so,total of all miles per gallon is %.2f%n%n",gasMill.totalOfMilesPerGallon());

            System.out.println("Enter the amount of miles driven:");
            miles = scan.nextInt();

            System.out.println("Enter number of gallons being used:");
            gallons = scan.nextInt();

        }
    }



 }
