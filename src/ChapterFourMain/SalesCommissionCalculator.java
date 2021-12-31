package ChapterFourMain;

public class SalesCommissionCalculator {

    private int items;
    private double values;
    private double total = 0;

    public SalesCommissionCalculator(int items, double values){
        if (items > 0){
        this.items = items;
        }
        if(values > 0){
        this.values = values;
        }
    }


    public int getItems() {
        return items;
    }

    public void setItems(int items) {
        this.items = items;
    }

    public double getValues() {
        return values;
    }

    public void setValues(double values) {
        this.values = values;
    }

    public double getSalesPersonsEarning(){
        int weeklySalary = 200;
        return  (0.09 * values)  + weeklySalary;
    }

    public double getWeeklyEarning(){
        return total += getSalesPersonsEarning();
    }

}
//integers can overflow[