package ChapterFive;

public class TrianglePrintingProgram {

    public static void main(String[] args) {

        /**
         * triangle printing program
         */
        int n = 10;
        for (int row = 1; row <= n; row++) {       //for A
            for (int column = 1; column <= row; column++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            System.out.println();

            for (int row = 1; row <= n; row++) {
                for (int column = row; column <= n; column++) {     //for B
                    System.out.print("* ");

                }
                System.out.println();
            }
            System.out.println();
//        for (int i = n; i >= 1 ; i--) {
//            for (int j = i; j <= n ; j++) {  //for B
//                System.out.print("* ");
//            }
//            System.out.println();
            for (int row = 1; row <= n; row++) {
                for (int column = 1; column <= row; column++) {  //for C
                     System.out.print(" *");
                }
                for (int column = row; column <= n; column++) {
                    System.out.print("* ");

                }
                System.out.println();
            }
        System.out.println();
//        }
            for (int row = 1; row <= n; row++) {
                for (int column = row; column <= n; column++) {   //for D
                    System.out.print("  ");
                }
                for (int column = 1; column <= row; column++) {
                    System.out.print(" *");
                }
                System.out.println();
            }

    }
}