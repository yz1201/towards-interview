package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/3/22 14:21
 */
@Slf4j
public class SmallestRangeI {
    public static void main(String[] args) {
        int[] nums = {1};
        System.out.println(smallestRangeI(nums, 0));
    }

    public static int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int maxDistance = nums[nums.length - 1] - nums[0];
        if (maxDistance <= k * 2)
            return 0;
        else
            return maxDistance - k * 2;
    }

    public static int smallestRangeICopy(int[] A, int K) {
        int min = A[0], max = A[0];
        for (int x : A) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        return Math.max(0, max - min - 2 * K);
    }

}
