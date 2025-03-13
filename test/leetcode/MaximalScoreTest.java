package leetcode;

import leetcode.arrays.MaximalScore;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

class MaximalScoreTest {


    @Test
    void testThatMaximalScoreCanBeCalculated(){
        MaximalScore maximalScore = new MaximalScore();
        int [] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int result = maximalScore.maxScore(nums,3);

        assertEquals(24, result);
    }

    @Test
    void testThatMaximalScoreCanBeCalculatedWhenArrayContainsNegativeValues(){
        MaximalScore maximalScore = new MaximalScore();
        int [] nums = {-1, 2, -3, -4, -5, -6, -7, -8, -9};
        int result = maximalScore.maxScore(nums,3);

        assertEquals(4, result);
    }

    @Test
    void testThatMaximalScoreCanBeCalculatedWhenArrayContainsNegativeValuesAndZero(){
        MaximalScore maximalScore = new MaximalScore();
        int [] nums = {-1, 2, -3, -4, -5, -6, -7, -8, -9, 0};
        int result = maximalScore.maxScore(nums,3);

        assertEquals(4, result);
    }

    @Test
    void testThatMaximalScoreCanBeCalculatedAndResultIsZeroWhenArrayContainsOnlyZero(){
        MaximalScore maximalScore = new MaximalScore();
        int [] nums = {0,0,0,0,0,0,0,0,0};
        int result = maximalScore.maxScore(nums,3);

        assertEquals(0, result);
    }

    @Test
    void testThatMaximalScoreCanBeCalculatedAndResultIsZeroWhenArrayIsEmpty(){
        MaximalScore maximalScore = new MaximalScore();
        int [] nums = {};
        int result = maximalScore.maxScore(nums,3);

        assertEquals(0, result);
    }
}
