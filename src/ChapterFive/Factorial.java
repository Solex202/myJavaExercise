package ChapterFive;

public class Factorial {

    public static void main(String[] args) {
        System.out.println("Numbers\t\t Factorial");
        int number = 5;
        for (int i = 1; i  <= number;i++){
            long factorial = 1;
            System.out.print( i + "\t\t\t\t");
            for (int j = i; j >= 1; j--) {
               // factorial *= i;
                System.out.print( j + "   ");
                factorial *= j;
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

