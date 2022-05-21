package dataStructuresAndAlgorithms;

import java.util.HashSet;
import java.util.Set;

public class RemovingDuplicateFromAnArray {

    public static void main(String[] args) {
        int [] array = {1,1,2,3,3,4,5,5,6,7};
        Set<Integer> arrays = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            arrays.add(array[i]);

        }
        System.out.println(arrays);
    }
}
