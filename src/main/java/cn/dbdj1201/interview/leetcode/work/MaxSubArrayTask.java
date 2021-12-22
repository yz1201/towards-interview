package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2021/12/22 9:21
 */
@Slf4j
public class MaxSubArrayTask {

    public static void main(String[] args) {
        int[] nums = {-1,-3,2,-1,5,3,-8,1};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
