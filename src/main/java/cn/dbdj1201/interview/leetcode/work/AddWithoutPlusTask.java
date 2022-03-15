package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

/**
 * @Author: yz1201
 * @Date: 2022/3/15 14:06
 */
@Slf4j
public class AddWithoutPlusTask {

    public static void main(String[] args) {
        int a = 2;
        int b =1;
        System.out.println(add(a, b));
    }

    public static int add(int a, int b) {

        int m = a ^ b; //不进位加法
        int n = (a & b) << 1; //进位

        while (n != 0) {
            int temp = n ^ m;
            n = (m & n) << 1;
            m = temp;
        }
        return m;
    }
}
