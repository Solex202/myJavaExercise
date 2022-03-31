package chapterSeventeen;

import java.security.SecureRandom;
import java.util.stream.IntStream;

public class RandomCalculator {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
       int result =  random.ints(100,1,25).sum();
        System.out.println(result);
    }
}
