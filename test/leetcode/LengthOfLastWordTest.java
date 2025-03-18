package leetcode;

import leetcode.arrays.LengthOfLastWordInAString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.Assert.assertEquals;

class LengthOfLastWordTest {

    @ParameterizedTest
    @CsvSource({
            "Hello World, 5",
            "Hello World , 5",
            " Hello World, 5",
            " Hello World , 5",})
    void testLengthOfLastIsReturnedSuccessfully(String input, int expected) {
        LengthOfLastWordInAString lengthOfLastWord = new LengthOfLastWordInAString();
        int result = lengthOfLastWord.lengthOfLastWord(input);
        Assertions.assertEquals(expected, result);
    }

    @Test
    void testLengthIsZeroWhenStringIsEmpty() {
        LengthOfLastWordInAString lengthOfLastWord = new LengthOfLastWordInAString();
        int result = lengthOfLastWord.lengthOfLastWord2("");
        Assertions.assertEquals(0, result);
    }

    @Test
    void testLengthIsZeroWhenStringIsNull() {
        LengthOfLastWordInAString lengthOfLastWord = new LengthOfLastWordInAString();
        int result = lengthOfLastWord.lengthOfLastWord2(null);
        Assertions.assertEquals(0, result);
    }
}
