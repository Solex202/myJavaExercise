package ChapterSeven;

public class Product {

    private int productId;
    private char productAvailability;
    private double productPrice;
    private float productRating;

    public Product(int productId, String s, char productAvailability, double productPrice, float productRating){
        this.productId = productId;
        this.productAvailability = productAvailability;
        this.productPrice = productPrice;
        this.productRating = productRating;
    }

}
