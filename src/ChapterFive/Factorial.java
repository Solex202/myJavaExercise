package ChapterFive;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Numbers\t\t Factorial");
        int number = 5;
        for (int numbers = 1; numbers  <= number;numbers++){
            long factorial = 1;
            System.out.print( numbers + "\t\t");
            for (int i = numbers; i >= 1; i--) {
               // factorial *= i;
                System.out.print( i + "     ");
                factorial *= i;
            }
            System.out.print(factorial);

            System.out.println();
        }
        //int number = 5;
       // long factorial =1;
       // for (int i = 1; i <= number; i++) {
          //  factorial *= i;

        }
       // System.out.println("factorial of  "  +  number +  " is " + factorial);
    }

