package ChapterEight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleClassTest {

    @Test
    void testThatRectangleAreaCanBeCalculated() {
        RectangleClass rect = new RectangleClass(3.0, 6.0);
        double area = rect.calculateArea();
        assertEquals(area, 18.0);
    }

    @Test
    void testThatNegativeValue_ThrowException() {
        RectangleClass rect = new RectangleClass();

        rect.setWidth(6.0);
        assertThrows( IllegalStateException.class, ()->rect.setLength(-3.0));
    }

    @Test
    void testThatRectangleCanCalculatePerimeter() {
        //given
        RectangleClass rect = new RectangleClass();
        //when
        rect.setWidth(4.0);
        rect.setLength(5.0);
         double perimeter = rect.calculatePerimeter();
         //assert
        assertEquals(perimeter,18.00);
    }

    @Test
    void setWidth() {
    }
}