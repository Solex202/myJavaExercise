package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTestTest {

    @Test
    void testCanAddTwoIntegers(){
        //given
        AddTwoIntegers adder = new AddTwoIntegers();
        //when
        int result = adder.add(5,6);
        //check
        assertEquals(11,result);
    }
    @Test
    void testCanAddTwoIntegersWithNegativeValue(){
        //given
        AddTwoIntegers adder = new AddTwoIntegers();
        //when
        int result = adder.add(5,-14);
        //check
        assertEquals(-9,result);
    }
    @Test
    void testCanMultiply(){
        //given
        AddTwoIntegers adder = new AddTwoIntegers();
        //when
        int result = adder.multiply(10,20);
        //assert
        assertEquals(200,result);
    }
        @Test
        void testCanSubtract(){
            //given
            AddTwoIntegers adder = new AddTwoIntegers();
            //when
            int result = adder.subtract(100,20);
            //assert
            assertEquals(80,result);
        }
    @Test
    void testCanDivide(){
        //given
        AddTwoIntegers adder = new AddTwoIntegers();
        //when
        int result = adder.divide(100,2);
        //assert
        assertEquals(50,result);
    }

    @Test
    void testCanDivide_Modulo(){
        //given
        AddTwoIntegers adder = new AddTwoIntegers();
        //when
        int result = adder.modulo(5,2);
        //assert
        assertEquals(1,result);
    }


}