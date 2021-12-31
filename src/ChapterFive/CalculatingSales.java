package ChapterFive;

import java.util.Scanner;

public class CalculatingSales {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        double retailPrice = 0.00;
        double retailValue;


        System.out.println("--Enter product number--");
        int productNumber = scan.nextInt();

//        while (productNumber != -1) {
            while (productNumber > 5 || productNumber < 0) {
                System.out.println("Invalid product number");
                System.out.println();
                System.out.println("--Enter product number--");
                productNumber = scan.nextInt();
            }
            System.out.println("--Enter quantity sold--");
            int quantitySold = scan.nextInt();
            while (quantitySold < 0) {
                System.out.println("Quantity not recognized");
                System.out.println();
                System.out.println("Enter quantity sold");
                quantitySold = scan.nextInt();
            }

            switch (productNumber) {
                case 1:
                    retailPrice = 2.98;
//                retailValue = retailPrice * quantitySold;
                    break;
                case 2:
                    retailPrice = 4.50;
//                retailValue = retailPrice * quantitySold;
                    break;
                case 3:
                    retailPrice = 9.98;
//                retailValue = retailPrice * quantitySold;
                    break;
                case 4:
                    retailPrice = 4.49;
//                retailValue = retailPrice * quantitySold;
                    break;
                case 5:
                    retailPrice = 6.87;
//                retailValue = retailPrice * quantitySold;
                    break;
                default:
                    System.out.println("Invalid input");
            }

            retailValue = retailPrice * quantitySold;

            System.out.println(retailValue);


        }

    }


//}

 //while (productNumber > 5){
//             System.out.println("invalid input");
//             switch (productNumber){
//                 case 1:
//                     price = 2.98;
//                     break;
//                 case 2:
//                     price = 4.50;
//                     break;
//                 case 3:
//                     price = 9.98;
//                     break;
//                 case 4:
//                     price = 4.49;
//                     break;
//                 case 5:
//                     price = 6.87;
//                     break;
//             }




//             if(productNumber == 1){
//                 price = 2.98;
//             }
//             if(productNumber == 2){
//                 price = 4.50;
//             }
//             if(productNumber == 3){
//                 price = 9.98;
//             }
//             if(productNumber == 4){
//                 price = 4.49;
//             }
//             if(productNumber == 5){
//                 price = 6.87;
//             }
