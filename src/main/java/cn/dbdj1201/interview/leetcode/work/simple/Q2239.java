package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/8/8 21:35
 */
@Slf4j
public class Q2239 {

    public int findClosestNumber(int[] nums) {
        if (nums.length <= 1) return nums[0];
        Arrays.sort(nums);
        int len = nums.length;
        if (nums[0] >= 0) return nums[0];
        if (nums[len - 1] <= 0) return nums[len - 1];

//        int midIndex = len / 2;
//        for (int i = midIndex; i == 1; i /= 2) {
//            if (nums[midIndex])
//
//
//        }

        /*
        二分法找0，但数组中未必有目标值，只能遍历吗？
         */

        return -1;
    }

    public int findClosestNumberCopy(int[] nums) {
        int res = nums[0];
        for (int n : nums) {
            if (Math.abs(n) == Math.abs(res))
                res = Math.max(n, res);
            else if (Math.abs(n) < Math.abs(res))
                res = n;
        }
        return res;
    }
}
