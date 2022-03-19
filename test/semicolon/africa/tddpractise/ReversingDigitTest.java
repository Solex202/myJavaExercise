package semicolon.africa.tddpractise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversingDigitTest {

    @Test
    public void testDigitCanBeReversed(){
        //given
        Digit digit = new Digit();
        //when
        String reversal = digit.reverse("1234");
        //assert
        assertEquals(reversal,"4321");

    }

}