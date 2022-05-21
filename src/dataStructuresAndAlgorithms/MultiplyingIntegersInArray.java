package dataStructuresAndAlgorithms;

public class MultiplyingIntegersInArray {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        int value = 1;

        for (int i = 0; i < arr.length; i++) {
            value *= arr[i];
        }

        System.out.println(value);
    }
}
