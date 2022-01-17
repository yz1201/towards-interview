package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/1/17 15:52
 */
@Slf4j
public class MoveZerosTask {

    public static void main(String[] args) {
//        int[] nums = {0, 1, 0, 3, 12};
        int[] nums = {0,1,1,0,1};
        moveZeroesCopy(nums);
    }

    /*
        输入: [0,1,0,3,12]
        输出: [1,3,12,0,0]
     */
    public static void moveZeroes(int[] nums) {
        int len = nums.length;
        int zeroIndex = 0;
        int right = len - 1;
        while (zeroIndex < right) {
            while (nums[zeroIndex] != 0) {
                zeroIndex++;
            }

            int temp = nums[right];
            nums[right] = 0;
            nums[zeroIndex] = temp;
            right--;
        }
    }

    public static void moveZeroes1(int[] nums) {
        int len = nums.length;
        int[] target = new int[len];
        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                target[index++] = num;
                System.out.println(index + " -- " + num);
            }
        }
        nums = target;
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes2(int[] nums) {
        int len = nums.length;
        int replaceIndex = 0;
        for (int i = 0; i < len && replaceIndex < len; i++) {
            while (nums[i] != 0) {
                i++;
            }

            int zeroIndex = i;
            replaceIndex = i;
            if (replaceIndex == len) {
                return;
            }
            System.out.println(i);
            try {
                while (nums[replaceIndex] == 0) {
                    replaceIndex++;
                }

                int temp = nums[replaceIndex];
                nums[zeroIndex] = temp;
                nums[replaceIndex++] = 0;
            } catch (Exception e) {

            }


        }

        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes3(int[] nums) {
        int len = nums.length;
        int replaceIndex = 0;
        int i = 0;
        while (i < len && replaceIndex < len) {
            while (i < len && nums[i] != 0) {
                i++;
            }
            int zeroIndex = i;
            replaceIndex = i;
            while (replaceIndex < len && nums[replaceIndex] == 0) {
                replaceIndex++;
            }
            if (replaceIndex < len) {
                int temp = nums[replaceIndex];
                nums[zeroIndex] = temp;
                nums[replaceIndex++] = 0;
            }
            i++;
        }


        System.out.println(Arrays.toString(nums));
    }


    public static void moveZeroesCopy(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
//                swap(nums, left, right);
                nums[left++] = nums[right];
            }
            right++;
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }


}
