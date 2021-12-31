package chapterSix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinMaxTest {


        @Test
    public void canFindMinMax(){
            //given
            MinMax minmax = new MinMax();
            //when
            String minMax = minmax.findMinMax(5,9,-10);
            //assert
            assertEquals("-10,9", minMax);
        }


}
