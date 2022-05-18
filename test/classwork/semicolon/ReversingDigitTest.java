package classwork.semicolon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversingDigitTest {

    @Test
    void testThatNumberCanBeReversed(){
        ReversingDigit reversingDigit = new ReversingDigit();
        String result = reversingDigit.reverse("cohort_nine");

        assertEquals(result, "enin_trohoc");
    }

}