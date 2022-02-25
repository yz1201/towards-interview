package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2022/2/25 14:03
 */
@Slf4j
public class FindMissingNumberTask {

    public static void main(String[] args) {
//        int[] nums = {0, 1, 2, 4};
        int[] nums = {0,1,3};
        System.out.println(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : nums) {
            numMap.put(num, 1);
        }

        for (int i = 0; i <= n; i++) {
            if (numMap.get(i) == null)
                return i;
        }
        return -1;
    }
}
