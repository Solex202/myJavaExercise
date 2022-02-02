package ChapterNine.itemStore;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageNativeItems {

    ArrayList<ItemsInNative> nativeListInfo = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    public void captureItemInformation(){
        ItemsInNative nativeItems = new ItemsInNative();

        System.out.println("What did he buy");
        String itemName = input.next();
        input.nextLine();


        System.out.println("Enter quantity of items");
        int itemQuantity = input.nextInt();

        System.out.println("Enter the amount for item");
        double itemAmount = input.nextDouble();

        nativeItems.setItemName(itemName);
        nativeItems.setItemQuantity(itemQuantity);
        nativeItems.setItemAmount(itemAmount);
        nativeListInfo.add(nativeItems);
    }


    public void getAllItemsPurchased(){
        System.out.println("         JOELO AND SONS ENTERPRISE");
        System.out.println("=".repeat(61));
        System.out.println("ITEM NAME:    ITEM QUANTITY:    ITEM AMOUNT:    AMOUNT TO PAY");
        System.out.println();
        for (ItemsInNative natives : nativeListInfo){
            System.out.printf("%s%13d%20.2f%22.2f",natives.getItemName(),
                    natives.getItemQuantity(),natives.getItemAmount(),natives.getTotalAmountForItem());
            System.out.println();
        }

    }
    public void getSumOfAllItemsPurchased(){
        double sum =0;
        for (ItemsInNative sumTotal : nativeListInfo){
            sum = sum + sumTotal.getTotalAmountForItem();
        }
        System.out.println();
        System.out.println("Total of all items purchased is "+sum);
    }
}


