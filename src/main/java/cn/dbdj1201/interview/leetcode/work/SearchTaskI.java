package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/3/22 14:37
 */
@Slf4j
public class SearchTaskI {

    public static void main(String[] args) {
        int[] nums = {1,3,6,7,8,9,12,124};
        System.out.println(searchCopy(nums,9));
    }

    public static int search(int[] nums, int target) {


        return -1;
    }

    public static int searchCopy(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = (high - low) / 2 + low;
            int num = nums[mid];
            if (num == target) {
                return mid;
            } else if (num > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
