package cn.dbdj1201.interview.leetcode.bitcal;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2021/6/17 15:54
 */
public class SingleNumber {

    /*
    给定一个整数数组，这个数组里只有一个数次出现了一次，其余数字出现了两次，求这个只
出现一次的数字。
     */

    public static void calTimes(int[] arr) {
        int ans = Arrays.stream(arr).reduce(0, (a, b) -> a ^ b);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};
        calTimes(arr);
    }
}
