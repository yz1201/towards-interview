package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/2/28 8:37
 */
@Slf4j
public class FindMaxAsecondNumTask {

    public static void main(String[] args) {
        int[] nums = {3,2,1,4,6};
        System.out.println(maxAscendingSumCopy(nums));
    }

    public static int maxAscendingSumCopy(int[] nums) {
        int res = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) max += nums[i];
            else max = nums[i];
            res = Math.max(res, max);
        }
        return res;
    }
}
