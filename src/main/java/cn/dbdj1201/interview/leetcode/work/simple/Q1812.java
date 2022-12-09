package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/12/8 15:22
 */
@Slf4j
public class Q1812 {
    public boolean squareIsWhite(String coordinates) {
        String zero = "a1";
        int distance = coordinates.charAt(0) - zero.charAt(0) + coordinates.charAt(1) - zero.charAt(1);
        return distance % 2 != 0;
    }
}
