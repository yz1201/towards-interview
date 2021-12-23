package cn.dbdj1201.interview.algorithm.sort;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2021/12/22 14:27
 */
@Slf4j
public class BubblingSort {

    public static void main(String[] args) {
        int[] nums = {1, 7, 2, 5, 9, 3, 6, 4};
        System.out.println(Arrays.toString(bubblingSort(nums)));
    }

    public static int[] bubblingSortFake(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }

    public static int[] bubblingSort(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[j - 1] > nums[j]) {
                    int temp = nums[j - 1];
                    nums[j - 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }
}
