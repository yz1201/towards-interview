package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/1/22 21:22
 */
@Slf4j
public class FindErrorNumsTask {

    public static void main(String[] args) {
        int[] nums = {2,2,3,4,5};
        System.out.println(Arrays.toString(findErrorNumsCopy(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i-1]){
                return new int[]{nums[i],nums[i]+1};
            }
        }
        return null;
    }

    public static int[] findErrorNumsCopy(int[] nums) {
        int[] errorNums = new int[2];
        int n = nums.length;
        Arrays.sort(nums);
        int prev = 0;
        for (int curr : nums) {
            if (curr == prev) {
                errorNums[0] = prev;
            } else if (curr - prev > 1) {
                errorNums[1] = prev + 1;
            }
            prev = curr;
        }
        if (nums[n - 1] != n) {
            errorNums[1] = n;
        }
        return errorNums;
    }

}
