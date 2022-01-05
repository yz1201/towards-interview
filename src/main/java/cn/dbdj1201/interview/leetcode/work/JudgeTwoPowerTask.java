package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/1/5 10:17
 */
@Slf4j
public class JudgeTwoPowerTask {

    public static void main(String[] args) {
//        System.out.println(Math.pow(1, 0.5));
        System.out.println(isPowerOfTwo1(1));
    }

    public static boolean isPowerOfTwo(int n) {
//        return Math.log();
        //应为log2N的对数是否为2;
        return Math.pow(n, 0.5) == 2;
    }

    public static boolean isPowerOfTwo1(int n) {
        int index = 0;
        while (Math.pow(2, index) <= n) {
            if ((int) Math.pow(2, index) == n) {
                return true;
            }
            index++;
        }
        return false;
    }
}
