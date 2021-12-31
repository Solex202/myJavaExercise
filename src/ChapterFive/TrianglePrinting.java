package ChapterFive;

public class TrianglePrinting {

    public static void main(String[] args) {

        for (int i = 6; i >= 1 ; i--) {
            for (int j = 6; j > i; j--) {

            System.out.print( j);
            }
            System.out.println();
        }
    }

}
