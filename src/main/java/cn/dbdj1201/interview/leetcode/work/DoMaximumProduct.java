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

    }

    public  static int maximumProduct(int[] nums) {
        int len = nums.length;
        if (len ==3) return nums[0]*nums[1]*nums[2];

        Arrays.sort(nums);

        int zeroIndex =0;
        for (int i = 0; i < len; i++) {
            if (nums[i] ==0){
                zeroIndex = i;
            }
        }



        return -1;
    }
}
