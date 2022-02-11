package chapterSix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    Kata kata;

    @BeforeEach
    public void setUp(){
        kata = new Kata();
    }
        @Test
        public void aGradeCanBeCalculatedTest(){
        char result = kata.calculateGradeFor(98);
            assertEquals('A', result);
        }

        @Test
       
        public void bGradeCanBeCalculatedTest(){
        char result = kata.calculateGradeFor(89);
            assertEquals('B',result);
        }

    @Test
    public void cGradeCanBeCalculatedTest(){
        char result = kata.calculateGradeFor(79);
        assertEquals('C',result);
    }

    @Test
    public void dGradeCanBeCalculatedTest(){
        char result = kata.calculateGradeFor(65);
        assertEquals('D',result);
    }

    @Test
    public void fGradeCanBeCalculatedTest(){
        char result = kata.calculateGradeFor(59);
        assertEquals('F',result);
    }

    @Test
    public void drillerTest(){
        int result = kata.calculateQuantityAgainstPriceFor(4,2000);
        assertEquals(8000,result);


    }

    @Test
    public void myDrillerTest(){
        int result = kata.calculateQuantityAgainstPriceFor(7,1800);
        assertEquals(12600,result);


    }
    @Test
    public void theDrillerTest(){
        int result = kata.calculateQuantityAgainstPriceFor(15,1600);
        assertEquals(24000,result);


    }
    @Test
    public void ourDrillerTest(){
        int result = kata.calculateQuantityAgainstPriceFor(30,1500);
        assertEquals(45000,result);


    }

    @Test
      public void forDrillerTest(){
        int result = kata.calculateQuantityAgainstPriceFor(55,1300);
        assertEquals(71500,result);


    }

    @Test
    public void fromDrillerTest(){
        int result = kata.calculateQuantityAgainstPriceFor(100,1200);
        assertEquals(120000,result);


    }
    @Test
    public void formDrillerTest(){
        int result = kata.calculateQuantityAgainstPriceFor(203,1100);
        assertEquals(223300,result);


    }

    @Test
    public void ofDrillerTest(){
        int result = kata.calculateQuantityAgainstPriceFor(500,1000);
        assertEquals(500000,result);


    }

    @Test
    public void arrayMinimumNumberCanBeCalculated(){
         // Kata kata = new Kata();
        int [] numbers ={1,2,3,4,5};
        int result = Kata.calMinimumOf(numbers);
        assertEquals(1, result);
    }

    @Test
    public void arrayMaximumNumberCanBeCalculated(){

            int [] numbers = {1,2,3,4,5};
            int result = Kata.calMaximumOf(numbers);
            assertEquals(5,result);
    }


   /* @Test
    public void arrayTotalCanBeCalculated(){
            int [] numbers = {1,2,3,4,5};
            int result = Kata.calTotalOf(numbers);
            assertEquals(15,result);
    }*/
}


