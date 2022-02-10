package ChapterSeven;

public class ProductMain {

    public static void main(String[] args) {
        int [] productId  = {21823, 89774, 34007, 12098, 10067,65490};
        String [] productName = {"Hp Laptop","Inverters","Volats AC","iPhone","canonDSRL","sonyLEDTV"};
        char [] productAvailability = {'Y','Y','N','Y','Y','N'};
        double [] productPrice = {31987, 16900, 28000, 99000, 67570, 60500};
        float [] productRating = {4.5f, 4.0f, 4.7f, 4.5f, 3.9f, 4.0f};

        CustomArrayList CustomArrayList = new CustomArrayList();
        CustomArrayList.addElement(productId, productName,productAvailability,productPrice,productRating);

    }



}
