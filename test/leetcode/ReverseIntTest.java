package leetcode;

import leetcode.arrays.ReverseInt;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseIntTest {

    @Test
    void testThatReverseIntCanBeCalculated(){
        ReverseInt reverseInt = new ReverseInt();
        int result = reverseInt.reverseInt2(123);

        Assertions.assertEquals(321, result);
    }

    @Test
    void testThatReverseIntCanBeCalculatedWhenNumberIsNegative(){
        ReverseInt reverseInt = new ReverseInt();
        int result = reverseInt.reverseInt2(-123);

        Assertions.assertEquals(-321, result);
    }
}
