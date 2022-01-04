package ChapterFive;

public class SelfReviewExercises {

    public static void main(String[] args) {
        //sum of odd integers
        int total = 0;
        for (int i = 1; i <= 99 ; i+= 2) {
            System.out.println(i);
           total += i;
        }
        System.out.println("Total of all odd numbers between 1 and 99 is " + total + "\n\n");

        //calculating sum using math.power
       double number = Math.pow(2.5,3);
        System.out.println(number);
        System.out.println();

        //print integers between 1 & 20
        int i = 1;

        while (i <= 20){
            System.out.println(i);
            if(i % 5 == 0)
                System.out.println();
                else
                System.out.println('\t');
            ++i;
        }

        for (double j = 0.1; j < 5.0 ; j++) {
            System.out.println(j);
            
        }
        System.out.println();
//even numbers from 2 to 100
   int counter = 2;
        do{
            System.out.println(counter);
            counter += 2;
        }while ( counter <= 100);
    }
}
