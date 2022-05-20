package classwork.semicolon;

import java.security.SecureRandom;
import java.util.Arrays;

public class FillingAnArray {

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int [][][]  arrays = new int[2][2][2];

        for (int array = 0; array < arrays.length; array++) {
            for (int row = 0; row < arrays[array].length ; row++){
                for (int column = 0; column < arrays[array][row].length; column++) {
                    arrays[array][row][column] = 10 + random.nextInt(40);

                    System.out.print(Arrays.asList(arrays[array][row][column]));
                }
            }

        System.out.println();
        }
        System.out.println();
    }
}
