package FamilySomething;

public class Husband {
    private Wife iyawo;

    public Husband(Wife wife){
        iyawo = wife;
    }

    public void askWifeToCook(String cookWhat){
        display("begging my wife to cook");
        switch(cookWhat){
            case "Indomie":
                display("Get lost");
                break;
        default:iyawo.cook();
        }
    }
   public static void display(String message) {
       System.out.println(message);
   }

}
