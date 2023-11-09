package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/6/26 9:07
 */
@Slf4j
public class S2485 {

    public int pivotInteger(int n) {
        if (n == 1) return 1;
        if (n == 2) return -1;
        int x = 2;
        while (x <= n) {
            int sum = sumArea(1, x);
            int sum2 = sumArea(x, n);
            if (sum == sum2) return x;
            x++;
        }
        return -1;
    }

    private int sumArea(int start, int end) {
        int sum = 0;
        while (start <= end) {
            sum += start;
            start++;
        }

        return sum;
    }
}
