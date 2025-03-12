package leetcode.arrays;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MaxCountOfPositiveAndNegativeNumber {
    public int maxCountOfPositiveAndNegative(int[] arr) {
        int maxCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        for (int number : arr) {
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
        }

        maxCount = Math.max(positiveCount, negativeCount);
        System.out.println("The max count is: " + maxCount);
        return maxCount;
    }
}
