package semicolon.africa.tddpractise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirclesClassTest {

    @Test
 void testThat_I_CanCalculateDiameterOf_A_Circle(){
        //given
        CirclesClass circle = new CirclesClass();
        //when
        double diameter = circle.calculateDiameter(8);
        //assert
        assertEquals(16,diameter);

    }
    @Test
    void testThat_I_CanCalculateCircumference(){
        //given
        CirclesClass circle = new CirclesClass();
        //when
        double circumference = circle.calculateCircumference(3.14,6);
        //assert
        assertEquals(37.68,circumference);
    }

    @Test
    void testThat_I_CanCalculateArea(){
     //given
     CirclesClass circle = new CirclesClass();
     //when
        double area = circle.calculateArea(3.14,Math.sqrt(7));
        //assert
        assertEquals(153.86,area);
    }
}