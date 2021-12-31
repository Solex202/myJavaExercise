package ChapterFourMain;

public class TabularOutput {

    public static void main(String[] args) {

        System.out.println("N\t\t10*N\t\t100*N\t\t1000*N");

        for (int n = 1; n <= 5 ; n++) {
            System.out.print(n + "\t\t" + n*10 +"\t\t    " + n*100 + "\t\t    " + n*1000);
            System.out.println();
        }
    }



}
