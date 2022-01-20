package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/1/20 10:38
 */
@Slf4j
public class HammingDistanceTaskII {

    public static void main(String[] args) {

    }

    private static int hammingSolution(int x, int y){
        return Integer.bitCount(x^y);
    }
}
