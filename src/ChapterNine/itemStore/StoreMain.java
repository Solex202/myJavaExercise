package ChapterNine.itemStore;

import java.util.Scanner;

public class StoreMain {

    public static void main(String[] args) {


        ManageNativeItems manageNativeItems = new ManageNativeItems();
        Scanner input = new Scanner(System.in);

        checkOutItems(manageNativeItems, input);
    }

    public static void checkOutItems(ManageNativeItems manageNativeItems, Scanner input) {
        do {
            String format = """
                        
                        Enter 1 to capture Native Items
                        Enter 2 to  display all items purchased
                        Enter 3 to exit
                        """;
            System.out.println(format);
            int value = input.nextInt();

            switch (value){
                case 1:
                    manageNativeItems.captureItemInformation();
                    break;
                case 2:
                    manageNativeItems.getAllItemsPurchased();
                    manageNativeItems.getSumOfAllItemsPurchased();
                    break;
                case 3:
                    System.exit(3);
                    break;
            }
        }while (true);
    }


}



