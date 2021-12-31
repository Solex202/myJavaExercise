package chapterSix;

public class Kata {
    public static int calMinimumOf(int[] numbers) {
        int minimumNumber = numbers[0];
        for (int number : numbers) {
            minimumNumber = Math.min(minimumNumber, number);
        }
        return minimumNumber;
    }

    public static int calMaximumOf(int[] numbers) {
        int maximumNumber = numbers[0];
        for (int number : numbers) {
            maximumNumber = Math.max(maximumNumber, number);

        }
        return maximumNumber;
    }

   /* public static int calTotalOf(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return
    }*/

    public char calculateGradeFor(int score) {
        if (score > 89) return 'A';
        if (score > 79) return 'B';
        if (score > 70) return 'C';
        if (score > 60) return 'D';
        return 'F';

    }


    public int calculateQuantityAgainstPriceFor(int quantity, int price) {
        if (quantity <= 4) {
            return quantity * price;
        }
        if (quantity <= 7) {
            return quantity * price;
        }
        if (quantity <= 15) {
            return quantity * price;
        }
        if (quantity <= 30) {
            return quantity * price;
        }
        if (quantity <= 55) {
            return quantity * price;
        }
        if (quantity <= 100) {
            return quantity * price;
        }

        if (quantity <= 203) {
            return quantity * price;
        }
        if (quantity <= 500) {
            return quantity * price;
        }
        return 0;
    }


    public static void multiDimensionalArray(int [] [] array){
        System.out.println("-".repeat(14));
        System.out.println("    Table");
        System.out.println("-".repeat(14));
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                //System.out.print("-".repeat(10));
                System.out.print(array[row][column] + " |  ");

            }
            System.out.println();
        }
        System.out.println("-".repeat(14));
    }

    public static void SevenSegmentDisplay(){

    }





    public static void main(String[] args) {
        int [] [] array = {{2,3,5},{1,4,7}};
        //int [] [] array= new int[3] [3];
        multiDimensionalArray(array);
    }
}


