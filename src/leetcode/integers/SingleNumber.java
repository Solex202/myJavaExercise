package leetcode.integers;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static void main(String[] args) {

    }

    public static int singleNumber(int [] arr){
        if(arr.length == 1){
            return arr[0];
        }

        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++){
            if(set.contains(arr[i])){
                set.remove(arr[i]);
            }else {
                set.add(arr[i]);
            }
        }

        return set.iterator().next();
    }
}
