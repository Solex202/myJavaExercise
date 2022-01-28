package ChapterSeven;

public class BarChart {

    public static void main(String[] args) {
        int[] arr = {0, 0 , 0, 0 , 0 , 0, 1, 2, 4, 2, 1};

        System.out.println("Grade distribution:");
        for (int counter = 0; counter < arr.length; counter++) {

       if(counter == 10){
           System.out.printf("%7d:  ", 100);
       }
       else{
           System.out.printf("%02d - %02d:  ", counter * 10, counter * 10 + 9);
       }
            for (int star = 0; star < arr[counter]; star++) {
                System.out.print("*");


            }
                System.out.println();

        }

    }
}
