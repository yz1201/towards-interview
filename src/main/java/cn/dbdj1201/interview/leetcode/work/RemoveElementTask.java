package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2021/12/21 9:29
 */
@Slf4j
public class RemoveElementTask {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(removeElement(nums, 1));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        if (len == 0) {
            return 0;
        } else if (len == 1) {
            if (nums[0] != val) {
                return 1;
            } else {
                return 0;
            }
        }

        int index = 0;
        int slow = 0;
        while (index < len) {
           if (nums[index] != val){
               nums[slow++] =nums[index];
           }
           index++;
        }
        return slow;
    }


    public static  int removeElement1(int[] nums , int val){
        int left = 0;
        int right = nums.length;
        while (left < right) {
            if (nums[left] == val) {
                nums[left] = nums[right - 1];
                right--;
            } else {
                left++;
            }
        }
        return left;

    }
}
