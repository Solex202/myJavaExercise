package ChapterFive;

public class ValueOfPi {
    public static void main(String[] args) {

        double pi = 0;
        int numerator = 4;
        double denominator = 1;

        for (int i = 0; i < 200_000 ; i++) {

            if(i % 2 == 1){
                pi += -(numerator/denominator);
            }
            else{
                pi += (numerator / denominator);
            }
        denominator += 2;
            System.out.printf("(%d\\%.2f)%n", numerator, denominator);
            System.out.println("pi is" + pi);
        }
        System.out.println("final value of pi is" + pi);
    }
}
