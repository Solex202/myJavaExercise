package semicolon.africa.tddpractise;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticTest {

    Arithmetic arithmetic;

    @BeforeEach
    public void setUp(){
        arithmetic = new Arithmetic();
    }


    @Test
    public void testThat_I_CanAdd(){

        //given
//        Arithmetic arithmetic = new Arithmetic();
        //when
       int addition = arithmetic.addNumbers(6,3);
        //assert
        assertEquals(9, addition);
    }

    @Test
    public void testThat_I_CanSubtract(){
      //given that i have arithmetic
      //when
        int subtraction = arithmetic.subtractNumbers(6,3);
        //assert
        assertEquals(3,subtraction);
    }

    @Test
    public void testThat_I_CanMultiply(){
        //given that i have arithmetic
        //when
        int multiply = arithmetic.multiplyNumbers(6,3);
        //assert
        assertEquals(18,multiply);
    }

    @Test
    public void testThat_I_CanDivide(){
        //given that i have arithmetic
        //when
        double quotient = arithmetic.divideNumbers(6,3);
        //assert
        assertEquals(2,quotient);
    }

   @Test
    public void testThatWhenDivisor_IsZero_throwException(){
       //given that i have arithmetic
       //when
//       double quotient = arithmetic.divideNumbers(6,0);
       //assert
       assertThrows(ArithmeticException.class,()-> arithmetic.divideNumbers(6,0));
   }

}