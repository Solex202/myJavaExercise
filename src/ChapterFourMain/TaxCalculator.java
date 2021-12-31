package ChapterFourMain;

public class TaxCalculator {



    private String name;
    private double earning;

    private double totalTax;

    public  TaxCalculator(String name, double earning , double totalTax ){
        this.name = name;
        this.earning = earning;
        this.totalTax = totalTax;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEarning() {
        return earning;
    }

    public void setEarning(double earning) {
        this.earning = earning;
    }

    public double getTotalTax() {
       // if(earning > 0 && earning < 30_000){
          // totalTax = earning * 0.15;
       // }
       // if(earning > 30_000){
          //  totalTax = earning * 0.20;
       // }

        return totalTax;
    }
    public void setTotalTax(double totalTax){
        if(earning <= 0) return;
                if( earning <= 30_000){
            totalTax = earning * 0.15;

        }
        if(earning > 30_000){
            totalTax = earning * 0.20;
                }
    this.totalTax = totalTax;
    }

}

