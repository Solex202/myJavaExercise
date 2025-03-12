package leetcode;

import leetcode.arrays.MaxCountOfPositiveAndNegativeNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MaxCountOfPositiveAndNegativeTest {

    @Test
    void testThatMaxCountOfPositiveAndNegativeCanBeCounted(){
        MaxCountOfPositiveAndNegativeNumber maxCountOfPositiveAndNegative = new MaxCountOfPositiveAndNegativeNumber();
        int [] arr = {-1, 2, 3, -4, 5, 6, -7, 8, -9, 10};
        int result = maxCountOfPositiveAndNegative.maxCountOfPositiveAndNegative(arr);

        Assertions.assertEquals(6, result);
    }

    @Test
    void testThatMaxCountOfPositiveAndNegativeIsZeroWhenArrayIsEmpty(){
        MaxCountOfPositiveAndNegativeNumber maxCountOfPositiveAndNegative = new MaxCountOfPositiveAndNegativeNumber();
        int [] arr = {};
        int result = maxCountOfPositiveAndNegative.maxCountOfPositiveAndNegative(arr);

        Assertions.assertEquals(0, result);
    }

    @Test
    void testThatMaxCountOfPositiveAndNegativeIsZeroWhenArrayContainsOnlyZeroElement(){
        MaxCountOfPositiveAndNegativeNumber maxCountOfPositiveAndNegative = new MaxCountOfPositiveAndNegativeNumber();
        int [] arr = {0, 0, 0, 0};
        int result = maxCountOfPositiveAndNegative.maxCountOfPositiveAndNegative(arr);

        Assertions.assertEquals(0, result);
    }
}
