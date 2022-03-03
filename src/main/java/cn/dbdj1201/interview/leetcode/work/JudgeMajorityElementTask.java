package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2022/3/3 20:51
 */
@Slf4j
public class JudgeMajorityElementTask {

    public static void main(String[] args) {
        int[] nums = {5, 10, 1, 1};
        System.out.println(isMajorityElement(nums, 1));
    }

    public static boolean isMajorityElement(int[] nums, int target) {
        int len = nums.length;
        Map<Integer, Integer> map = new HashMap<>(len);
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return map.getOrDefault(target,0) * 2 > len;
    }
}
