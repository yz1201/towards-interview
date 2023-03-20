package cn.dbdj1201.interview.test.simple;

import cn.dbdj1201.interview.leetcode.work.simple.Q2389;

import java.util.Arrays;

/**
 * @Author: yz1201
 * @Date: 2023/3/17 16:19
 */
public class T2389 {

    public static void main(String[] args) {
        int[] nums = {4,5,2,1};
        int[] nums1 = {21};
        Q2389 q2389 = new Q2389();
//        q2389.binarySearch();
        System.out.println(Arrays.toString(q2389.answerQueriesCopy(nums, nums1)));
    }

}
