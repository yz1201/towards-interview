package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2021/12/21 9:12
 */
@Slf4j
public class RemoveDuplicatesTask {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates(nums));

    }

    public static int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len == 0)
            return 0;
        int fast = 1;
        int slow = 1;
        while (fast < len) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow++] = nums[fast];
            }
            ++fast;
        }
        return slow;
    }

    public static int removeDuplicates1(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        return slow;
    }
}
