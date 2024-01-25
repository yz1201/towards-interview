package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2024/1/19 10:14
 */
@Slf4j
public class S2784 {

    public boolean isGood(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int maxNum = nums[n - 1];
        if (n != maxNum + 1) return false;
        for (int i = 0; i < n; i++) {
            if (i == n - 1) return true;
            if (nums[i] != i + 1) {
                return false;
            }
        }
        return true;
    }

}
