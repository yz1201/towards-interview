package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2023/11/24 9:37
 */
@Slf4j
public class S2824 {

    public int countPairs(List<Integer> nums, int target) {
        int count = 0;
        int size = nums.size();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (nums.get(i) + nums.get(j) < target) count++;
            }
        }
        return count;
    }
}
