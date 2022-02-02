package ChapterNine.itemStore;

public class ItemsInNative {

    private String itemName;
    private int itemQuantity;
    private double itemAmount;

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemQuantity() {
        return itemQuantity;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public double getItemAmount() {
        return itemAmount;
    }

    public void setItemAmount(double itemAmount) {
        this.itemAmount = itemAmount;
    }

    public double getTotalAmountForItem() {
        double totalAmountForItem = itemAmount * itemQuantity;
        return totalAmountForItem;
    }
}