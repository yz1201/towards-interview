package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/11/16 10:22
 */
@Slf4j
public class S2760 {

    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int len = nums.length;
        if (len == 1) {
            if (nums[0] % 2 == 0) return 1;
            else return 0;
        }
        int left = 0;
        while (left < len) {
            if (nums[left] % 2 != 0) {
                left++;
                continue;
            }
            left++;
        }

        return -1;
    }

    public int longestAlternatingSubarrayCopy(int[] nums, int threshold) {
        int res = 0, dp = 0;
        for (int l = nums.length - 1; l >= 0; l--) {
            if (nums[l] > threshold) {
                dp = 0;
            } else if (l == nums.length - 1 || nums[l] % 2 != nums[l + 1] % 2) {
                dp++;
            } else {
                dp = 1;
            }
            if (nums[l] % 2 == 0) {
                res = Math.max(res, dp);
            }
        }
        return res;
    }
}
