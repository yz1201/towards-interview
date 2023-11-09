package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author: yz1201
 * @Date: 2023/4/13 9:14
 */
@Slf4j
public class S2404 {

    public int mostFrequentEven(int[] nums) {
        Arrays.sort(nums);
        Map<Integer, Integer> numMap = new TreeMap<>();
        for (int num : nums) {
            if (num % 2 == 0)
                numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] % 2 == 0){
//                numMap.put(nums[i], numMap.getOrDefault(nums[i], 0) + 1);
//            }
//        }

        int min = -1;
        int minVal = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if (entry.getValue() > minVal){
                minVal = entry.getValue();
                min = entry.getKey();
            }
        }
        return min;
    }
}
