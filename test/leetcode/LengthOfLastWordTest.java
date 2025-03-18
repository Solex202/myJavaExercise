package leetcode;

import leetcode.arrays.LengthOfLastWordInAString;
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
    void testLengthOfLastIsReturnedSuccessfully1(String input, int expected) {
        LengthOfLastWordInAString lengthOfLastWord = new LengthOfLastWordInAString();
        int result = lengthOfLastWord.lengthOfLastWord(input);
        assertEquals(expected, result);
    }

    @Test
    void testLengthIsZeroWhenStringIsEmpty() {
        LengthOfLastWordInAString lengthOfLastWord = new LengthOfLastWordInAString();
        int result = lengthOfLastWord.lengthOfLastWord2("");
        assertEquals(0, result);
    }

    @Test
    void testLengthIsZeroWhenStringIsNull() {
        LengthOfLastWordInAString lengthOfLastWord = new LengthOfLastWordInAString();
        int result = lengthOfLastWord.lengthOfLastWord2(null);
        assertEquals(0, result);
    }
}
