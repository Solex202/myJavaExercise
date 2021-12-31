package ChapterFourMain;

public class GasMileage {

    private int miles;
    private int gallons;
    private double total = 0;

    public GasMileage(int miles, int gallons){
        if(miles > 0){

        this.miles = miles;
        }
        if(gallons > 0) {
            this.gallons = gallons;
        }
    }

    public void setMiles(int miles){
        this.miles = miles;
    }


    public int getMiles(){
        return miles;
    }

    public void setGallons(int gallons){
        this.gallons = gallons;
    }

    public int getGallons(){
        return gallons;
    }

     public double milesPerGallon(){

        return (double) miles / gallons;
      }
    public double totalOfMilesPerGallon(){

        
        return total += milesPerGallon();
                
    }

}
