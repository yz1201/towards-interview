package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/3/2 15:41
 */
@Slf4j
public class DoMaximumProduct {
    public static void main(String[] args) {
        int[] nums = {-5, 8, 1, 2, 3};
        System.out.println(maximumProduct1(nums));
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        return Math.max(nums[len - 1] * nums[len - 2] * nums[len - 3], nums[len - 1] * nums[0] * nums[1]);
    }


    public static int maximumProduct1(int[] nums) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < len; i++) {
            int a = nums[i];
            for (int i1 = i + 1; i1 < len; i1++) {
                int b = nums[i1];
                for (int i2 = i1 + 1; i2 < len; i2++) {
                    int c = nums[i2];
                    System.out.println(a + "-" + b + "-" + c);
                    max = Math.max(a * b * c, max);
                }
            }

        }
        return max;
    }
}
