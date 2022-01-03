package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2022/1/3 17:07
 */
@Slf4j
public class ContainsDuplicatesTask {

    public static void main(String[] args) {
//        Map<String,String> map = new HashMap<>();
//        System.out.println(map.put("5", "2"));
//        System.out.println(map.put("1", "4"));
//        System.out.println(map.put("2", "1241"));
//        System.out.println(map.put("2", "1"));

        int[] nums = {1, 0, 1, 1};
        System.out.println(containsNearbyDuplicate(nums, 1));
    }

    public static boolean containsDuplicate(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[j] == nums[i]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsDuplicate1(int[] nums) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int num : nums) {
            if (deque.contains(num)) {
                return true;
            } else {
                deque.push(num);
            }

        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        for (int i = 0; i < len - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicateCopy(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[j] == nums[i] && j - i <= k) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsNearbyDuplicateCopy(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
