package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Author: yz1201
 * @Date: 2023/2/16 14:27
 */
@Slf4j
public class Q2341 {

    public int[] numberOfPairs(int[] nums) {
        int[] ans = new int[2];
        int len = nums.length;
        if (len == 1) {
            ans[1] = 1;
            return ans;
        }
        Map<Integer, Integer> pairsCounter = new HashMap<>();
        for (int num : nums) {
            pairsCounter.put(num, pairsCounter.getOrDefault(num, 0) + 1);
        }
        int pairsCount = 0;
        int singleDogNum = 0;
        for (Integer count : pairsCounter.values()) {
            if (count % 2 != 0) {
                singleDogNum++;
            }
            pairsCount += count / 2;
        }
        ans[0] = pairsCount;
        ans[1] = singleDogNum;
        return ans;
    }

    public int[] numberOfPairsCopy(int[] nums) {
        Map<Integer, Boolean> cnt = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            cnt.put(num, !cnt.getOrDefault(num, false));
            if (!cnt.get(num)) {
                res++;
            }
        }
        return new int[]{res, nums.length - 2 * res};
    }

}
