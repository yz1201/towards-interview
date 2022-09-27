package cn.dbdj1201.interview.test;

import cn.dbdj1201.interview.leetcode.work.simple.Q1636;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2022/9/19 16:48
 */
public class T1636 {
    public static void main(String[] args) {
        Q1636 q1636 = new Q1636();

        int[] nums = {1,1,2,2,2,3};
        System.out.println(Arrays.toString(q1636.frequencySort(nums)));
    }
}
