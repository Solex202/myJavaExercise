package semicolon.africa.tddpractise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeperatingDigitTest {

    @Test
    void testThat_I_CanSeparateDigit(){
        //given
        SeparatingDigit digit = new SeparatingDigit();
        //when
        digit.setDigit("34567");
        String expected = ("3 4 5 6 7");
        //assert
        assertEquals(expected, digit.getDigit());
    }



}