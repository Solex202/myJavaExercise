package ChapterSevenMain;

public class SalesCommission {

    public static void main(String[] args) {
        System.out.printf("%s%37s%n","SALARIES" ,"NUMBER OF SALESPERSON");
        int [] arr = {2,10,0,0,8,9,4,5,6};

        for (int counter = 0; counter < arr.length ; counter++) {
            if (counter == 8){
                System.out.printf("%s%d%s:\t\t\t","$",1000," and more");
            }
            else if (counter == 0){
                System.out.printf("%s%d-%d:\t\t\t\t", "$",counter + 200, counter + 299);
            }
        else if (counter == 1){
                System.out.printf("%s%d-%d:\t\t\t\t","$",counter * 300, counter * 300 + 99);
            }
        else if (counter == 2){
                System.out.printf("%s%d-%d:\t\t\t\t","$",counter * 200, counter * 200 + 99);
            }
        else if (counter == 3){
                System.out.printf("%s%d-%d:\t\t\t\t","$",(counter * 166 + 2), (counter * 166 + 2) + 99);
            }
        else if (counter == 4){
                System.out.printf("%s%d-%d:\t\t\t\t","$",counter * 150, counter * 150 + 99);
            }
        else if (counter == 5){
                System.out.printf("%s%d-%d:\t\t\t\t","$",counter * 140, counter * 140 + 99);
            }
        else if (counter == 6){
                System.out.printf("%s%d-%d:\t\t\t\t","$",counter * 133 + 2, (counter * 133 + 2) + 99);
            }
        else {
                System.out.printf("%s%d-%d:\t\t\t\t","$",(counter * 128 + 4), (counter * 128 + 4) + 99);
            }


           //System.out.println();
        for (int star  = 0; star  < arr[counter]; star ++) {
            System.out.print("*");

            //System.out.printf("%14s","*");
            //System.out.println();
        }
            System.out.println();
        }

    }
}
