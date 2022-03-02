package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2022/3/2 15:15
 */
@Slf4j
public class FindDominantIndexTask {

    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        System.out.println(dominantIndex(nums));


    }

    public static int dominantIndex(int[] nums) {
        int len = nums.length;
        if (len <= 1) return 0;
        Map<Integer,Integer> indexMap = new HashMap<>(len);

        for (int i = 0; i < len; i++) {
            //index - value
            indexMap.put(i,nums[i]);
        }

        Arrays.sort(nums);
        int ans;
        try {
            ans = nums[len - 1] / nums[len - 2];
        } catch (Exception e) {
            ans = 2;
        }
        int maxIndex= 0;
        for (Map.Entry<Integer, Integer> integerIntegerEntry : indexMap.entrySet()) {
            if (nums[len-1] == integerIntegerEntry.getValue())
                maxIndex = integerIntegerEntry.getKey();
        }
        return ans >= 2 ? maxIndex : -1;
    }
}
