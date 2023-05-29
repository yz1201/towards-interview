package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2023/5/29 9:06
 */
@Slf4j
public class S2455 {

    public int averageValue(int[] nums) {

        int sum = 0;
        int count = 0;
        for (int num : nums) {
            if (num % 2 == 0 && num % 3 == 0) {
                sum += num;
                count++;
            }
        }
        return count != 0 ? sum / count : 0;
    }
}
