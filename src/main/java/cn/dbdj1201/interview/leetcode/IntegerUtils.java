package cn.dbdj1201.interview.leetcode;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/7/5 16:54
 */
@Slf4j
public class IntegerUtils {

    /**
     * judge two number sum is overflow
     *
     * @param x
     * @param y
     * @return true integer overflow
     */
    public static boolean isOverflow(int x, int y) {
        int sum = x + y;
        return ((x ^ sum) & (y ^ sum)) < 0;
    }
}
