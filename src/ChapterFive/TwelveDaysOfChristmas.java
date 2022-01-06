package ChapterFive;

public class TwelveDaysOfChristmas {

    public static void main(String[] args) {
        for (int i = 1; i <= 12 ; i++) {
            System.out.print("\nOn the ");

            switch (i) {
                case 12 -> System.out.print("12th");
                case 11 -> System.out.print("11th");
                case 10 -> System.out.print("10th");
                case 9 -> System.out.print("9th");
                case 8 -> System.out.print("8th");
                case 7 -> System.out.print("7th");
                case 6 -> System.out.print("6th");
                case 5 -> System.out.print("5th");
                case 4 -> System.out.print("4th");
                case 3 -> System.out.print("3th");
                case 2 -> System.out.print("2nd");
                case 1 -> System.out.print("1st");
            }

            System.out.println(" day of christmas my true love gave to me,");
            for (int m = i; m >= 0 ; m--) {
                switch (m) {
                    case 12 -> System.out.println("Twelve drummers drumming");
                    case 11 -> System.out.println("Eleven pipers piping");
                    case 10 -> System.out.println("Ten lords are leaping");
                    case 9 -> System.out.println("Nine ladies dancing");
                    case 8 -> System.out.println("Eight maid are milking");
                    case 7 -> System.out.println("Seven swans are swimming");
                    case 6 -> System.out.println("Six geese are laying");
                    case 5 -> System.out.println("Five golden rings");
                    case 4 -> System.out.println("Four calling bird ");
                    case 3 -> System.out.println("Three french hen");
                    case 2 -> System.out.println("Two turtle dove \nand");
                    case 1 -> System.out.print("A partridge in a pear tree\n");
                }
               // if (m == 0)break;

            }
            System.out.println("=".repeat(52));
            System.out.println("=".repeat(52));
        }
    }
}
