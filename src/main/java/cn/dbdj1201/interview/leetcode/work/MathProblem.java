package cn.dbdj1201.interview.leetcode.work;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @Author: yz1201
 * @Date: 2022/4/21 15:23
 */
@Slf4j
public class MathProblem {
    public static void main(String[] args) {
        int[] a1 = {1,2};
        int[] a2 = {3,4};
        System.out.println(findMedianSortedArrays(a1, a2));
        double a = 5;
        System.out.println(a/2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ansArr = IntStream.concat(Arrays.stream(nums1), Arrays.stream(nums2)).sorted().toArray();
        int len = ansArr.length;
        double ans = 0;
        double two = 2;
        if (len % 2 == 0) {
            ans =  (ansArr[len / 2 - 1] + ansArr[len / 2]) / two;
        } else {
            ans = ansArr[len / 2];
        }
        return ans;
    }
}
