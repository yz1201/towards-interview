package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/1/24 14:29
 */
@Slf4j
public class CheckPerfectNumberTask {

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(8128));
    }

    public static boolean checkPerfectNumber(int num) {
        int n = 1;
        int sum = 0;
        while (n < num) {
            if (num % n == 0)
                sum += n;
            n++;
        }
        return sum == num;
    }
}