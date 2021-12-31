package cn.dbdj1201.interview.leetcode.work;

import cn.dbdj1201.interview.leetcode.bitcal.IntegerReverse;
import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2021/12/30 14:43
 */
@Slf4j
public class TwoSumTaskII {

    public static void main(String[] args) {
//        int[] nums = {0, 1, 2, 3, 4, 10};
//        int[] nums = {2,7,11,15};
        int[] nums = {-1, 0};
        int target = -1;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int[] targetIndex = new int[2];
        int left = 0, right = len - 1;
        while (left < right) {
            while (numbers[right] > target) {
                right--;
            }

            if (numbers[left] + numbers[right] < target) {
                left++;
            } else if (numbers[left] + numbers[right] > target) {
                targetIndex[0] = -1;
                targetIndex[1] = -1;
                break;
            } else {
                targetIndex[0] = ++left;
                targetIndex[1] = ++right;
                break;
            }
        }
        return targetIndex;
    }

    public static int[] twoSum1(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                return new int[]{++left, ++right};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
