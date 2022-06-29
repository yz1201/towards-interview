package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * @Author: yz1201
 * @Date: 2022/6/29 9:47
 */
@Slf4j
public class ThreeSumClosest {

    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();
        map.put(1, "s");
        map.put(2, "s");
        map.put(3, "s");
        map.put(4, "s");
        map.put(-5, "s");
        map.put(-15, "s");
        map.put(-555, "s");
        map.put(35, "s");
//        System.out.println(map);

        int[] nums = {-1,2,1,-4};
        System.out.println(threeSumClosestV1(nums, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        if (len <= 3) {
            return Arrays.stream(nums).sum();
        }
        int min = Integer.MAX_VALUE;
        Map<Integer, List<Integer>> resMap = new HashMap<>();

        for (int i = 0; i < len; i++) {

            for (int j = i + 1; j < len; j++) {

                for (int o = j + 1; o < len; o++) {
                    int gap = Math.abs(nums[i] + nums[j] + nums[o] - target);
                    if (gap < min) {
                        resMap.put(gap, List.of(nums[i], nums[j], nums[o]));
                        min = gap;
                    }
                }
            }
        }
        System.out.println(min);
        System.out.println(resMap);
        return resMap.get(min).stream().mapToInt(Integer::intValue).sum();
    }

    public static int threeSumClosestV1(int[] nums, int target) {
        int len = nums.length;
        if (len <= 3) {
            return Arrays.stream(nums).sum();
        }
        int min = Integer.MAX_VALUE;
        int minSum = Integer.MAX_VALUE;
        for (int i = 0; i < len; i++) {

            for (int j = i + 1; j < len; j++) {

                for (int o = j + 1; o < len; o++) {
                    int sum = nums[i] + nums[j] + nums[o];
                    int gap = Math.abs(sum - target);
                    if (gap < min) {
                        min = gap;
                        System.out.println(min);
                        minSum = sum;
                    }
                }
            }
        }
        return minSum;

    }

    public static int threeSumClosestV2(int[] nums, int target){
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int ans = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int start = i + 1;
            int end = len - 1;
            while (start < end) {
                int value = nums[i] + nums[start] + nums[end];
                if (value == target) {
                    return value;
                }
                if (Math.abs(value - target) < min) {
                    min = Math.abs(value - target);
                    ans = value;
                }
                if (value > target) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return ans;
    }
}
