package leetcode.arrays;

import java.util.PriorityQueue;

public class MaximalScore {
    public int maxScore(int[] nums, int loopCount) {

        PriorityQueue <Integer> heapPush = new PriorityQueue<>((a, b) -> b - a);

        for (int num : nums) {
            heapPush.offer(num);
            System.out.println(heapPush);
        }

        int sum = 0;
        for (int j = 0; j < loopCount ; j++) {
            int maxCount = heapPush.poll();
            sum  += maxCount;
            System.out.println("The sum is: " + sum);
            heapPush.offer((int) Math.ceil(maxCount/3.0));
        }
        return sum;
    }
}
