package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/3/18 10:50
 */
@Slf4j
public class JudgePowerOfThree {
    public static void main(String[] args) {

        System.out.println(isPowerOfThreeCopy(45));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1) return true;
        boolean flag = true;
        for (int i = 2; i < 10; i++) {
            if (i != 3 && i != 9) {
                if (n % i == 0)
                    flag = false;
            }
        }
        return n % 3 == 0 && flag;
    }

    public static boolean isPowerOfThree1(int n) {
        int len = n / 2;
        for (int i = 0; i < len; i++) {
            if (Math.pow(3, i) == n) return true;
        }
        return false;
    }


    public static boolean isPowerOfThree2(int n) {

        return false;
    }

    public static boolean isPowerOfThreeCopy(int n) {
        while (n != 0 && n % 3 == 0) {
            n /= 3;
        }
        return n == 1;
    }

}