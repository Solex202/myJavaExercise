package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditionTestTest {

    AddTwoIntegers adder;
    @BeforeEach
    public void setUp(){
        adder = new AddTwoIntegers();
    }
    @Test
    void testCanAddTwoIntegers(){

        //when
        int result = adder.add(5,6);
        //check
        assertEquals(11,result);
    }
    @Test
    void testCanAddTwoIntegersWithNegativeValue(){

        //when
        int result = adder.add(5,-14);
        //check
        assertEquals(-9,result);
    }
    @Test
    void testCanMultiply(){

        //when
        int result = adder.multiply(10,20);
        //assert
        assertEquals(200,result);
    }
        @Test
        void testCanSubtract(){

            //when
            int result = adder.subtract(100,20);
            //assert
            assertEquals(80,result);
        }
    @Test
    void testCanDivide(){

        //when
        int result = adder.divide(100,2);
        //assert
        assertEquals(50,result);
    }

    @Test
    void testCanDivide_Modulo(){

        //when
        int result = adder.modulo(5,2);
        //assert
        assertEquals(1,result);
    }


}