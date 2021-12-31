package ChapterThree;

import java.util.Scanner;



public class InvoiceClass {


        private String partNumber;
        private String partDescription;
        private int quantityOfItem;
        private double pricePerItem;

        public InvoiceClass(String partNumber, String partDescription, int quantityOfItem, double pricePerItem){
                    this.partNumber = partNumber;
                    this.partDescription = partDescription;

            if (quantityOfItem > 0)
            this.quantityOfItem = quantityOfItem;

            if(pricePerItem > 0)
                    this.pricePerItem = pricePerItem;

        }

        public void setPartNumber(String partNumber){
            this.partNumber = partNumber;
        }

        public String getPartNumber(){
            return partNumber;
        }
        public void setPartDescription(String partDescription){
            this.partDescription = partDescription;
        }

         public  String getPartDescription(){
            return partDescription;
    }

        public void setQuantityOfItem(int quantityOfItem){
       this.quantityOfItem = quantityOfItem;
        }

        public int getQuantityOfItem(){
            return quantityOfItem;
        }

        public void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;
        }

        public double getPricePerItem(){
            return pricePerItem;
        }

        public double getInvoiceAmount(){
            return quantityOfItem * pricePerItem;
        }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        InvoiceClass invoiceClass = new InvoiceClass("4","menu",12,1200.0);




        System.out.println("enter part number:-");
        String partNum = scan.nextLine();
        System.out.println("Enter part description:-");
        String partDescription = scan.nextLine();
        System.out.println("Enter the quantity of item you want:-");
        int quantity = scan.nextInt();
        System.out.println("Enter the price per item:-");
        double price = scan.nextDouble();

        invoiceClass.setPartNumber(partNum);
        System.out.printf(" part number is: %s%n",invoiceClass.getPartNumber());
        System.out.println("-".repeat(29));
        invoiceClass.setPartDescription(partDescription);
        System.out.printf(" part description is: %s%n",invoiceClass.getPartDescription());
        System.out.println("-".repeat(29));
        invoiceClass.setQuantityOfItem(quantity);
        System.out.printf(" quantity of item is: %d%n",invoiceClass.getQuantityOfItem());
        System.out.println("-".repeat(29));
        invoiceClass.setPricePerItem(price);
        System.out.printf(" price per item: %.2f%n", invoiceClass.getPricePerItem());
        System.out.println("-".repeat(29));
        System.out.printf("Therefore,Invoice amount is: %.2f%n", invoiceClass.getInvoiceAmount());

    }

}
