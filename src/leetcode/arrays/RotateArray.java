package leetcode.arrays;

import java.util.ArrayList;
import java.util.List;

public class RotateArray {
    public static void main(String[] args) {
        int [] arr = {2,1,3,5};
        rotateArray(arr, 2);
//        System.out.println(res);
    }
    public static void rotateArray(int [] array, int step){

        List<Integer> rot = new ArrayList<>();

        for (int i = array.length-1; i >= 0; i--) {
            rot.add(array[i]);
        }

//        int [] arr =
//
//        System.out.println(rot);

    }
}
