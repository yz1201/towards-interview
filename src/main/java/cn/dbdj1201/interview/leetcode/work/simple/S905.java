package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yz1201
 * @Date: 2024/1/9 16:24
 */
@Slf4j
public class S905 {

    public int[] sortArrayByParity(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int j : nums) {
            if (j % 2 == 0) {
                res.add(j);
            }
        }
        for (int num : nums) {
            if (num % 2 != 0) {
                res.add(num);
            }
        }
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}
