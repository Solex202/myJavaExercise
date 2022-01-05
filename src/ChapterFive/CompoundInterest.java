package ChapterFive;

public class CompoundInterest {
    public static void main(String[] args) {

        double amount;
        double principal = 1000.0;
       // double rate = 0.05 - 0.10;


        System.out.printf("%s%25s%25s %n", "Year","interest rate", "Amount on deposit");


        for (int year = 1; year <= 10; year++) {
            for (int rate = 5 ; rate <= 10; rate++) {


                amount = principal * Math.pow(1.0 + (rate*0.01), year);


                System.out.printf("%2d%20d%25.2f%n", year,rate, amount);
            }
        }
    }
}