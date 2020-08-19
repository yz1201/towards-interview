package cn.dbdj1201.interview.problems;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: dbdj1201
 * @Date: 2020-08-17 16:43
 */
@Slf4j
public class Prob14 {

    public static void main(String[] args) {
        /*
             面试题 14 ：调整数组顺序使奇数位于偶数前面
        题目：输入一个整数数组，实现一个函数来调整该函数数组中数字的顺序，使得
        所有奇数位于数组的前半部分，所有的数组位于数组的后半部分。
        */
        int[] nums = {1, 2, 3, 4};
//        test2(nums);
        test(nums);
    }

    private static void test(int[] nums) {
        int len = nums.length;
        int[] sortedNums = new int[len];

        int left = 0;
        int right = len - 1;

        int index =0;
        while (index < len) {
            if (nums[index] % 2 == 0) {
                sortedNums[right] = nums[index];
                log.info("add num right-{}", nums[index]);
                right--;
            } else {
                sortedNums[left] = nums[index];
                left++;
                log.info("add num left -{}", nums[index]);
            }
//            right--;
            index++;
        }

        System.out.println(Arrays.toString(sortedNums));

    }

    private static void test2(int[] nums) {
        int len = nums.length;
        int[] odds = new int[len];
        int[] edds = new int[len];
        int oddIndex = 0;
        int eddIndex = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                odds[oddIndex++] = num;
            } else {
                edds[eddIndex++] = num;
            }
        }
        int[] result = new int[len];
        System.arraycopy(edds, 0, result, 0, eddIndex);
        System.arraycopy(odds, 0, result, eddIndex, oddIndex);

        System.out.println(Arrays.toString(result));

    }

}
