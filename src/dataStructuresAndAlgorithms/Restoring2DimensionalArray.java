package dataStructuresAndAlgorithms;

import java.util.Arrays;

public class Restoring2DimensionalArray {

    public static void main(String[] args) {

//        int[][] arr = {{1,2,3},{5,6},{7}};
//        StringBuilder  newArr= new StringBuilder();
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                newArr.append(arr[i][j]);
//            }
//        }
//
//        System.out.println(newArr);
//        String arr2 = new String(newArr);
//        String [] newArray ;
//        newArray = arr2.split("");
//        System.out.println(Arrays.toString(newArray));

        int[][] arr = {{1,2,3},{5,6},{7}};
        int[] newArr = new int[6];

        for (int i = 0; i < arr.length; i++) {
            int num =0;
            for (int j = 0; j < arr[i].length; j++) {
                num = arr[i][j];

                for (int k = 0; k < newArr.length; k++) {
                    if (newArr[k] == 0) {
                        newArr[k] = num;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
