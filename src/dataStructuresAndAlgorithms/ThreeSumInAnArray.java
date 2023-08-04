package dataStructuresAndAlgorithms;

public class ThreeSumInAnArray {

    public static void main(String[] args) {
        int [] arr = {2,4,7,6,9,10,3};
        int target = 20;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++){
                for (int k = 0; k < arr.length; k++) {
                    if (arr[i] != arr[j] && arr[j]!= arr[k] && arr[i] != arr[k]){
                        int tempSum = arr[i] + arr[j] + arr[k];
                        if(tempSum == target){
                            System.out.println(tempSum);
                            break;
                        }
//                    System.out.println(arr[i] + arr[j] + arr[k]);
                    }
                }
            }
        }

    }
}
