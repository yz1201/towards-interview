package cn.dbdj1201.interview.leetcode.work.middle;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2023/4/6 9:14
 */
@Slf4j
public class M1017 {

    public String baseNeg2(int n) {
        if (n == 0) return "0";
        String s = Integer.toBinaryString(n);
        int len = s.length();
        double sum = 0;
        for (int i = len; i > 0; i--) {
            sum += Math.pow(-2D, len - 1);
        }
        return sum + "";
    }

    public String baseNeg2V1(int n) {
        if (n == 0) return "0";
        int index = 0;

        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (sum != n) {
            double pow = Math.pow(-2D, index++);
            if (pow == n) {
                for (int i = index; i > 0; i--) {
                    if (i == index) sb.append(1);
                    else sb.append(0);
                }
            }
            sum += pow;
        }
        return null;
    }

    public String baseNeg2Copy(int n) {
        if (n == 0 || n == 1) {
            return String.valueOf(n);
        }
        StringBuilder res = new StringBuilder();
        while (n != 0) {
            int remainder = n & 1;
            res.append(remainder);
            n -= remainder;
            n /= -2;
        }
        return res.reverse().toString();
    }

}
