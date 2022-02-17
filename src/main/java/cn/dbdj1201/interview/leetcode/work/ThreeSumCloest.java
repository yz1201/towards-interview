package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/2/17 10:00
 */
@Slf4j
public class ThreeSumCloest {
    public static void main(String[] args) {

    }

    public static int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        for (int i = 0; i < len - 2; i++) {
            int secTarget = target - nums[i];
            int minDistance = Integer.MAX_VALUE;
            for (int j = i + 1; j < len - 1; j++) {
//                if ()
                minDistance = Math.min(minDistance, target - nums[j] - nums[j + 1]);
            }
        }

        return -1;
    }
}
