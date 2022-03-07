package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/3/7 14:07
 */
@Slf4j
public class MinPairsSumTask {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 99,100};
    }

    public static int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int left = 0; int right = len-1;

        while (left <right){
//            if (nums[left] + nums[right] )
//                public int minPairSum(int[] nums) {
//
//            }
        }
        return -1;
    }


    public static int minPairSumCopy(int[] nums) {
        int len = nums.length;
        int res = 0;
        Arrays.sort(nums);
        for (int i = 0; i < len / 2; ++i) {
            res = Math.max(res, nums[i] + nums[len - 1 - i]);
        }
        return res;
    }

}
