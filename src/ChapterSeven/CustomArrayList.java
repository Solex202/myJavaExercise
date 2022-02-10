package ChapterSeven;

import java.util.ArrayList;

public class CustomArrayList {

    int size = 6;


    public void addElement(int[] productId, String[] productName, char[] productAvailability, double[] productPrice, float[] productRating) {
        ArrayList <Product> arr = new ArrayList<>();
        for(int i = 0; i < size; i++){

            arr.add(new Product(productId[i], productName[i],productAvailability[i], productPrice[i], productRating[i]));
        }

    }

//    public void displayElements(ArrayList<Product> arraylist)
//    {
//        System.out.println("Product ID" + "   Product Name" + "     Product Availability" + "    Product Price" + "   Product Rating");
//        System.out.println("-------------------------------------------------------------------------------------");
////iteration over the ArrayList for accessing the elements
//        for (int i = 0; i < size; i++)
//        {
////invoking the get() method of the ArrayList class to get the elements
//            Product product = arraylist.get(i);
////printing the elements to the console
//            System.out.println(   product.productId+"    "+  "    "  +product.productName+"               "+"  "+product.productAvailability+"                "+product.productPrice+ "           "+String.format("%.01f", product.productRating));
//        }
    //   }
}
