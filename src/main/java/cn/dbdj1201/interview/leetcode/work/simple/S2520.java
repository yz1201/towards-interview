package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/10/26 10:48
 */
@Slf4j
public class S2520 {

    public int countDigits(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        int res = 0;
        for (char aChar : chars) {
            int n = Integer.parseInt(String.valueOf(aChar));
            if (num % n == 0) res++;
        }
        return res;
    }
}
