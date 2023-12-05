package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2023/12/5 10:53
 */
@Slf4j
public class S1464 {

    public int maxProduct(int[] nums) {
        int len = nums.length;
        Arrays.sort(nums);
        return (nums[len - 1] - 1) * (nums[len - 2] - 1);
    }


    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;
        if (flag1 || flag2 && flag3) System.out.println("??");


    }
}
