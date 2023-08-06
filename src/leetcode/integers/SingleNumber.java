package leetcode.integers;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static void main(String[] args) {

        int [] arr = {2,1,1,2,4,5,4,6};
        int result = singleNumber(arr);
        System.out.println(result);
    }

    public static int singleNumber(int [] arr){
        if(arr.length == 1){
            return arr[0];
        }

        Set<Integer> set = new HashSet<>();
        for (int j : arr) {
            if (set.contains(j)) {
                set.remove(j);
            } else {
                set.add(j);
            }
        }

        return set.iterator().next();
    }
}
