package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.OptionalInt;

/**
 * @Author: yz1201
 * @Date: 2021/12/31 10:06
 */
@Slf4j
public class MajorityElementTask {

    public static void main(String[] args) {
        int[] nums = {1,3,1 ,3, 2,3,2};
        System.out.println(findMajorityElementCopy(nums));
    }

    public static int findMajorityElement(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> counter = new HashMap<>(len);

        for (int i = 0; i < len; i++) {
            int count = 1;
            if (counter.containsKey(nums[i])) {
                continue;
            }
            counter.put(nums[i], count);
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    counter.put(nums[i], ++count);
                }
            }
        }
        System.out.println(counter);
        OptionalInt max = counter.values().stream().mapToInt(Integer::intValue).max();
        return max.isEmpty() ? -1 : max.getAsInt();
    }

    public static int findMajorityElement1(int[] nums) {
        int len = nums.length;
        Map<Integer, Integer> counter = new HashMap<>(len);

        for (int i = 0; i < len; i++) {
            int count = 1;
            if (counter.containsKey(nums[i])) {
                continue;
            }
            counter.put(nums[i], count);
            for (int j = i + 1; j < len; j++) {
                if (nums[i] == nums[j]) {
                    counter.put(nums[i], ++count);
                }
            }
        }
        int max = 0;
        for (Integer value : counter.values()) {
            max = Math.max(max,value);
        }
        for (Integer integer : counter.keySet()) {
            if (counter.get(integer) == max){
                return integer;
            }
        }
        return -1;
    }

    public static int findMajorityElementCopy(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }
}
