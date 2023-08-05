package leetcode.integers;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

    public static void main(String[] args) {
        int input = 15;
        List<String> result = fizzBuzz(input);
        System.out.println(result);
    }

    public static List<String> fizzBuzz(int input){
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= input; i++){
            if(i % 3 == 0 && i % 5 == 0){
                list.add("Fizzbuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            }else {
                list.add(Integer.toString(i));
            }
        }

        //TODO: nested tenary operation

        return list;
    }
}
