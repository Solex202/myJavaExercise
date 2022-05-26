package dataStructuresAndAlgorithms;

public class Insertion {

    public static void insertionSort(int[] array){
        for (int i = 1; i < array.length; i++) {
            int element = array[i];

            int j;
            for(j = i; j>0 && array[j-1] > element; j--){
                array[j] = array[j-1];
            }
            array[j] = element;
        }
        for (int j : array) {
            System.out.println(j);
        }
    }
}
