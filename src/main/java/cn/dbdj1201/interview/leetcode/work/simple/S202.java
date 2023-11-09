package cn.dbdj1201.interview.leetcode.work.simple;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author: yz1201
 * @Date: 2023/4/11 15:54
 */
@Slf4j
public class S202 {

    public boolean isHappy(int n) {
        if (n == 1) return true;
        int sum = 0;
        while (sum != 1) {
            sum = 0;
            while (n / 10 != 0) {
                int num = n % 10;
                sum += Math.pow(num, 2);
                n /= 10;
            }
            n = sum;
        }
        return true;
    }

    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            n = n / 10;
            totalSum += d * d;
        }
        return totalSum;
    }

    public boolean isHappyCopy(int n) {
        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

}
