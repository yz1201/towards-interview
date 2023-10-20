package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: yz1201
 * @Date: 2023/10/19 8:52
 */
@Slf4j
public class M1726 {

    public int tupleSameProduct(int[] nums) {
        // 1 2 5 10
        for (int i = 0; i < nums.length; i++) {

            for (int i1 = 0; i1 < nums.length; i1++) {



            }

        }





        return 0;
    }

    public int tupleSameProductCopy(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                int key = nums[i] * nums[j];
                cnt.put(key, cnt.getOrDefault(key, 0) + 1);
            }
        }
        int ans = 0;
        for (Integer v : cnt.values()) {
            ans += v * (v - 1) * 4;
        }
        return ans;
    }

}
