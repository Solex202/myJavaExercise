package leetcode;

import leetcode.arrays.LengthOfLastWordInAString;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class LengthOfLastWordTest {

    @Test
     void testLengthOfLastIsReturnedSuccessfully() {
        LengthOfLastWordInAString lengthOfLastWord = new LengthOfLastWordInAString();
        int result = lengthOfLastWord.lengthOfLastWord("Hello World");
        assertEquals(5, result);
    }


    @Test
    void testLengthOfLastIsReturnedSuccessfullyWhenStringHasExtraSpaces() {
        LengthOfLastWordInAString lengthOfLastWord = new LengthOfLastWordInAString();
        int result = lengthOfLastWord.lengthOfLastWord("Hello World ");
        assertEquals(5, result);
    }
}
