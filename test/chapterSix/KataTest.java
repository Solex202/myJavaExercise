package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
        @Test
        public void aGradeCanBeCalculatedTest(){
            Kata kata = new Kata();
            char result = kata.calculateGradeFor(98);
            assertEquals('A', result);
        }

        @Test
       
        public void bGradeCanBeCalculatedTest(){
            Kata kata = new Kata();
            char result = kata.calculateGradeFor(89);
            assertEquals('B',result);
        }

    @Test
    public void cGradeCanBeCalculatedTest(){
        Kata kata = new Kata();
        char result = kata.calculateGradeFor(79);
        assertEquals('C',result);
    }

    @Test
    public void dGradeCanBeCalculatedTest(){
        Kata kata = new Kata();
        char result = kata.calculateGradeFor(65);
        assertEquals('D',result);
    }

    @Test
    public void fGradeCanBeCalculatedTest(){
        Kata kata = new Kata();
        char result = kata.calculateGradeFor(59);
        assertEquals('F',result);
    }

    @Test
    public void drillerTest(){
        Kata kata = new Kata();
        int result = kata.calculateQuantityAgainstPriceFor(4,2000);
        assertEquals(8000,result);


    }

    @Test
    public void myDrillerTest(){
        Kata kata = new Kata();
        int result = kata.calculateQuantityAgainstPriceFor(7,1800);
        assertEquals(12600,result);


    }
    @Test
    public void theDrillerTest(){
        Kata kata = new Kata();
        int result = kata.calculateQuantityAgainstPriceFor(15,1600);
        assertEquals(24000,result);


    }
    @Test
    public void ourDrillerTest(){
        Kata kata = new Kata();
        int result = kata.calculateQuantityAgainstPriceFor(30,1500);
        assertEquals(45000,result);


    }

    @Test
      public void forDrillerTest(){
        Kata kata = new Kata();
        int result = kata.calculateQuantityAgainstPriceFor(55,1300);
        assertEquals(71500,result);


    }

    @Test
    public void fromDrillerTest(){
        Kata kata = new Kata();
        int result = kata.calculateQuantityAgainstPriceFor(100,1200);
        assertEquals(120000,result);


    }
    @Test
    public void formDrillerTest(){
        Kata kata = new Kata();
        int result = kata.calculateQuantityAgainstPriceFor(203,1100);
        assertEquals(223300,result);


    }

    @Test
    public void ofDrillerTest(){
        Kata kata = new Kata();
        int result = kata.calculateQuantityAgainstPriceFor(500,1000);
        assertEquals(500000,result);


    }




}


