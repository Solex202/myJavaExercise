package ChapterFive;

public class ProductOfInteger {


    public static void main(String[] args) {
        int product = 1;
        for (int number = 1; number <=5 ; number++) {
            if(number % 2 != 0)
                product = product * number;

        }
        System.out.println(product);
    }
}
