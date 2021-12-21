package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2021/12/21 13:48
 */
@Slf4j
public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] nums = {1, 2};
        log.info("the answer is {}", searchInsertLast(nums, 2));

        int a = 1024;
        int b = 0;
        int ans;
        ans = (a - b) >> 1 + 1;
        System.out.println(ans);
    }

    public int searchInsert(int[] nums, int target) {
        int len = nums.length;
        if (target <= nums[0]) {
            return 0;
        } else if (target > nums[len - 1]) {
            return len;
        } else if (target == nums[len - 1]) {
            return len - 1;
        } else {
            int left = 0;
            int right = len;
            int index = len / 2;
            while (left < right) {

                if (target < nums[right]) {
//                    searchInsert(0,target);
                }

            }

        }

        return -1;
    }

    public int searchInsert1(int[] nums, int target) {

        //[1,2,3,4,7,9] 6
        int len = nums.length;
        int left = 0;
        int right = len;
        int mid = len / 2;

        while (mid != 0) {

            if (nums[mid] < target) {
                left = mid;
            }

            mid /= 2;
        }


        return -1;
    }

    public static int searchInsert2(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static int searchInsertLast(int[] nums, int target) {
        int len = nums.length;
        int left = 0, right = len - 1;
        int ans = len;

        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
