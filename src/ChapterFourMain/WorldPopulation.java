package ChapterFourMain;

import java.math.BigDecimal;

public class WorldPopulation {
    public static void main(String[] args) {
        System.out.println("YEAR" +"\t\t" + "CURRENT WORLD POPULATION" + "\t\t" + "NUMERICAL INCREASE YEARLY");

        double currentPopulation = 7_900_000_000.00;
        double worldPopulation = 7_900_000_000.00;

        for (int year = 1; year <= 75 ; year++) {
           // System.out.printf("%d %30f",year, currentPopulation);
//            System.out.print(year + "\t\t\t" + currentPopulation + "\t\t\t\t");
            System.out.printf("%d\t\t\t%.2f\t\t\t\t\t",year, currentPopulation);
                currentPopulation += (currentPopulation * 0.0105);
            System.out.printf("%.2f%n", currentPopulation);
//

            if (worldPopulation * 2 == currentPopulation){
                System.out.printf("doubled pop is: %f", currentPopulation);
            }else{
                System.out.println("none");
            }

        }

    }

//         for (int year = 1; year <= 75 ; year++) {
//        // System.out.printf("%d %30f",year, currentPopulation);
//        System.out.print(year + "\t\t\t" + currentPopulation + "\t\t\t\t");
//        currentPopulation += (currentPopulation * 0.0105);
//           System.out.printf("%d\t%f\t%f%n",year, currentPopulation, currentPopulation);
//        System.out.println(currentPopulation);
//        // System.out.printf("%f", currentPopulation);
//
//
//    }
}
