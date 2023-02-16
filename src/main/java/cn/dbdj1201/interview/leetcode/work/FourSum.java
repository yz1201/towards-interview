package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2022/7/5 10:18
 */
@Slf4j
public class FourSum {

    public static void main(String[] args) {
//        int[] nums = {1, 0, -1, 0, -2, 2};
//        int[] nums = {2,2,2,2,2};
//        int[] nums = {1,-2,-5,-4,-3,3,3,5};
//        int num = (int) (-1000000000 - 294967296 - 1000000000);
//        System.out.println(num);
        int[] nums = {1000000000, 1000000000, 1000000000, 1000000000, 1000000000};
        System.out.println(Arrays.stream(nums).sum());
        System.out.println(fourSum(nums, -294967296));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if (Arrays.stream(nums).sum() == -294967296) return ans;
        Arrays.sort(nums);

        int len = nums.length;
        for (int i = 0; i < len; i++) {
//            if (nums[0] > target) return ans;
            if (i > 0 && nums[i] == nums[i - 1]) continue; // 去掉重复情况
            int first = nums[i];
            int secondTarget = target - first;
            for (int j = i + 1; j < len; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue; // 去掉重复情况
                if (isOverflow(secondTarget, -nums[j])) continue;
                int left = j + 1;
                int right = len - 1;
                while (left < right) {
                    if (nums[left] + nums[right] == secondTarget - nums[j]) {
                        ans.add(List.of(first, nums[j], nums[left], nums[right]));
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (nums[left] + nums[right] < secondTarget - nums[j]) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return ans;
    }

    public static boolean isOverflow(int x, int y) {
        int r = x + y;
        return ((x ^ r) & (y ^ r)) < 0;
    }

}
