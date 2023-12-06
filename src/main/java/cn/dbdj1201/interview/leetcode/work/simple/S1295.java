package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2023/12/6 13:58
 */
@Slf4j
public class S1295 {

    public int findNumbers(int[] nums) {
        return (int)Arrays.stream(nums).asLongStream().mapToObj(String::valueOf)
                .filter(num -> num.length() % 2 == 0).mapToInt(Integer::parseInt).count();
    }

    public int findNumbersV1(int[] nums) {
        int count =0 ;
        for (int num : nums) {
            if (String.valueOf(num).length() % 2 ==0) count++;
        }
        return count;
    }
}
