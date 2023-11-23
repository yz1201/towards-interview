package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/11/23 14:53
 */
@Slf4j
public class S1137 {

    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;
        int res = 0;
        if (n > 2){


        }
        return -1;
    }

    public int tribonacciCopy(int n) {
        if (n == 0) {
            return 0;
        }
        if (n <= 2) {
            return 1;
        }
        int p, q = 0, r = 1, s = 1;
        for (int i = 3; i <= n; ++i) {
            p = q;
            q = r;
            r = s;
            s = p + q + r;
        }
        return s;
    }

    int[] cache = new int[40];
    public int tribonacciCopy1(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        if (cache[n] != 0) return cache[n];
        cache[n] = tribonacciCopy1(n - 1) + tribonacciCopy1(n - 2) + tribonacciCopy1(n - 3);
        return cache[n];
    }

    public int tribonacciCopy2(int n) {
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return tribonacciCopy1(n - 1) + tribonacciCopy1(n - 2) + tribonacciCopy1(n - 3);
    }

}
